package com.cagri.staj.api.controller;

import com.cagri.staj.business.abstracts.DepartmanService;
import com.cagri.staj.business.abstracts.DilService;
import com.cagri.staj.core.utilities.results.DataResult;
import com.cagri.staj.core.utilities.results.Result;
import com.cagri.staj.core.utilities.results.SuccessResult;
import com.cagri.staj.entities.concretes.Departman;
import com.cagri.staj.entities.concretes.Dil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dil")
@CrossOrigin
public class DilController {

    private DilService dilService;

    public DilController(DilService dilService) {
        this.dilService = dilService;
    }

    @GetMapping("/getall")
    public DataResult<List<Dil>> getAll() {
        return this.dilService.getAll();
    }

    @PostMapping(value = "/add" ,  produces  = "application/json",consumes  = "application/json")
    public Result add(@RequestBody  Dil dil) {
        return this.dilService.add(dil);
    }

}
