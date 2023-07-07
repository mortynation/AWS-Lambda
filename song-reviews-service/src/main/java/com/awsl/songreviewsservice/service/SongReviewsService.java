package com.awsl.songreviewsservice.service;

import com.awsl.songreviewsservice.entity.SongReview;
import com.awsl.songreviewsservice.repository.SongReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongReviewsService {

    @Autowired
    private SongReviewsRepository songReviewsRepository;

    public SongReview saveSongReview(SongReview songReview){
         return songReviewsRepository.save(songReview);
    }

    public List<SongReview> getSongReviews(){
        return songReviewsRepository.findAll();
    }
}
