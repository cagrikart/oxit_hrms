package com.cagri.staj.entities.concretes;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class UpdateRequest {
    private int hizmet_id;
    private String hizmet_ad;

    private int departman_id;
    private String departman_ad;


}
