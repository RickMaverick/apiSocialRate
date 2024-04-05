package com.example.apiSocialRate.service;

import com.example.apiSocialRate.controller.dto.TweetDTO;
import com.example.apiSocialRate.model.Tweet;
import com.example.apiSocialRate.repository.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TweetService {
    private TweetRepository tweetRepository;

    private TweetService(TweetRepository tweetRepository){this.tweetRepository = tweetRepository;}

    public Tweet cadastraTweet(TweetDTO tweetDTO){
        Tweet novoTweet = new Tweet(tweetDTO);
        return tweetRepository.save(novoTweet);
    }

    public List<Tweet> listarTodosOsTweets(){return tweetRepository.findAll();}
}
