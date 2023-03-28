package com.formation.kartina.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.websocket.Decoder.Text;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "artiste")
@AllArgsConstructor
@NoArgsConstructor

public class Artiste {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    //@OneToOne
    //@JoinColumn(name = "user_id", referencedColumnName = "id")
    // private UserEntity utilisateur;

    @Column(columnDefinition = "TEXT")
    private String biographie;

    @Column(name = "reseaux sociaux")
    private String rs;
    
    private String pays;

}
