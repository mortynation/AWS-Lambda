package com.awsl.songreviewsservice.repository;

import com.awsl.songreviewsservice.entity.SongReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongReviewsRepository extends JpaRepository<SongReview, Long> {

}
