package com.cagri.staj.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Getter
@Setter
@Table(name = "dil")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","sozlesme"})

public class Dil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dil_id")
    private int dil_id;
    @Column(name = "dil_ad")
    private String dil_ad;
}
