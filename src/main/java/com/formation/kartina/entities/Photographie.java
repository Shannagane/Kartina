package com.formation.kartina.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "photographie")
@AllArgsConstructor
@NoArgsConstructor

public class Photographie {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (nullable = false)
    private String titre;

    //@OneToMany
    //@JoinColumn(name = "artiste_id", referencedColumnName = "id")
    //private String nom_artiste;

    @Column (nullable = false)
    private String miniature;

    //@OneToMany
    //@JoinColumn(name = "theme_id", referencedColumnName = "id")
    //private String themes;

    //@OneToMany
    //@JoinColumn(name = "orientation_id", referencedColumnName = "id")
    //private String orientation;

    //@OneToMany
    //@JoinColumn(name = "format_id", referencedColumnName = "id")
    //@Column (nullable = false)
    //private String format;

    //@OneToMany
    //@JoinColumn(name = "prix_id", referencedColumnName = "id")
    //@Column (nullable = false)
    //private Integer prix;

}
