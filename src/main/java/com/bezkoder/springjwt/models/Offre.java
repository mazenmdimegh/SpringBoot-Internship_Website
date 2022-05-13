package com.bezkoder.springjwt.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Offre {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
		private String titre;
	@Lob
	@Column(name="CONTENT", length=512)
		private String description;
		private String duree;
		private String lieu;
		private String societe;
		private String service;
		private String categorie;
		private LocalDate date;
		private String Edate;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private String type;



	public String getEdate() {
		return Edate;
	}

	public void setEdate(String edate) {
		Edate = edate;
	}


		@ManyToMany
		public List<User> candidats;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDuree() {
		return duree;
	}

	public void setDuree(String duree) {
		this.duree = duree;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getSociete() {
		return societe;
	}

	public void setSociete(String societe) {
		this.societe = societe;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public List<User> getCandidats() {
		return candidats;
	}

	public void setCandidats(List<User> candidats) {
		this.candidats = candidats;
	}

	public Long getId_entrepreneur() {
		return id_entrepreneur;
	}

	public void setId_entrepreneur(Long id_entrepreneur) {
		this.id_entrepreneur = id_entrepreneur;
	}

	public Long id_entrepreneur;
}
