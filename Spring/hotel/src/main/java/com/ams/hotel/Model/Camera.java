package com.ams.hotel.Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity 
@Table(name = "Camera")
public class Camera {
	@JsonProperty("Ncamera")
	@Id
	@Column(name="id_Camera")
	private Integer numeroCamera;
	
	private String piano;
	
	@OneToMany(mappedBy = "camera",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
    private Set<Prenotazione> prenotazione = new HashSet<>();

	@JsonProperty("tipo")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_TipoCamera")
    private TipoCamera tipoCamera;
	
	public void setNumeroCamera(Integer numeroCamera) {
		this.numeroCamera = numeroCamera;
	}
	public Integer getNumeroCamera() {
		return numeroCamera;
	}
	
	public void setPiano(String piano) {
		this.piano = piano;
	}
	public String getPiano() {
		return piano;
	}
	
}
