package com.example.apiSocialRate.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Evento {
    private Long idEvento;
    private String nomeEvento;
}
