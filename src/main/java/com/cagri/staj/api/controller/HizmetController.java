package com.cagri.staj.api.controller;

import com.cagri.staj.business.abstracts.HizmetService;
import com.cagri.staj.core.utilities.results.DataResult;
import com.cagri.staj.core.utilities.results.Result;
import com.cagri.staj.entities.concretes.Departman;
import com.cagri.staj.entities.concretes.Firma;
import com.cagri.staj.entities.concretes.Hizmet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/hizmet")
@CrossOrigin
public class HizmetController {
    private HizmetService hizmetService;

    @Autowired
    public HizmetController(HizmetService hizmetService) {
        this.hizmetService = hizmetService;
    }

    @GetMapping("/getall")
    public DataResult<List<Hizmet>> getAll() {
        return this.hizmetService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Hizmet hizmet) {
        return this.hizmetService.add(hizmet);
    }
}
