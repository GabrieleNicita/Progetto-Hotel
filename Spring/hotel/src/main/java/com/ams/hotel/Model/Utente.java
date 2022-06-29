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
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table(name = "Utente")
public class Utente {
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @Column(name="id_Utente")
	  private Integer idUtente;
	  
	  private String nome;
	  private String cognome;
	  private String telefono;
	  private String email;
	  
	  @OneToMany(mappedBy = "utente",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
	    private Set<Richiesta> richiesta = new HashSet<>();
	  @OneToMany(mappedBy = "utente",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
	    private Set<Soggiorno> soggiorno = new HashSet<>();

//	  setGet cognome
	  public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	  public String getCognome() {
		return cognome;
	}
//	setGet nome  
	  public void setNome(String nome) {
		this.nome = nome;
	}
	  public String getNome() {
		return nome;
	}
//	  setGet email
	  public void setEmail(String email) {
		this.email = email;
	}
	  public String getEmail() {
		return email;
	}
//	  setGet id
	public Integer getIdUtente() {
		return idUtente;
	}
	public void setIdUtente(Integer idUtente) {
		this.idUtente = idUtente;
	}
//	setGet telefono  
	  public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	  public String getTelefono() {
		return telefono;
	}
	  
}
