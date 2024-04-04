package com.example.apiSocialRate.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Evento {
    @Id
    @GeneratedValue
    private Long idEvento;
    private String nomeEvento;
}
