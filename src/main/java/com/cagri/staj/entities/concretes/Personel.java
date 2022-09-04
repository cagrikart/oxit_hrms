package com.cagri.staj.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Getter
@Setter
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
    private  String dogum_tarihi;


    @ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumns({

           // @JoinColumn(name="departman_ad", referencedColumnName="departman_ad")
   @JoinColumn(name="departman_id")
   private Departman departman;

}
