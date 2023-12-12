package com.veggie.team.GestioneDipendentiBackend.service;

import com.veggie.team.GestioneDipendentiBackend.entity.Utente;

import java.util.Optional;

public interface UtenteService {
    public Optional<Utente> cercaPerUsernameEPassword(Utente cliente);
}
