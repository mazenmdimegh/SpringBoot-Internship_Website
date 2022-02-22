package com.example.demo.entities;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name = "Entrepreneur")
public class EntrepreneurEntity extends UserEntity {
	@Id
	private Integer id;
	private String societe;
	private String secteur ;
}
