package com.cagri.staj.dataAccess;

import com.cagri.staj.entities.concretes.Departman;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmanDao extends JpaRepository<Departman,Integer> {
}
