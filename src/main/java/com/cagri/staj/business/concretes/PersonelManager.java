package com.cagri.staj.business.concretes;

import com.cagri.staj.business.abstracts.DepartmanService;
import com.cagri.staj.business.abstracts.PersonelService;
import com.cagri.staj.core.utilities.results.DataResult;
import com.cagri.staj.core.utilities.results.Result;
import com.cagri.staj.core.utilities.results.SuccessDataResult;
import com.cagri.staj.core.utilities.results.SuccessResult;
import com.cagri.staj.dataAccess.DepartmanDao;
import com.cagri.staj.dataAccess.PersonelDao;
import com.cagri.staj.entities.concretes.Departman;
import com.cagri.staj.entities.concretes.Personel;
import com.cagri.staj.entities.concretes.PersonelDepartman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service

public class PersonelManager implements PersonelService {
    @Autowired
    private PersonelDao personelDao;

    @Autowired
    private DepartmanDao departmanDao;



    @Autowired
    public PersonelManager(PersonelDao personelDao) {
        this.personelDao = personelDao;
    }

    @Override
    public DataResult<List<Personel>> getAll() {

        return new SuccessDataResult<List<Personel>>(this.personelDao.findAll(), "Personel Listelendi");
    }

 public Result add(PersonelDepartman personelDepartman) {

        Personel personel = new Personel();
        personel.setPersonel_ad(personelDepartman.getPersonelAd());
        personel.setPersonel_soyad(personelDepartman.getPersonelSoyad());
        personel.setIs_baslangic_tarihi(personelDepartman.getPersonelİsbaslangic());
        personel.setDogum_tarihi(personelDepartman.getPersonelDogumTarihi());
        personel.setDepartman(departmanDao.getById(personelDepartman.getDepartmanId()));
        System.out.println(personel.toString());

        this.personelDao.save(personel);
        return new SuccessResult("eklendi");
    }
//    @Override
//    public Result add(PersonelDepartman personelDepartman) {
//        int personelId ,departmanId;
//        String  personelAd,personelSoyad,
//                personelIsbaslangic,personeldDogumtarihi,
//                personelBirim,departmanAd;
//        Departman departman = new Departman();
//        departmanId = departman.getDepartman_id();
//        Optional<Personel> personelOptional = this.personelDao.findById(departmanId);
//        Personel personel = new Personel();
//
//        if(personelOptional.isPresent()) {
//            personelOptional.get().setPersonel_ad(personelDepartman.getPersonelAd());
//            personelOptional.get().setPersonel_soyad((personelDepartman.getPersonelSoyad()));
//            personelOptional.get().setIs_baslangic_tarihi(personelDepartman.getPersonelİsbaslangic());
//            personelOptional.get().setDogum_tarihi(personelDepartman.getPersonelDogumTarihi());
//            this.personelDao.save(personelOptional.get());
//        }
//        return new SuccessResult("eklendi");
//    }
//    @Override
//    public Result add(PersonelDepartman personelDepartman) {
//        int personelId, departmanId;
//        String personelAd, personelSoyad,
//                personelIsbaslangic, personeldDogumtarihi,
//                personelBirim, departmanAd;
//        Departman departman = new Departman();
//
//        departmanId = personelDepartman.getDepartmanId();
//        departman = departmanDao.getById(departmanId);
//
//        Optional<Personel> personelOptional = this.personelDao.findById(personelDepartman.getPersonelId());
//
//        if (personelOptional.isPresent()) {
//            personelOptional.get().setPersonel_ad(personelDepartman.getPersonelAd());
//            personelOptional.get().setPersonel_soyad((personelDepartman.getPersonelSoyad()));
//            personelOptional.get().setIs_baslangic_tarihi(personelDepartman.getPersonelİsbaslangic());
//            personelOptional.get().setDogum_tarihi(personelDepartman.getPersonelDogumTarihi());
//            personelOptional.get().setDepartman(departman);
//            this.personelDao.save(personelOptional.get());
//
//        }
//        System.out.println("id" +personelOptional.get().getPersonel_id());
//        System.out.println("");
//        System.out.println("");
//        System.out.println("ad" +personelOptional.get().getPersonel_ad());
//        System.out.println("");
//        System.out.println("");
//        System.out.println("departman" +personelOptional.get().getDepartman());
//        return new SuccessResult("eklendi");
//
//    }


//@Override
//public Result add(PersonelDepartman personelDepartman) {
//    int personelId, departmanId;
//    String personelAd, personelSoyad,
//            personelIsbaslangic, personeldDogumtarihi,
//            personelBirim, departmanAd;
//    Personel personel = new Personel();
//    Departman departman = new Departman();
//    personel.setPersonel_ad(personelDepartman.getPersonelAd());
//    personel.setPersonel_soyad(personelDepartman.getPersonelSoyad());
//    personel.setIs_baslangic_tarihi(personelDepartman.getPersonelİsbaslangic());
//    personel.setDogum_tarihi(personelDepartman.getPersonelDogumTarihi());
//    personel.setDepartman(departmanDao.getById(personelDepartman.getDepartmanId()));
//    //personel.setDepartman(departmanDao.getDepartman(personelDepartman.getDepartmanAd()));
//
//    this.personelDao.save(personel);
//    return new SuccessResult("eklendi");
//}
//   @Override
//    public Result updateHizmet(UpdateRequestPersonel updateRequestPersonel) {
//       int id;
//       String ad, soyad, is_tarihi_baslangic, dogum_tarihi;
//       id = updateRequestPersonel.getPersonel_id();
//       Optional<Personel> personelOptional = this.personelDao.findById(id);
//
//       if(personelOptional.isPresent()){
//           personelOptional.get().setPersonel_ad(updateRequestPersonel.getPersonel_ad());
//           personelOptional.get().setPersonel_soyad(updateRequestPersonel.getPersonel_soyad());
//           personelOptional.get().setIs_baslangic_tarihi(updateRequestPersonel.getIs_baslangic_tarihi());
//           personelOptional.get().setDogum_tarihi(updateRequestPersonel.getDogum_tarihi());
//           this.personelDao.save(personelOptional.get());
//       }
//        return new SuccessResult("güncellendi");
//
//        }
  //  @Override
   // public Result add(Personel personel) {
//        int personelId;
//        String personelAd,personelSoyad,personelIsbaslangic,personeldDogumtarihi,personelBirim,departmanAd;
//        int departmanId = personelDepartman.getDepartmanId();
//
//        Departman departman  = new Departman();
//        departman= departmanDao.findById(departmanId);
//        personelId = personelDepartman.getPersonelId();
//        personelAd = personelDepartman.getPersonelAd();
//        personelSoyad = personelDepartman.getPersonelSoyad();
//        personelIsbaslangic =personelDepartman.getPersonelİsbaslangic();
//        personeldDogumtarihi = personelDepartman.getPersonelDogumTarihi();
//        personelBirim = personelDepartman.getPersonelBirim();
//        departmanAd = personelDepartman.getDepartmanAd();
//
//        personel.setPersonel_ad(personelDepartman.getPersonelAd()) ;
//        personel.setPersonel_soyad(personelDepartman.getPersonelSoyad());
//        personel.setIs_baslangic_tarihi(personelDepartman.getPersonelİsbaslangic());
//        personel.setDogum_tarihi(personelDepartman.getPersonelDogumTarihi());

//        departman.setDepartman_id(personelDepartman.getDepartmanId());
//        departman.setDepartman_ad(personelDepartman.getDepartmanAd());

//        personel.setDepartman(departmanService.findByDepartmanId(departmanId));

