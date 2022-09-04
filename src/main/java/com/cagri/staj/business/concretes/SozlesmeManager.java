package com.cagri.staj.business.concretes;

import com.cagri.staj.business.abstracts.SozlesmeService;
import com.cagri.staj.core.utilities.results.DataResult;
import com.cagri.staj.core.utilities.results.Result;
import com.cagri.staj.core.utilities.results.SuccessDataResult;
import com.cagri.staj.core.utilities.results.SuccessResult;
import com.cagri.staj.dataAccess.DilDao;
import com.cagri.staj.dataAccess.FirmaDao;
import com.cagri.staj.dataAccess.HizmetDao;
import com.cagri.staj.dataAccess.SozlesmeDao;
import com.cagri.staj.entities.concretes.Sozlesme;
import com.cagri.staj.entities.concretes.SozlesmeFirma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SozlesmeManager implements SozlesmeService {

    @Autowired
    private SozlesmeDao sozlesmeDao;

    @Autowired
    private FirmaDao firmaDao;

    @Autowired
    private DilDao dilDao;

    @Autowired
    private HizmetDao hizmetDao;


    @Autowired
    public SozlesmeManager(SozlesmeDao sozlesmeDao) {
        this.sozlesmeDao = sozlesmeDao;
    }

    @Override
    public DataResult<List<Sozlesme>> getAll() {
        return new SuccessDataResult<List<Sozlesme>>(this.sozlesmeDao.findAll(),"Sozlesme Listelendi");
    }

    @Override
    public Result add(SozlesmeFirma sozlesmeFirma) {

        Sozlesme sozlesme = new Sozlesme();
        sozlesme.setKdvsiz_fiyat(sozlesmeFirma.getKdvsizFiyat());
        sozlesme.setKapora(sozlesmeFirma.getKapora());
        sozlesme.setYillik_yenileme_tutari(sozlesmeFirma.getYillikYenilemeTutari());
        sozlesme.setSozlesme_baslangic_tarihi(sozlesmeFirma.getSozlesmeBaslangicTarihi());
        sozlesme.setSozlesme_sonlandirma_tarihi(sozlesmeFirma.getSozlesmeSonlandirmaTarihi());
        sozlesme.setFirma(firmaDao.getById((sozlesmeFirma.getFirmaId())));
        sozlesme.setDil(dilDao.getById(sozlesmeFirma.getDilId()));
        sozlesme.setHizmet(hizmetDao.getById(sozlesmeFirma.getHizmetId()));
       /* sozlesme.setSozlesme_tarih(sozlesmeFirma.getSozlesmeTarih());
        sozlesme.setSozlesme_dosyasi(sozlesmeFirma.getSozlesmeDosyasi());
        sozlesme.setNot(sozlesmeFirma.getSozlesmeNot());
        sozlesme.setSozlesme_suresi(sozlesmeFirma.getSozlesmeSuresi());*/
        this.sozlesmeDao.save(sozlesme);
        return new SuccessResult("Sozlesme eklendi");

    }

    @Override
    public DataResult<Sozlesme> deleteById(int sozlesme_id) {
         this.sozlesmeDao.deleteById(sozlesme_id);
         return new SuccessDataResult<>("The Customer with number: " + sozlesme_id + " is deleted.");
    }


}
