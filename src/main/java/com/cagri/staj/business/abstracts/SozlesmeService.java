package com.cagri.staj.business.abstracts;

import com.cagri.staj.core.utilities.results.DataResult;
import com.cagri.staj.core.utilities.results.Result;
import com.cagri.staj.entities.concretes.Sozlesme;

import java.util.List;

public interface SozlesmeService {

    DataResult<List<Sozlesme>> getAll();
    Result add( Sozlesme  sozlesme);
    DataResult<Sozlesme> deleteById(int sozlesme_id);
}
