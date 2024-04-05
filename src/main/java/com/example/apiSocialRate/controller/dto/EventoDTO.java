package com.example.apiSocialRate.controller.dto;

import com.example.apiSocialRate.model.Tweet;
import lombok.Data;
import java.util.List;

@Data
public class EventoDTO {
    private String nomeEvento;
    private List<Tweet> tweetsEvento;
}
