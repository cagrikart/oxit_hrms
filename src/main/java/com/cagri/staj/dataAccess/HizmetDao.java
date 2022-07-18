package com.cagri.staj.dataAccess;

import com.cagri.staj.entities.concretes.Hizmet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HizmetDao extends JpaRepository<Hizmet,Integer> {
}
