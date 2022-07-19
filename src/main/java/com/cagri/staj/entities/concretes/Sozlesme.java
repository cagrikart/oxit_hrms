package com.cagri.staj.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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
    @NotNull
    private Date sozlesme_tarih;
    @Column(name = "kdvsiz_fiyat")
    @NotNull
    private int kdvsiz_fiyat;
    @Column(name = "kdvli_fiyat")
    @NotNull
    private int kdvli_fiyat;
    @Column(name = "kapora")
    @NotNull
    private int kapora;
    @Column(name = "yillik_yenileme_tutari")
    @NotNull
    private Date yillik_yenileme_tutari;
    @Column(name = "sozlesme_dosyasi")
    @NotNull
    private String sozlesme_dosyasi;
    @Column(name = "not")
    @NotNull
    private String not;
    @Column(name = "sozlesme_suresi")
    @NotNull
    private int sozlesme_suresi;

    @ManyToOne()
    @JoinColumn(name = "firma_id")
    private Firma firma;

   @ManyToOne()
   @JoinColumn(name = "personel_id")
   private Personel personel;

   @ManyToOne()
   @JoinColumn(name = "hizmet_id")
   private Hizmet hizmet;

}
