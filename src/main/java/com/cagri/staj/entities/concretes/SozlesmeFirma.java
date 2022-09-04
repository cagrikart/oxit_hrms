package com.cagri.staj.entities.concretes;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
//not : dil id yi de burada listeledik
public class SozlesmeFirma {
    private int sozlesmeId;
    private int firmaId;
    private int dilId;
    private int hizmetId;
    private String kdvsizFiyat;
    private String kapora;
    private String yillikYenilemeTutari;
    private String sozlesmeBaslangicTarihi;
    private String sozlesmeSonlandirmaTarihi;
    private String domainAd;
  /*
   private String kdvliFiyat;
    private String sozlesmeTarih;
    private String sozlesmeDosyasi;
    private String sozlesmeNot;
    private String sozlesmeSuresi;*/
}