   //   this.personelDao.save(personel);
  //     return new SuccessResult("Eklendi");


  //  }




    @Override
    public DataResult<Personel> deleteById(int delete_int) {
        this.personelDao.deleteById(delete_int);
        return new SuccessDataResult<>(delete_int + " silindi");
    }



//   @Override
//    public Result updateHizmet(UpdateRequestPersonel updateRequestPersonel) {
//       int id;
//       String ad, soyad, is_tarihi_baslangic, dogum_tarihi;
//       id = updateRequestPersonel.getPersonel_id();
//       Optional<Personel> personelOptional = this.personelDao.findById(id);
//
//       if(personelOptional.isPresent()){
//           personelOptional.get().setPersonel_ad(updateRequestPersonel.getPersonel_ad());
//           personelOptional.get().setPersonel_soyad(updateRequestPersonel.getPersonel_soyad());
//           personelOptional.get().setIs_baslangic_tarihi(updateRequestPersonel.getIs_baslangic_tarihi());
//           personelOptional.get().setDogum_tarihi(updateRequestPersonel.getDogum_tarihi());
//           this.personelDao.save(personelOptional.get());
//       }
//        return new SuccessResult("güncellendi");
//
//        }

    @Override
    public Personel updatePersonel(Personel personel, int personel_id) {

        Personel personelDb
                = personelDao.findById(personel_id)
                .get();

        if (Objects.nonNull(personel.getPersonel_ad())
                && !"".equalsIgnoreCase(
                personel.getPersonel_ad())) {
            personelDb.setPersonel_ad(
                    personel.getPersonel_ad());
        }

        if (Objects.nonNull(personel.getPersonel_soyad())
                && !"".equalsIgnoreCase(
                personel.getPersonel_soyad())) {
            personelDb.setPersonel_soyad(
                    personel.getPersonel_soyad());
        }
        if (Objects.nonNull(personel.getIs_baslangic_tarihi())
                && !"".equalsIgnoreCase(
                personel.getIs_baslangic_tarihi())) {
            personelDb.setIs_baslangic_tarihi(
                    personel.getIs_baslangic_tarihi());
        }
        if (Objects.nonNull(personel.getDogum_tarihi())
                && !"".equalsIgnoreCase(
                personel.getDogum_tarihi())) {
            personelDb.setDogum_tarihi(
                    personel.getDogum_tarihi());
        }


        return personelDao.save(personelDb);
    }

}
