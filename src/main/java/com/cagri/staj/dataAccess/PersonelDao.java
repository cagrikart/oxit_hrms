package com.cagri.staj.dataAccess;

import com.cagri.staj.entities.concretes.Personel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonelDao extends JpaRepository<Personel,Integer> {

}
