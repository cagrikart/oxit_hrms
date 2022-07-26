package com.cagri.staj.business.concretes;

import com.cagri.staj.business.abstracts.PersonelService;
import com.cagri.staj.core.utilities.results.DataResult;
import com.cagri.staj.core.utilities.results.Result;
import com.cagri.staj.core.utilities.results.SuccessDataResult;
import com.cagri.staj.core.utilities.results.SuccessResult;
import com.cagri.staj.dataAccess.PersonelDao;
import com.cagri.staj.entities.concretes.Personel;
import com.cagri.staj.entities.concretes.UpdateRequestPersonel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonelManager implements PersonelService {
    private PersonelDao personelDao;

    @Autowired
    public PersonelManager(PersonelDao personelDao) {
        this.personelDao = personelDao;
    }

    @Override
    public DataResult<List<Personel>> getAll() {
        return new SuccessDataResult<List<Personel>>(this.personelDao.findAll(), "Personel Listelendi");
    }

    @Override
    public Result add(Personel personel) {
        this.personelDao.save(personel);
        return new SuccessResult("eklendi");
    }

    @Override
    public DataResult<Personel> findById(int personel_id) {
        this.personelDao.findById(personel_id);
        return new SuccessDataResult<>(personel_id + " güncellendi");
    }

    @Override
    public DataResult<Personel> deleteById(int delete_int) {
        this.personelDao.deleteById(delete_int);
        return new SuccessDataResult<>(delete_int + " silindi");
    }



   @Override
    public Result updateHizmet(UpdateRequestPersonel updateRequestPersonel) {
       int id;
       String ad, soyad, is_tarihi_baslangic, dogum_tarihi;
       id = updateRequestPersonel.getPersonel_id();
       ad = updateRequestPersonel.getPersonel_ad();
       soyad = updateRequestPersonel.getPersonel_soyad();
       is_tarihi_baslangic = updateRequestPersonel.getIs_baslangic_tarihi();
       dogum_tarihi = updateRequestPersonel.getDogum_tarihi();
       
return null;

        }

}
