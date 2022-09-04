package com.cagri.staj.business.abstracts;

import com.cagri.staj.core.utilities.results.DataResult;
import com.cagri.staj.core.utilities.results.Result;
import com.cagri.staj.entities.concretes.*;

import java.util.List;

public interface PersonelService {

    DataResult<List<Personel>> getAll();
    Result add(PersonelDepartman personelDepartman);
    //Result add(Personel personel);
    DataResult<Personel> deleteById(int delete_int);
  // Result updateHizmet (UpdateRequestPersonel updateRequestPersonel);
    Personel updatePersonel(Personel personel,int personel_id);
    //DataResult<Personel> getByPersonel_ad(String personel_ad);
}
