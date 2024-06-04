package com.bnta.chocolate.controllers;

import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.services.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping(value = "/estates")
public class EstateController {

    @Autowired
    EstateService estateService;

    @GetMapping(value = "/estates")
    public ResponseEntity<List<Estate>>getAllEstates(){
       List<Estate> tempList = estateService.getAllEstates();
       return new ResponseEntity<>(tempList, HttpStatus.OK);
    }

    @GetMapping(value = "/estates/{id}")
    public ResponseEntity<Estate> getEstateById(@PathVariable long id){
        Estate tempEstate = estateService.getEstateById(id).get();

        return new ResponseEntity<>(tempEstate,HttpStatus.OK);
    }

}
