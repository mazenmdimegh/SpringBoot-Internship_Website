package com.example.demo.entities;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Entrepreneur")

public class EntrepreneurEntity extends UserEntity {
	private String adress ;
	private String societe;
}