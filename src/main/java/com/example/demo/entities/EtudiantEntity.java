package com.example.demo.entities;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Etudiant")
public class EtudiantEntity extends UserEntity {
	@Id
	private Integer id ;
	private String faculte;
	private Integer promotion;
	private Integer  pj;
	private String etat;
}
