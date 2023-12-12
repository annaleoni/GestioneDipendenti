package com.veggie.team.GestioneDipendentiBackend.controller;

import com.veggie.team.GestioneDipendentiBackend.entity.Utente;
import com.veggie.team.GestioneDipendentiBackend.service.UtenteService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*")
@RequestMapping("/auth")
@RestController
public class AuthController {
    private UtenteService us;

    public AuthController(UtenteService us) {
        this.us = us;
    }

    @PostMapping("/")
    public Utente login(@RequestBody Utente body) {
        Optional<Utente> utenteTemp = us.cercaPerUsernameEPassword(body);
        if (!utenteTemp.isEmpty()) {
            return utenteTemp.get();
        }
        return null;
    }
}
