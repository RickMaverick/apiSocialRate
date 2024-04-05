package com.example.apiSocialRate.controller;

import com.example.apiSocialRate.controller.dto.EventoDTO;
import com.example.apiSocialRate.model.Evento;
import com.example.apiSocialRate.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/eventos")
public class EventoController {
    private EventoService eventoService;

    @Autowired
    public EventoController(EventoService eventoService){this.eventoService = eventoService;}

    @GetMapping
    public ResponseEntity<List<Evento>> buscarTodosOsEventos(){
        return ResponseEntity.ok(eventoService.listarTodosOsEventos());
    }

    @PostMapping
    public ResponseEntity<Evento> inserirEvento(@RequestBody EventoDTO eventoDTO){
        return ResponseEntity.ok(eventoService.cadastraEvento(eventoDTO));
    }

}
