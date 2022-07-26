package com.cagri.staj.api.controller;

import com.cagri.staj.business.abstracts.SozlesmeService;
import com.cagri.staj.core.utilities.results.DataResult;
import com.cagri.staj.core.utilities.results.Result;
import com.cagri.staj.dataAccess.SozlesmeDao;
import com.cagri.staj.entities.concretes.Sozlesme;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sozlesme")
@CrossOrigin
@SuppressWarnings("unused")
@AllArgsConstructor
public class SozlesmeController {

    private SozlesmeService sozlesmeService;
    private SozlesmeDao sozlesmeDao;

    @GetMapping("/getall")
    public DataResult<List<Sozlesme>> getAll() {
        return this.sozlesmeService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Sozlesme sozlesme) {
        return this.sozlesmeService.add(sozlesme);
    }

    @DeleteMapping("/delete/{sozlesme_id}")
    public ResponseEntity deleteSozlesme(@PathVariable (name = "sozlesme_id") int sozlesme_id) {
        sozlesmeService.deleteById(sozlesme_id);
        return ResponseEntity.ok().build();
    }

//    @PostMapping("/delete")
//    public DataResult<Sozlesme> deleteById(@RequestParam  int sozlesme_id) {
//        return this.sozlesmeService.deleteById(sozlesme_id);
//    }
}
