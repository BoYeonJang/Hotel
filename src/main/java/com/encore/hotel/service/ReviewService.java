package com.encore.hotel.service;

import java.util.List;

import com.encore.hotel.domain.ReviewDto;

public interface ReviewService {
	int addReview(ReviewDto review) throws Exception;
	int updateReview(ReviewDto review) throws Exception;
	int removeReview(int id) throws Exception;
	ReviewDto getReviewById(int id) throws Exception;
	ReviewDto getReviewByHotelId(String HotelId) throws Exception;
	ReviewDto getReviewByMemberId(String memberId) throws Exception;
	ReviewDto getReviewByScore(String score) throws Exception;
	List<ReviewDto> getReviewList() throws Exception;
}
