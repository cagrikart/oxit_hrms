package com.cagri.staj.business.abstracts;

import com.cagri.staj.core.utilities.results.DataResult;
import com.cagri.staj.core.utilities.results.Result;
import com.cagri.staj.entities.concretes.Departman;
import com.cagri.staj.entities.concretes.Firma;
import com.cagri.staj.entities.concretes.Hizmet;
import com.cagri.staj.entities.concretes.Sozlesme;

import java.util.List;


public interface HizmetService {
    DataResult<List<Hizmet>> getAll();
    Result add(Hizmet hizmet);

    DataResult<Hizmet> deleteById(int hizmet_id);

    Result updateHizmet (int hizmet_id,String hizmet_ad);
}
