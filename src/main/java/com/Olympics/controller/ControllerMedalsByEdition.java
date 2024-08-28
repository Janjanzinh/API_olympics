package com.Olympics.controller;

import com.Olympics.model.MedalsByEdition;
import com.Olympics.repository.RepositoryMedals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/MedalsByEdition")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ControllerMedalsByEdition {

    @Autowired
    private RepositoryMedals repositoryMedals;

    @GetMapping("/{editionId}")
    public ResponseEntity<MedalsByEdition> getByeditionId(@PathVariable Long editionId ){
        Optional<MedalsByEdition> medalsByEdition = repositoryMedals.findById(editionId);
        return medalsByEdition
                .map(resp -> ResponseEntity.ok(resp))
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());

    }

}
