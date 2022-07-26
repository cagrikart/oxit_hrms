package com.cagri.staj.dataAccess;

import com.cagri.staj.entities.concretes.Hizmet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import javax.transaction.Transactional;
public interface HizmetDao extends JpaRepository<Hizmet,Integer> { // Repository
    @Transactional
    @Modifying
    @Query("UPDATE Hizmet h set h.hizmet_ad =:hizmet_ad where h.hizmet_id=:hizmet_id ")
    void updateHizmet(@Param(value = "hizmet_id") int hizmet_id, @Param (value = "hizmet_ad") String hizmet_ad);

}
