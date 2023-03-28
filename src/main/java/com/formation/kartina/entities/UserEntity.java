package com.formation.kartina.entities;

import com.formation.kartina.enums.CiviliteEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor

public class UserEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (nullable = false, length = 10)
    @Enumerated(EnumType.STRING)
    private CiviliteEnum civilite;

    @Column (nullable = false)
    private String nom;

    @Column (nullable = false)
    private String prenom;

    @Column (length = 20)
    private String telephone;

    @Column (nullable = false, length = 150)
    private String email;

    @Column (nullable = false)
    private String mdp;

    private String role = "USER";

    //@OneToMany 
    //@JoinColumn(name = "adresse_id", referencedColumnName = "id")
    //private Adresse adresse;
}