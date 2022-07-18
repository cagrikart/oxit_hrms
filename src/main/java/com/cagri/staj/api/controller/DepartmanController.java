package com.cagri.staj.api.controller;

import com.cagri.staj.business.abstracts.DepartmanService;
import com.cagri.staj.core.utilities.results.DataResult;
import com.cagri.staj.core.utilities.results.Result;
import com.cagri.staj.core.utilities.results.SuccessDataResult;
import com.cagri.staj.entities.concretes.Departman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/departman")
public class DepartmanController {
    private DepartmanService departmanService;

    @Autowired
    public DepartmanController(DepartmanService departmanService) {
        this.departmanService = departmanService;
    }

    @GetMapping("/getall")
    public DataResult<List<Departman>> getAll() {
        return this.departmanService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Departman departman){
        return this.departmanService.add(departman);
    }
}
