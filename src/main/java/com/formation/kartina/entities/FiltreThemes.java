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
@Table(name = "filtre_themes")
@NoArgsConstructor
@AllArgsConstructor

public class FiltreThemes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Boolean femme;

    private Boolean nature;

    private Boolean nb;

    private Boolean paysage;

    private Boolean urban;

    private Boolean vintage;
    
    private Boolean voyage;

}
