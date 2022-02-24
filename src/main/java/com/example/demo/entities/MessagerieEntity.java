package com.example.demo.entities;

import javax.persistence.*;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class MessagerieEntity  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMessagerie;
    private Long idEmetteur;
    private Long idRecepteur;


}
