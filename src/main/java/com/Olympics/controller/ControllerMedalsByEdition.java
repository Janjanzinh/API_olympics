package com.Olympics.controller;


import com.Olympics.model.MedalsByEdition;
import com.Olympics.services.MedalsControllerService;
import com.Olympics.services.MedalsControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/MedalsByEdition")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ControllerMedalsByEdition {


    private final MedalsControllerService service;

    @Autowired
    public ControllerMedalsByEdition(MedalsControllerService service) {
        this.service = service;
    }

    @GetMapping
    public List<MedalsByEdition> getAllMedals(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity <MedalsByEdition> getMedalsId(@PathVariable int id){
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}

