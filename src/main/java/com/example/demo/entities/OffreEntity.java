package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import project.test.deco.Entity.Admin;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class OffreEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	private String titre;
	private String description;
	private String duree;
	private String lieu;
	private String service;
	private String categorie;
	private Date date;
}
