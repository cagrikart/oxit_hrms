package com.cagri.staj.business.concretes;

import com.cagri.staj.business.abstracts.DepartmanService;
import com.cagri.staj.business.abstracts.DilService;
import com.cagri.staj.core.utilities.results.DataResult;
import com.cagri.staj.core.utilities.results.Result;
import com.cagri.staj.core.utilities.results.SuccessDataResult;
import com.cagri.staj.core.utilities.results.SuccessResult;
import com.cagri.staj.dataAccess.DilDao;
import com.cagri.staj.entities.concretes.Departman;
import com.cagri.staj.entities.concretes.Dil;
import com.cagri.staj.entities.concretes.Hizmet;
import com.cagri.staj.entities.concretes.UpdateRequestDepartman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DilManager implements DilService {

    private DilDao dilDao;

    public DilManager(DilDao dilDao) {
        this.dilDao = dilDao;
    }

    @Override
    public DataResult<List<Dil>> getAll() {
        return new SuccessDataResult<List<Dil>>(this.dilDao.findAll(),"Dil ,Listelendi");
    }

    @Override
    public Result add(Dil dil) {
        this.dilDao.save(dil);
        return new SuccessResult("dil kaydedildi");
    }

    @Override
    public DataResult<Dil> delete_dil(int dil_id) {
        return null;
    }
}
