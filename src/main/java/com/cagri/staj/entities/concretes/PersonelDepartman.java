package com.cagri.staj.entities.concretes;

import lombok.*;

import javax.persistence.Column;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class PersonelDepartman {

    private int departmanId;
    private String personelAd;
    private String personelSoyad;
    private String personelİsbaslangic;
    private String personelDogumTarihi;


}