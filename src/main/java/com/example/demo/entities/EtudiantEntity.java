package com.example.demo.entities;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Etudiant")
public class EtudiantEntity extends UserEntity {
	private String faculte;
	private Integer promotion;
	private Integer  pj;
	private String etat;
}
