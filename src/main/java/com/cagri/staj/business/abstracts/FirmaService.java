package com.cagri.staj.business.abstracts;

import com.cagri.staj.core.utilities.results.DataResult;
import com.cagri.staj.core.utilities.results.Result;
import com.cagri.staj.entities.concretes.Firma;

import java.util.List;

public interface FirmaService {
    DataResult<List<Firma>> getAll();
    Result add(Firma firma);
}
