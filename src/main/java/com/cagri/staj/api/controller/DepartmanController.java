package com.cagri.staj.api.controller;

import com.cagri.staj.business.abstracts.DepartmanService;
import com.cagri.staj.core.utilities.results.DataResult;
import com.cagri.staj.core.utilities.results.Result;
import com.cagri.staj.entities.concretes.Departman;
import com.cagri.staj.entities.concretes.UpdateRequestDepartman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departman")
@CrossOrigin
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

    @PostMapping(value = "/add",  produces  = "application/json",consumes  = "application/json")
    public Result add(@RequestBody Departman departman) {
        return this.departmanService.add(departman);
    }


    @PostMapping(value = "/update/" , produces = "application/json" , consumes = "application/json")
    public  Result update (@RequestBody UpdateRequestDepartman updateRequestDepartman) {
        return  this.departmanService.updateDepartman(updateRequestDepartman);
    }

    @DeleteMapping("/delete/{departman_id}")
    public ResponseEntity deleteDepartman(@PathVariable (name = "departman_id") int  departman_id) {
        departmanService.deletById(departman_id);
        return ResponseEntity.ok().build();
    }
//    @PostMapping("/delete")
//    public DataResult<Departman> deletById(@RequestParam int departman_id) {
//        return  this.departmanService.deletById(departman_id);
//    }



}
