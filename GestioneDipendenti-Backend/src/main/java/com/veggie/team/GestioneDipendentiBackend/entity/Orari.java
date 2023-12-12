package com.veggie.team.GestioneDipendentiBackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Orari {
    @Id
    @GeneratedValue(strategy=  GenerationType.IDENTITY)
    private int idOrari;

    private LocalDate dataIngresso;

    private LocalDate dataUscita;

    // Many To One
    @ManyToOne()
    @JoinColumn(name="idUtente")
    private Utente utente;
}
