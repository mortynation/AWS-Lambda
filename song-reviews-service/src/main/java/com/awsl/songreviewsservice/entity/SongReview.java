package com.awsl.songreviewsservice.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "song_reviews")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SongReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long songReviewId;
    private String songName;
    private String userName;
    private String review;

}
