package com.cagri.staj;

import com.cagri.staj.dataAccess.DepartmanDao;
import com.cagri.staj.dataAccess.PersonelDao;
import com.cagri.staj.entities.concretes.Departman;
import com.cagri.staj.entities.concretes.Personel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StajApplication  {

    public static void main(String[] args) {
        SpringApplication.run(StajApplication.class, args);
    }

}
