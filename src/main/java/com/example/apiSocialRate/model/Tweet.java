package com.example.apiSocialRate.model;

import com.example.apiSocialRate.controller.dto.TweetDTO;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Tweet {
    @Id
    @GeneratedValue
    private Long idTweet;
    @ManyToOne(targetEntity = Evento.class)
    @JoinColumn(name = "evento_id")
    private Long idEvento; // Chave extrangeira da tabela Evento
    private Long quantidadeTweet;
    private String catSentimentoTweet;
    private String catVariadaTweet;
    private String generoAutorTweet;
    private String numeroComentsTweet;
    private String idiomaTweet;

    public Tweet (TweetDTO tweetDTO){
        this.quantidadeTweet = tweetDTO.getQuantidadeTweet();
        this.catSentimentoTweet = tweetDTO.getCatSentimentoTweet();
        this.catVariadaTweet = tweetDTO.getCatVariadaTweet();
        this.generoAutorTweet = tweetDTO.getGeneroAutorTweet();
        this.numeroComentsTweet = tweetDTO.getNumeroComentsTweet();
        this.idiomaTweet = tweetDTO.getIdiomaTweet();
    }

}
