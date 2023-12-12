package com.veggie.team.GestioneDipendentiBackend.repository;

import com.veggie.team.GestioneDipendentiBackend.entity.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UtenteRepo extends JpaRepository<Utente, Integer> {
    public Optional<Utente> findByUsernameAndPassword(String username, String password);
}
