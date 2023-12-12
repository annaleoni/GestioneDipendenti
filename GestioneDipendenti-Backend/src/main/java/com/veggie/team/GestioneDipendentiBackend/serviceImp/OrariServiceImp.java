package com.veggie.team.GestioneDipendentiBackend.serviceImp;

import com.veggie.team.GestioneDipendentiBackend.repository.OrariRepo;
import com.veggie.team.GestioneDipendentiBackend.repository.UtenteRepo;
import com.veggie.team.GestioneDipendentiBackend.service.OrariService;
import org.springframework.stereotype.Service;

@Service
public class OrariServiceImp implements OrariService {
    private OrariRepo or;

    public OrariServiceImp(OrariRepo or) {
        this.or = or;
    }
}
