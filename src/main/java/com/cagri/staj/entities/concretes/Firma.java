package com.cagri.staj.entities.concretes;

import lombok.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "firma")

public class Firma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "firma_id")
    @NotNull
    private int firma_id;


    @Column(name = "yetkili_ad")
    private String yetkili_ad;


    @Column(name = "yetkili_soyad")
    private String yetkili_soyad;


    @Column(name = "cep_telefon")
    private String cep_tel;


    @Column(name = "sabit_telefon")
    private String sabit_tel;


    @Column(name = "vergi_dairesi")
    private String vergi_dairesi;


    @Column(name = "vergi_numarasi")
    private String vergi_numarasi;


    @Column(name = "e_mail")
    private String email;


    @Column(name = "firma_il")
    private String il;


    @Column(name = "firma_ilce")
    private String ilce;


    @Column(name = "firma_adres")
    private String firma_adres;


    @Column(name = "firma_not")
    private String not;


    @Column(name = "firma_domain_ad")
    private String domain_ad;


}
