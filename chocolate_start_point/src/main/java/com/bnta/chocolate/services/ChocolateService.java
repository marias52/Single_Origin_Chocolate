package com.bnta.chocolate.services;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChocolateService {
    @Autowired
    ChocolateRepository chocolateRepository;

    public List<Chocolate> getAllChocolates(){
        return this.chocolateRepository.findAll();
    }

    public Optional<Chocolate> getChocolateById(long id){
        return this.chocolateRepository.findById(id);
    }

    public Chocolate saveChocolate(Chocolate chocolate){
        this.chocolateRepository.save(chocolate);
        return chocolate;
    }

    public void deleteChocolateById(long id){
        this.chocolateRepository.deleteById(id);
    }

}
