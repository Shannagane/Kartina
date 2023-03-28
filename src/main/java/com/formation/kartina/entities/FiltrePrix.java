package com.formation.kartina.entities;

import jakarta.annotation.Generated;
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
@Table(name = "filtre_prix")
@AllArgsConstructor
@NoArgsConstructor

public class FiltrePrix {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Boolean prix1;

    private Boolean prix2;

    private Boolean prix3;

    private Boolean prix4;
}
