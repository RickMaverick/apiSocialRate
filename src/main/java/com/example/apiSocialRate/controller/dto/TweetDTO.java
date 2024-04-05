package com.example.apiSocialRate.controller.dto;

import lombok.Data;

@Data
public class TweetDTO {
    private Long quantidadeTweet;
    private String catSentimentoTweet;
    private String catVariadaTweet;
    private String generoAutorTweet;
    private String numeroComentsTweet;
    private String idiomaTweet;
}
