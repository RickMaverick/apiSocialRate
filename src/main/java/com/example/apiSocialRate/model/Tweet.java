package com.example.apiSocialRate.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Tweet {
    private Long idTweet;
    private Long quantidadeTweet;
    private String catSentimentoTweet;
    private String catVariadaTweet;
    private String generoAutorTweet;
    private String numeroComentsTweet;
    private String idiomaTweet;

}
