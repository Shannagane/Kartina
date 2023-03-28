package com.formation.kartina.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "vente")
@AllArgsConstructor
@NoArgsConstructor

public class Vente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String titre;

    private String miniature;

    private Date datedebut;

    private Date datefin;

    private Integer nbrOeuvre;

    private Integer prixVenteUnitaire;

    private String formatPhoto;

    private Integer nbrTirage;

    //@ManyToOne
    //@JoinColumn(name = "finition_id", referencedColumnName = "id")
    //private String finition;

    //@ManyToOne
    //@JoinColumn(name = "cadre_id", referencedColumnName = "id")
    //private String cadre;
}
