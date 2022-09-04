package com.cagri.staj.business.abstracts;

import com.cagri.staj.core.utilities.results.DataResult;
import com.cagri.staj.core.utilities.results.Result;
import com.cagri.staj.entities.concretes.Dil;

import java.util.List;

public interface DilService {


    DataResult<List<Dil>> getAll();
    Result add(Dil dil);
    DataResult<Dil> delete_dil(int dil_id);
}
