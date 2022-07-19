package com.cagri.staj.dataAccess;

import com.cagri.staj.core.utilities.results.DataResult;
import com.cagri.staj.entities.concretes.Sozlesme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SozlesmeDao extends JpaRepository<Sozlesme,Integer> {
}
