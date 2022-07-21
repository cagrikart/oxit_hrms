package com.cagri.staj.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;


@Table(name = "hizmet")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","sozlesmeler"})
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hizmet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hizmet_id")
    @NotNull
    private int hizmet_id;



    @Column(name = "hizmet_ad")
    @NotNull
    private String hizmet_ad;

}
