package com.Olympics.services;

import com.Olympics.model.MedalsByEdition;
import com.Olympics.repository.RepositoryMedals;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class MedalsControllerService {

    @Autowired
    private final RepositoryMedals repositoryMedals;

    //    Retornar todas as medalhas
    public List<MedalsByEdition> findAll() {

        return repositoryMedals.findAll();
    }

    public Optional<MedalsByEdition> findById(int editionId) {
        return repositoryMedals.findById(editionId);
    }

    public MedalsByEdition save(MedalsByEdition medals) {
        return repositoryMedals.save(medals);
    }

    public void deleteById(int editionId) {
        repositoryMedals.deleteById(editionId);
    }

    public MedalsByEdition update(MedalsByEdition medals) {

        return repositoryMedals.save(medals);
    }

    public MedalsControllerService(RepositoryMedals repositoryMedals) {
        this.repositoryMedals = repositoryMedals;
    }
}