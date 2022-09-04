package com.cagri.staj.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","sozlesme"})

public class Firma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "firma_id")
    @NotNull
    private int firma_id;

    @Column(name = "firma_ad")
    private String firma_ad;

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
    private String firma_il;



    @Column(name = "firma_ilce")
    private String firma_ilce;


    @Column(name = "firma_adres")
    private String firma_adres;


    @Column(name = "firma_not")
    private String firma_not;


    @Column(name = "firma_domain_ad")
    private String firma_domain_ad;


}   
