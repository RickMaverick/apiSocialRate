package com.example.apiSocialRate.repository;

import com.example.apiSocialRate.model.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
}
