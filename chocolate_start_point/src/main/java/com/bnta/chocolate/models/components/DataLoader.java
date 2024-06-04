package com.bnta.chocolate.models.components;


import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {


    @Autowired
    EstateRepository estateRepository;
    @Autowired
    ChocolateRepository chocolateRepository;



    @Override //why are we overiding here? I thought overiding is for parent and child classes
    public void run(ApplicationArguments args) throws Exception {


        Estate estate1 = new Estate("Cadbury","UK");
        Estate estate2 = new Estate("Hersheys","USA");

        Chocolate chocolate1 = new Chocolate("Galaxy",50,estate1);
        Chocolate chocolate2 = new Chocolate("Cadbury fingers",30,estate1);

        Chocolate chocolate3 = new Chocolate("Cookies & Cream",20,estate2);
        Chocolate chocolate4 = new Chocolate("Reese's pieces",15,estate2);

        estateRepository.save(estate1);
        estateRepository.save(estate2);

        chocolateRepository.save(chocolate1);
        chocolateRepository.save(chocolate2);
        chocolateRepository.save(chocolate3);
        chocolateRepository.save(chocolate4);

    }


}
