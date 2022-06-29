package com.ams.hotel.Model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity 
@Table(name = "Prenotazioni")

public class Prenotazione {	
	@JsonProperty("idPrenotazione")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_Prenotazione")
	private Integer idPrenotazione;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date inizioPerno;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="dd-MM-yyy")
	private Date finePerno;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_Richiesta")
    private Richiesta richiesta;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_Stato")
    private Stato stato;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_Trattamento")
    private Trattamento trattamento;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_Camera")
    private Camera camera;
	
	@OneToMany(mappedBy = "prenotazione",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
    private Set<Soggiorno> soggiorno = new HashSet<>();
	
	public Prenotazione() {}
	
	public Prenotazione(Richiesta richiesta,Camera camera,Stato stato,Trattamento trattameto){
		this.richiesta=richiesta;
		this.inizioPerno=richiesta.getInizio();
		this.finePerno=richiesta.getFine();
		this.camera=camera;
		this.stato=stato;
		this.trattamento=trattameto;
	}
//	
	public void setFinePerno(Date finePerno) {
		this.finePerno = finePerno;
	}
//	
	public void setIdPrenotazione(Integer idPrenotazione) {
		this.idPrenotazione = idPrenotazione;
	}
//	
	public void setInizioPerno(Date inizioPerno) {
		this.inizioPerno = inizioPerno;
	}
//	
	public Date getFinePerno() {
		return finePerno;
	}
//	
	public Integer getIdPrenotazione() {
		return idPrenotazione;
	}
//	
	public Date getInizioPerno() {
		return inizioPerno;
	}
	
	public Stato getStato() {
		return stato;
	}
	
	public void setStato(Stato stato) {
		this.stato = stato;
	}
}
