package com.cagri.staj.business.concretes;

import com.cagri.staj.business.abstracts.HizmetService;
import com.cagri.staj.core.utilities.results.DataResult;
import com.cagri.staj.core.utilities.results.Result;
import com.cagri.staj.core.utilities.results.SuccessDataResult;
import com.cagri.staj.core.utilities.results.SuccessResult;
import com.cagri.staj.dataAccess.HizmetDao;
import com.cagri.staj.entities.concretes.Hizmet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HizmetManager implements HizmetService {
    private HizmetDao hizmetDao;

    @Autowired
    public HizmetManager(HizmetDao hizmetDao) {
        this.hizmetDao = hizmetDao;
    }

    @Override
    public DataResult<List<Hizmet>> getAll() {
        return new SuccessDataResult<List<Hizmet>>(this.hizmetDao.findAll(),"Hizmet ,Listelendi");
    }

    @Override
    public Result add(Hizmet hizmet) {
        this.hizmetDao.save(hizmet);
        return new  SuccessResult("Hizmet eklendi");
    }

    @Override
    public DataResult<Hizmet> deleteById(int hizmet_id) {
        this.hizmetDao.deleteById(hizmet_id);
        return new SuccessDataResult<>("The Customer with number: " + hizmet_id + " is deleted.");
    }

    @Override
    public Result updateHizmet(int hizmet_id, String hizmet_ad) {
        this.hizmetDao.updateHizmet(hizmet_id,hizmet_ad);
        return new SuccessResult("güncellendi");
    }
//
//    @Override
//    public Result update(int hizmet_id, String hizmet_ad) {
//         this.hizmetDao.updateHizmet(hizmet_id,hizmet_ad);
//         return new SuccessResult("güncellendi");
//    }


//    @Override
//    public Result update(Hizmet hizmet) {
//        this.hizmetDao.save(hizmet);
//        return new SuccessResult("Hizmet Güncellendi");
//    }


}
