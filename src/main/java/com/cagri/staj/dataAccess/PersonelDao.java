package com.cagri.staj.dataAccess;

import com.cagri.staj.entities.concretes.Personel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface PersonelDao extends JpaRepository<Personel,Integer> {
//    @Transactional
//    @Modifying
//    @Query("update Personel p set p.personel_ad=:ad ," +
//            " p.personel_soyad =:personel_soyad ," +
//            "p.is_baslangic_tarihi =:is_baslangic_tarihi," +
//            "p.dogum_tarihi =: dogum_tarihi" +
//            " where p.personel_id =:hizmet_id")
//    void updatePersonel(@Param(value = "personel_id") int personel_id,
//                        @Param(value = "personel_soyad") String personel_soyad,
//                        @Param(value = "is_baslangic_tarihi") String is_baslangic_tarihi,
//                        @Param(value = "dogum_tarihi") String dogum_tarihi);

}

