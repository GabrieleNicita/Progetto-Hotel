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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "Composizione")
public class Composizione {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_Composizione")
	private Integer idComposizione;
	
	private String tipoComp;
	private Integer nPersone;
	
	public Integer getnPersone() {
		return nPersone;
	}
	public void setnPersone(Integer nPersone) {
		this.nPersone = nPersone;
	}
	@OneToMany(mappedBy = "composizione",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
    private Set<TipoCamera> tipoCamera	 = new HashSet<>();
	
	public void setIdComposizione(Integer idComposizione) {
		this.idComposizione = idComposizione;
	}
	public Integer getIdComposizione() {
		return idComposizione;
	}
	
	public void setTipoComp(String tipoComp) {
		this.tipoComp = tipoComp;
	}
	public String getTipoComp() {
		return tipoComp;
	}
}
