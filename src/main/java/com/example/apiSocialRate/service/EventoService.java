package com.example.apiSocialRate.service;

import com.example.apiSocialRate.controller.dto.EventoDTO;
import com.example.apiSocialRate.model.Evento;
import com.example.apiSocialRate.repository.EventoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService {
    private EventoRepository eventoRepository;

    private EventoService(EventoRepository eventoRepository){this.eventoRepository = eventoRepository;}

    public Evento cadastraEvento(EventoDTO eventoDTO){
        Evento novoEvento = new Evento(eventoDTO);
        return eventoRepository.save(novoEvento);
    }

    public List<Evento> listarTodosOsEventos() {
        return eventoRepository.findAll();
    }
}
