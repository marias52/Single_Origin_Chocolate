package com.bnta.chocolate.controllers;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import com.bnta.chocolate.services.ChocolateService;
import com.bnta.chocolate.services.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/chocolates")
public class ChocolateController {

    @Autowired
    ChocolateService chocolateService;

    @GetMapping
    public ResponseEntity<List<Chocolate>> getAllChocolates(){
        List<Chocolate> tempList = chocolateService.getAllChocolates();
        return new ResponseEntity<>(tempList, HttpStatus.OK);
        }

    @GetMapping (value = "/{id}")
    public ResponseEntity<Chocolate> getSingleChocolate(@PathVariable long id){
        Chocolate chocolateTemp = chocolateService.getChocolateById(id).get();
        return new ResponseEntity<>(chocolateTemp, HttpStatus.OK);
    }

}

