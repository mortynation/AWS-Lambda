package com.awsl.songreviewsservice.controller;

import com.awsl.songreviewsservice.entity.SongReview;
import com.awsl.songreviewsservice.service.SongReviewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/songReviews")
public class SongReviewsController {

    @Autowired
    private SongReviewsService songReviewsService;

    @PostMapping("/")
    public SongReview saveSongReview(@RequestBody SongReview songReview){
        return songReviewsService.saveSongReview(songReview);
    }

    @GetMapping("/get")
    public List<SongReview> getSongReviews(){
        return songReviewsService.getSongReviews();
    }
}
