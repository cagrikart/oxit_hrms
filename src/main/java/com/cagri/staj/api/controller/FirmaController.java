package com.cagri.staj.api.controller;

import com.cagri.staj.business.abstracts.FirmaService;
import com.cagri.staj.core.utilities.results.DataResult;
import com.cagri.staj.core.utilities.results.Result;
import com.cagri.staj.entities.concretes.Firma;
import com.cagri.staj.entities.concretes.Hizmet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/firma")
public class FirmaController {
    private FirmaService firmaService;

    @Autowired
    public FirmaController(FirmaService firmaService) {
        this.firmaService = firmaService;
    }

    @GetMapping("/getall")
    public DataResult<List<Firma>> getAll() {
        return this.firmaService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Firma firma) {
        return this.firmaService.add(firma);
    }



    @DeleteMapping("/delete/{firma_id}")
    public ResponseEntity deleteFirma(@PathVariable (name = "firma_id") int firma_id) {
        firmaService.deleteById(firma_id);
        return ResponseEntity.ok().build();
    }

    //    @PostMapping("/delete")
//    public DataResult<Hizmet> deleteById(int delete_int) {
//        return this.firmaService.deleteById(delete_int);
//    }
//

}
