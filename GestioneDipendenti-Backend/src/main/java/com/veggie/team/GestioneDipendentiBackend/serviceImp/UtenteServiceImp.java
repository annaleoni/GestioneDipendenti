package com.veggie.team.GestioneDipendentiBackend.serviceImp;

import com.veggie.team.GestioneDipendentiBackend.entity.Utente;
import com.veggie.team.GestioneDipendentiBackend.repository.UtenteRepo;
import com.veggie.team.GestioneDipendentiBackend.service.UtenteService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UtenteServiceImp implements UtenteService {
    private UtenteRepo ur;

    public UtenteServiceImp(UtenteRepo ur) {
        this.ur = ur;
    }

    @Override
    public Optional<Utente> cercaPerUsernameEPassword(Utente utente) {
        return ur.findByUsernameAndPassword(utente.getUsername(), utente.getPassword());
    }
}
