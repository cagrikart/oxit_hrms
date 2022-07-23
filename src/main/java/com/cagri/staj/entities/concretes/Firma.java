package com.cagri.staj.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "firmalar")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","sozlesmeler"})

public class Firma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "firma_id")
    @NotNull
    private int firma_id;
    @Column(name = "yetkili_ad")
    @NotNull
    private String yetkili_ad;
    @Column(name = "yetkili_soyad")
    @NotNull
    private String yetkili_soyad;
    @Column(name = "cep_telefon")
    @NotNull
    private String cep_tel;
    @Column(name = "sabit_telefon")
    @NotNull
    private String sabit_tel;
    @Column(name = "vergi_dairesi")
    @NotNull
    private String vergi_dairesi;
    @Column(name = "vergi_numarasi")
    @NotNull
    private String vergi_numarasi;
    @Column(name = "e_mail")
    @NotNull
    private String email;
    @Column(name = "il")
    @NotNull
    private String il;
    @Column(name = "ilxe")
    @NotNull
    private String ilce;
    @Column(name = "firma_adres")
    @NotNull
    private String firma_adres;
    @Column(name = "not")
    @NotNull
    private String not;
    @Column(name = "domain_ad")
    @NotNull
    private String domain_ad;

   @OneToMany(mappedBy = "firma")
    private List<Sozlesme> sozlesmeler;

}
