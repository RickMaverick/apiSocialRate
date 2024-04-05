package com.example.apiSocialRate.controller;

import com.example.apiSocialRate.controller.dto.TweetDTO;
import com.example.apiSocialRate.model.Tweet;
import com.example.apiSocialRate.service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tweets")
public class TweetController {

    private TweetService tweetService;

    @Autowired
    public TweetController(TweetService tweetService){this.tweetService = tweetService;}

    @PostMapping
    public ResponseEntity<Tweet> inserirTweet(@RequestBody TweetDTO tweetDTO){
        return ResponseEntity.ok(tweetService.cadastraTweet(tweetDTO));
    }

    @GetMapping
    public ResponseEntity<List<Tweet>> buscarTodosOsTweets(){
        return ResponseEntity.ok(tweetService.listarTodosOsTweets());
    }

}
