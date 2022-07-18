package com.cagri.staj.business.abstracts;

import com.cagri.staj.core.utilities.results.DataResult;
import com.cagri.staj.core.utilities.results.Result;
import com.cagri.staj.entities.concretes.Departman;
import com.cagri.staj.entities.concretes.Firma;

import java.util.List;

public interface DepartmanService {
    DataResult<List<Departman>> getAll();
    Result add(Departman departman);
}
