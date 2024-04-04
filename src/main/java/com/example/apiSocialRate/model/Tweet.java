package com.example.apiSocialRate.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Tweet {
    @Id
    @GeneratedValue
    private Long idTweet;
    private Long idEvento; // Chave extrangeira da tabela Evento
    private Long quantidadeTweet;
    private String catSentimentoTweet;
    private String catVariadaTweet;
    private String generoAutorTweet;
    private String numeroComentsTweet;
    private String idiomaTweet;

}
