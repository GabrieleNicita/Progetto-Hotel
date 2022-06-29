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
@Entity // This tells Hibernate to make a table out of this class
@Table(name = "Richiesta")
public class Richiesta {
	@JsonProperty("idRichiesta")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_Richiesta")
	private Integer idRichiesta;
	
	@JsonProperty("dataRichiesta")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	private Date dataRichiesta;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	private Date inizio;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	private Date fine;
	
	@JsonProperty("utente")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_Utente")
    private Utente utente;
   
	@JsonProperty("tipo")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_tipo")
    private TipoCamera tipo;
    
    @OneToMany(mappedBy = "richiesta",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
    private Set<Prenotazione> prenotazione = new HashSet<>();
    
    
//	setGet dataR
	public void setDataRichiesta(Date dataRichiesta) {
		this.dataRichiesta = dataRichiesta;
	}
	public Date getDataRichiesta() {
		return dataRichiesta;
	}
//	setGet idR
	public void setIdRichiesta(Integer idRichiesta) {
		this.idRichiesta = idRichiesta;
	}
	public Integer getIdRichiesta() {
		return idRichiesta;	
	}
	
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	public Utente getUtente() {
		return utente;
	}
	
	public Date getFine() {
		return fine;
	}
	public void setFine(Date fine) {
		this.fine = fine;
	}
	
	public Date getInizio() {
		return inizio;
	}
	public void setInizio(Date inizio) {
		this.inizio = inizio;
	}
	
	public TipoCamera getTipo() {
		return tipo;
	}
}
