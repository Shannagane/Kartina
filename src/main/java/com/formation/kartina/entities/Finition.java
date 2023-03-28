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
@Table(name = "finition")
@AllArgsConstructor
@NoArgsConstructor

public class Finition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "support_allu")
    private Boolean supportAllu;

    @Column(name = "support_allu_verre_acrilyque")
    private Boolean supportAlluVerreAcrilyque;

    @Column(name = "tirage_papier_photo")
    private Boolean tiragePapierPhoto;

    private Boolean blackout;

    private Boolean artshot;

}
