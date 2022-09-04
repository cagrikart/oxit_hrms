package com.cagri.staj.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","personel"})
@Table(name = "departman")

public class Departman {

    @Id
    @Column(name = "departman_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer departman_id;


    @Column(name = "departman_ad")
    private String departman_ad;






}
