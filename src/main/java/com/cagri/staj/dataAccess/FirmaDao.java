package com.cagri.staj.dataAccess;

import com.cagri.staj.entities.concretes.Firma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FirmaDao extends JpaRepository<Firma,Integer> {
}
