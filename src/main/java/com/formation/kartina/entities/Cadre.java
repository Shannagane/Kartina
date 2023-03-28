package com.formation.kartina.entities;

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
@Table(name = "cadre")
@AllArgsConstructor
@NoArgsConstructor

public class Cadre {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Boolean sansCadre;

    private Boolean cadreNoirSatin;

    private Boolean cadreBlancSatin;

    private Boolean cadreNoyer;

    private Boolean cadreChene;

    private Boolean boisBlanc;

    private Boolean acajouMat;

    private Boolean alluBrosse;
}
