package com.ams.hotel.Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "Trattamento")
public class Trattamento {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_Trattamento")
	private Integer idTrattamento;
	
	private String tipo;
	private Double prezzo;
	
	@OneToMany(mappedBy = "trattamento")
    private Set<Prenotazione> richiesta = new HashSet<>();
	
	public void setIdTrattamento(Integer idTrattamento) {
		this.idTrattamento = idTrattamento;
	}
	public Integer getIdTrattamento() {
		return idTrattamento;
	}
	
	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}
	public Double getPrezzo() {
		return prezzo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
}
