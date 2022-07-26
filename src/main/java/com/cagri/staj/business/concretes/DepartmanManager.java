package com.cagri.staj.business.concretes;

import com.cagri.staj.business.abstracts.DepartmanService;
import com.cagri.staj.core.utilities.results.DataResult;
import com.cagri.staj.core.utilities.results.Result;
import com.cagri.staj.core.utilities.results.SuccessDataResult;
import com.cagri.staj.core.utilities.results.SuccessResult;
import com.cagri.staj.dataAccess.DepartmanDao;
import com.cagri.staj.entities.concretes.Departman;
import com.cagri.staj.entities.concretes.UpdateRequestDepartman;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmanManager implements DepartmanService {
    private DepartmanDao departmanDao;

    public DepartmanManager(DepartmanDao departmanDao) {
        this.departmanDao = departmanDao;
    }

    @Override
    public DataResult<List<Departman>> getAll() {
        return new SuccessDataResult<List<Departman>>(this.departmanDao.findAll(),"Data listelendi");
    }

    @Override
    public Result add(Departman departman) {
        this.departmanDao.save(departman);
        return new SuccessResult("Departman Eklendi");
    }

    @Override
    public DataResult<Departman> deletById(int departman_id) {
        this.departmanDao.deleteById(departman_id);
        return new SuccessDataResult<>("The Customer with number: " + departman_id + " is deleted.");
    }

    @Override
    public Result updateDepartman(UpdateRequestDepartman updateRequestDepartman) {
        String ad ;
        int id;
        ad = updateRequestDepartman.getDepartman_ad();
        id =  updateRequestDepartman.getDepartman_id();
        this.departmanDao.updateDepartman(id,ad);
        return new SuccessResult("güncellendi");
    }


}
