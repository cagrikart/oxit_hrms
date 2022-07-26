package com.cagri.staj.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "personel")
public class Personel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "personel_id")
    private int personel_id;

    @Column(name = "personel_ad")
    private String personel_ad;

    @Column(name = "personel_soyad")
    private String personel_soyad;

    @Column(name = "is_baslangic_tarihi")
    private String is_baslangic_tarihi;

    @Column(name = "dogum_tarihi")
    private String dogum_tarihi;

}
