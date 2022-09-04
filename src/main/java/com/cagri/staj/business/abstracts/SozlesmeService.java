package com.cagri.staj.business.abstracts;

import com.cagri.staj.core.utilities.results.DataResult;
import com.cagri.staj.core.utilities.results.Result;
import com.cagri.staj.entities.concretes.Sozlesme;
import com.cagri.staj.entities.concretes.SozlesmeFirma;

import java.util.List;

public interface SozlesmeService {

    DataResult<List<Sozlesme>> getAll();
    Result add(SozlesmeFirma sozlesmePersonel);
    DataResult<Sozlesme> deleteById(int sozlesme_id);
}
