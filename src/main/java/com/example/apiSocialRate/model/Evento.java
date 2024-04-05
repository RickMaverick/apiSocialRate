package com.example.apiSocialRate.model;

import com.example.apiSocialRate.controller.dto.EventoDTO;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Evento {
    @Id
    @GeneratedValue
    private Long idEvento;
    private String nomeEvento;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "evento_id")
    private List<Tweet> tweetsEvento;

    public Evento(EventoDTO eventoDTO) {
        this.nomeEvento = eventoDTO.getNomeEvento();
        this.tweetsEvento = eventoDTO.getTweetsEvento();
    }
}
