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
@Table(name = "hizmet")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","sozlesmeler"})
public class Hizmet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hizmet_id")
    @NotNull
    private int hizmet_id;

    @Column(name = "hizmet_ad")
    @NotNull
    private String hizmet_ad;

    @OneToMany(mappedBy = "hizmet")
    private List<Sozlesme> sozlesmeler;
}
