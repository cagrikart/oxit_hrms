package com.cagri.staj.business.concretes;

import com.cagri.staj.business.abstracts.SozlesmeService;
import com.cagri.staj.core.utilities.results.DataResult;
import com.cagri.staj.core.utilities.results.Result;
import com.cagri.staj.core.utilities.results.SuccessDataResult;
import com.cagri.staj.core.utilities.results.SuccessResult;
import com.cagri.staj.dataAccess.SozlesmeDao;
import com.cagri.staj.entities.concretes.Sozlesme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SozlesmeManager implements SozlesmeService {
    private SozlesmeDao sozlesmeDao;

    @Autowired
    public SozlesmeManager(SozlesmeDao sozlesmeDao) {
        this.sozlesmeDao = sozlesmeDao;
    }

    @Override
    public DataResult<List<Sozlesme>> getAll() {
        return new SuccessDataResult<List<Sozlesme>>(this.sozlesmeDao.findAll(),"Sozlesme Listelendi");
    }

    @Override
    public Result add(Sozlesme sozlesme) {
        this.sozlesmeDao.save(sozlesme);
        return new SuccessResult("Sozlesme eklendi");
    }

    @Override
    public DataResult<Sozlesme> deleteById(int sozlesme_id) {
         this.sozlesmeDao.deleteById(sozlesme_id);
         return new SuccessDataResult<>("The Customer with number: " + sozlesme_id + " is deleted.");
    }


}
