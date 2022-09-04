package com.cagri.staj.dataAccess;

import com.cagri.staj.entities.concretes.Dil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DilDao extends JpaRepository<Dil,Integer> {
}
