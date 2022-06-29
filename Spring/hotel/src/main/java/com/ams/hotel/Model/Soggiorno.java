package com.ams.hotel.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Soggiorni")
public class Soggiorno {
	@JsonProperty("idSoggiorno")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_Soggiorno")
	private Integer idSoggiorno;
	
	@JsonProperty("utente")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_Utente")
    private Utente utente;
	
	@JsonProperty("prenotazione")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_Prenotazione")
    private Prenotazione prenotazione;
	
	public Soggiorno() {};
	
	public Soggiorno(Utente utente,Prenotazione prenotazione) {
		this.utente=utente;
		this.prenotazione=prenotazione;
	};
	
	public void setIdSoggiorno(Integer idSoggiorno) {
		this.idSoggiorno = idSoggiorno;
	}
	public Integer getIdSoggiorno() {
		return idSoggiorno;
	}
	public Prenotazione getPrenotazione() {
		return prenotazione;
	}
}
