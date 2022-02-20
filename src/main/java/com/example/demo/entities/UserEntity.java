package com.example.demo.entities;

import java.sql.Date;

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

public class UserEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	private String nom;
	private String prenom;
	private String email;
	private String password;
	private Date datenaiss;
	private Integer ncin;
	private Integer tel;
	
	
	
}
