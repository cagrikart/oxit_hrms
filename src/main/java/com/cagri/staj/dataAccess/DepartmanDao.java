package com.cagri.staj.dataAccess;

import com.cagri.staj.entities.concretes.Departman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface DepartmanDao extends JpaRepository<Departman,Integer> {

    @Transactional
    @Modifying
    @Query("UPDATE Departman d set d.departman_ad=:departman_ad where d.departman_id=:departman_id ")
    void updateDepartman(@Param(value = "departman_id") int departman_id, @Param (value = "departman_ad") String departman_ad);

}
