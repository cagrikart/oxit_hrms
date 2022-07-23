package com.cagri.staj.api.controller;

import com.cagri.staj.business.abstracts.HizmetService;
import com.cagri.staj.core.utilities.results.DataResult;
import com.cagri.staj.core.utilities.results.Result;
import com.cagri.staj.dataAccess.HizmetDao;
import com.cagri.staj.entities.concretes.Hizmet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hizmet")
@CrossOrigin
public class HizmetController {
    private HizmetService hizmetService;
    private HizmetDao hizmetDao;
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

    @PostMapping("/delete/{hizmet_id}")
    public DataResult<Hizmet> deleteById(@RequestParam  int hizmet_id) {
        return this.hizmetService.deleteById(hizmet_id);
    }

    @PostMapping("/update/{hizmet_id}")
    public Result update(@RequestParam(name = "hizmet_id") int hizmet_id, @RequestParam(name = "hizmet_ad") String hizmet_ad) {
        return this.hizmetService.updateHizmet(hizmet_id,hizmet_ad);
    }
    @DeleteMapping("/delete/{hizmet_id}")
    public ResponseEntity deleteClient(@PathVariable (name = "hizmet_id") int hizmet_id) {
        hizmetService.deleteById(hizmet_id);
        return ResponseEntity.ok().build();
    }
}
