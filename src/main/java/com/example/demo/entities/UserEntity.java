package com.example.demo.entities;

import java.sql.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class UserEntity {
	@Id
    private Integer id;
	private String nom;
	private String prenom;
	private String email;
	private String password;
	private Date datenaiss;
	private Integer ncin;
	private Integer tel;
	
	
	
}
