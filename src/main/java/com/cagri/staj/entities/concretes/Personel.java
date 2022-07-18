package com.cagri.staj.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "personel")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","sozlesmeler"})

public class Personel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "personel_id")
    @NotNull
    private int personel_id;

    @Column(name = "personel_ad")
    @NotNull
    private String personel_ad;

    @Column(name = "personel_soyad")
    @NotNull
    private String personel_soyad;

    @Column(name = "is_baslangic_tarihi")
    @NotNull
    private int is_baslangic_tarihi;

    @Column(name = "dogum_tarihi")
    @NotNull
    private int dogum_tarihi;

    //departman_id;  ilişki yazılacak
    //sözleşme

     @ManyToOne()
     @JoinColumn(name = "departman_id")
     private Departman departman;


    @OneToMany(mappedBy = "personel")
    private List<Sozlesme> sozlesmeler;
}
