package com.cagri.staj.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sozlesme")
public class Sozlesme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sozlesme_id")
    @NotNull
    private int sozlesme_id;

    @Column(name = "sozlesme_tarih")
    private String sozlesme_tarih;

    @Column(name = "kdvsiz_fiyat")
    private String kdvsiz_fiyat;

    @Column(name = "kdvli_fiyat")
    private String kdvli_fiyat;

    @Column(name = "sozlesme_kapora")
    private String kapora;

    @Column(name = "yillik_yenileme_tutari")
    private String yillik_yenileme_tutari;

    @Column(name = "sozlesme_dosyasi")
    private String sozlesme_dosyasi;

    @Column(name = "sozlesme_not")
    private String sozlesme_not;

    @Column(name = "sozlesme_baslangic_tarihi")
    private String sozlesme_baslangic_tarihi;

    @Column(name = "sozlesme_sonlandirma_tarihi")
    private String sozlesme_sonlandirma_tarihi;

//    @Column(name = "sozlesme_suresi")
//    private String sozlesme_suresi;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="firma_id")
    private Firma firma;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="dil_id")
    private Dil dil ;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="hizmet_id")
    private Hizmet hizmet  ;

}
