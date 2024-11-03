package com.Olympics.repository;

import com.Olympics.controller.ControllerMedalsByEdition;

import com.Olympics.model.MedalsByEdition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RepositoryMedals extends JpaRepository<MedalsByEdition, Integer> {

    public List<MedalsByEdition> findAllByContainingContainingIgnoreCase(@Param("medalsByEdition") String medalsByEdition);
}
