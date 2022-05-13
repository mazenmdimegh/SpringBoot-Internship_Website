package com.bezkoder.springjwt.models;

import lombok.AllArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@AllArgsConstructor
@Entity
@Table(	name = "users", 
		uniqueConstraints = { 
			@UniqueConstraint(columnNames = "username"),
			@UniqueConstraint(columnNames = "email") 
		})
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String faculte;
	private Integer promotion;
	private String gouvernorat;

	private Date datenaiss;
	private Integer ncin;



	private Integer tel;


	private String societe;

	@NotBlank
	@Size(max = 20)
	private String username;

	@NotBlank
	@Size(max = 50)
	@Email
	private String email;

	@NotBlank
	@Size(max = 120)
	private String password;

	@ManyToMany
	public List<Offre> MesOffres;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(	name = "user_MesCandidatures",
			joinColumns = @JoinColumn(name = "user_id"),
			inverseJoinColumns = @JoinColumn(name = "offre_id"))
	public List<Offre> MesCandidatures;


	public void addCandidature(Offre offre) {
		MesCandidatures.add(offre);
	}

	public List<Offre> getMesCandidature() {
		return MesCandidatures;
	}

	public void setMesCandidatures(List<Offre> mesCandidature) {
		MesCandidatures = mesCandidature;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(	name = "user_roles",
				joinColumns = @JoinColumn(name = "user_id"), 
				inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();

	public User() {
	}

	public List<Offre> getMesOffres() {
		return MesOffres;
	}

	public void setMesOffres(List<Offre> mesOffres) {
		MesOffres = mesOffres;
	}

	public User(String username, String email, String password, String faculte, Integer promotion, Integer ncin, Integer tel, String gouvernorat ) {
		this.username = username;
		this.email = email;
		this.password = password;
		this.faculte = faculte;
		this.promotion = promotion;
		this.gouvernorat = gouvernorat;
		this.ncin = ncin;
		this.tel = tel;
	}
	public User(String username, String email, String password,Integer ncin,Integer tel,String gouvernorat ,String societe) {
		this.username = username;
		this.email = email;
		this.password = password;
		this.gouvernorat = gouvernorat;
		this.societe = societe;
		this.ncin = ncin;
		this.tel = tel;
		this.societe = societe;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	public String getFaculte() {	return faculte;	}

	public void setFaculte(String faculte) {		this.faculte = faculte;	}

	public Integer getPromotion() {		return promotion;	}

	public void setPromotion(Integer promotion) {		this.promotion = promotion;	}

	public String getSociete() {		return societe;	}

	public void setSociete(String societe) {		this.societe = societe;}
	public String getGouvernorat() {
		return gouvernorat;
	}

	public void setGouvernorat(String gouvernorat) {
		this.gouvernorat = gouvernorat;
	}

	public Date getDatenaiss() {
		return datenaiss;
	}

	public void setDatenaiss(Date datenaiss) {
		this.datenaiss = datenaiss;
	}

	public Integer getNcin() {
		return ncin;
	}

	public void setNcin(Integer ncin) {
		this.ncin = ncin;
	}

	public Integer getTel() {
		return tel;
	}

	public void setTel(Integer tel) {
		this.tel = tel;
	}
}
