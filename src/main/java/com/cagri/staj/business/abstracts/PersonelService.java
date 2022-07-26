package com.cagri.staj.business.abstracts;

import com.cagri.staj.core.utilities.results.DataResult;
import com.cagri.staj.core.utilities.results.Result;
import com.cagri.staj.entities.concretes.*;

import javax.xml.crypto.Data;
import java.util.List;

public interface PersonelService {

    DataResult<List<Personel>> getAll();
    Result add(Personel personel);
    DataResult<Personel> findById (int personel_id);
    DataResult<Personel> deleteById(int delete_int);
        Result updateHizmet (UpdateRequestPersonel updateRequestPersonel);

}
