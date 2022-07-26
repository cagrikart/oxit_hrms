package com.cagri.staj.entities.concretes;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class UpdateRequestPersonel {
    private int personel_id;

    private String personel_ad;

    private String personel_soyad;

    private String is_baslangic_tarihi;

    private String dogum_tarihi;
}
