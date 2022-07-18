package com.cagri.staj.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "firma"})
public class Departman {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "departman_id")
    @NotNull
    private int departman_id;
    @Column(name = "departman_ad")
    @NotNull
    private String departman_ad;

    @OneToMany(mappedBy = "departman")
    private List<Personel> personel;
}
