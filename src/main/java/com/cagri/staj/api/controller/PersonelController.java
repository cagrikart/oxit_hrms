package com.cagri.staj.api.controller;

import com.cagri.staj.business.abstracts.PersonelService;
import com.cagri.staj.core.utilities.results.DataResult;
import com.cagri.staj.core.utilities.results.Result;
import com.cagri.staj.core.utilities.results.SuccessDataResult;
import com.cagri.staj.entities.concretes.*;
import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personel")
@CrossOrigin("*")
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

    @PostMapping(value = "/add" ,  produces  = "application/json",consumes  = "application/json")
    public Result add(@RequestBody PersonelDepartman personelDepartman) {
       // System.out.println(departman_id);
       // System.out.println(departman_ad);
        System.out.println(personelDepartman);
        return  this.personelService.add(personelDepartman);
    }

    @PutMapping( value = "/update/{personel_id}" , produces  = "application/json",consumes = "application/json")
    public Personel updatePersonel(@RequestBody Personel personel,
                                   @PathVariable("personel_id") int personel_id)
    {
        return this.personelService.updatePersonel(
                personel,personel_id);
    }
    @DeleteMapping("/delete/{personel_id}")
    public ResponseEntity deletePersonel(@PathVariable (name = "personel_id") int  personel_id) {
         personelService.deleteById(personel_id);
        return ResponseEntity.ok().build();
    }

//   @PostMapping(value = "/update/{personel_id}")
//   public Result update(@RequestBody UpdateRequestPersonel updateRequestPersonel) {
//       return this.personelService.updateHizmet(updateRequestPersonel);
//   }




//    @PostMapping("/delete")
//    public DataResult<Personel> deleteById(@RequestParam int delete_int) {
//        return this.personelService.deleteById(delete_int);
//    }




}