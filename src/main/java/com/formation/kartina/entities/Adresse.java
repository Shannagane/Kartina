package com.formation.kartina.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "adresse")
@NoArgsConstructor
@AllArgsConstructor

public class Adresse {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    private String rue;

    @Column (name = "code postal", length = 5)
    private String cp;

    private String ville;

    private String pays;

}
