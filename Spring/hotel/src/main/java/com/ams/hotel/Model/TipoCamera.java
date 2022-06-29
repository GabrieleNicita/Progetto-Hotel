package com.ams.hotel.Model;

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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "TipoCamera")
public class TipoCamera {
	@JsonProperty("idTipo")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_Tipo")
	private Integer idTipo;
	
	private String tipo;
	private double prezzo;
	
	@OneToMany(mappedBy = "tipoCamera",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
    private Set<Camera> camera	 = new HashSet<>();

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_Composizione")
    private Composizione composizione;
	
	public void setIdTipo(Integer idTipo) {
		this.idTipo = idTipo;
	}
	public Integer getIdTipo() {
		return idTipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public Composizione getComposizione() {
		return composizione;
	}
}
