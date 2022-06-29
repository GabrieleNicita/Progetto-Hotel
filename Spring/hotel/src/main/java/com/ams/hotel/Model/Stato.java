package com.ams.hotel.Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity 
@Table(name = "Stato")
public class Stato {
	@Id
	@Column(name="id_Stato")
	private Integer idStato;
	
	private String stato;
	
	@OneToMany(mappedBy = "stato",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
    private Set<Prenotazione> prenotazione = new HashSet<>();

	public Integer getIdStato() {
		return idStato;
	}
	
	public void setIdStato(Integer idStato) {
		this.idStato = idStato;
	}
	
	public void setStato(String stato) {
		this.stato = stato;
	}
	public String getStato() {
		return stato;
	}
}
