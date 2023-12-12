package com.veggie.team.GestioneDipendentiBackend.repository;

import com.veggie.team.GestioneDipendentiBackend.entity.Orari;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrariRepo extends JpaRepository<Orari, Integer> {

}
