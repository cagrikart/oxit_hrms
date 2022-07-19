package com.cagri.staj.api.controller;

import com.cagri.staj.business.abstracts.PersonelService;
import com.cagri.staj.core.utilities.results.DataResult;
import com.cagri.staj.core.utilities.results.Result;
import com.cagri.staj.entities.concretes.Firma;
import com.cagri.staj.entities.concretes.Hizmet;
import com.cagri.staj.entities.concretes.Personel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personel")
public class PersonelController {

    private PersonelService personelService;

    @Autowired
    public PersonelController(PersonelService personelService) {
        this.personelService = personelService;
    }

    @GetMapping("/getall")
    public DataResult<List<Personel>> getAll() {
        return this.personelService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Personel personel) {
        return this.personelService.add(personel);
    }

    @PostMapping("/delete")
    public DataResult<Personel> deleteById(@RequestParam int delete_int) {
        return this.personelService.deleteById(delete_int);
    }
}