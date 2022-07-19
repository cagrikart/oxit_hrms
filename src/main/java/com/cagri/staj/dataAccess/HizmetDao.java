package com.cagri.staj.dataAccess;

import com.cagri.staj.entities.concretes.Hizmet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
public interface HizmetDao extends JpaRepository<Hizmet,Integer> { // Repository


}
