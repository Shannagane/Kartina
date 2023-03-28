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
@Table(name = "filtre_orientation")
@NoArgsConstructor
@AllArgsConstructor

public class FiltreOrientation {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Boolean portrait;

    private Boolean paysage;

    private Boolean carre;
    
    private Boolean panoramique;
}
