package com.cagri.staj.business.concretes;

import com.cagri.staj.business.abstracts.FirmaService;
import com.cagri.staj.core.utilities.results.DataResult;
import com.cagri.staj.core.utilities.results.Result;
import com.cagri.staj.core.utilities.results.SuccessDataResult;
import com.cagri.staj.core.utilities.results.SuccessResult;
import com.cagri.staj.dataAccess.FirmaDao;
import com.cagri.staj.entities.concretes.Firma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FirmaManager implements FirmaService
{
    private FirmaDao  firmaDao;

    @Autowired
    public FirmaManager(FirmaDao firmaDao) {
        this.firmaDao = firmaDao;
    }

    @Override
    public DataResult<List<Firma>> getAll() {
        return new SuccessDataResult<List<Firma>>(this.firmaDao.findAll(),"firma listelendi");
    }

    @Override
    public Result add(Firma firma) {
        this.firmaDao.save(firma);
        return new SuccessResult("firma eklendi");
    }
}
