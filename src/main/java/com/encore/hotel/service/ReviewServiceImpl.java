package com.encore.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encore.hotel.domain.ReviewDto;
import com.encore.hotel.repo.ReviewDAO;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	private ReviewDAO reviewdao;

	@Override
	public int addReview(ReviewDto review) throws Exception {
		return reviewdao.addReview(review);
	}

	@Override
	public int updateReview(ReviewDto review) throws Exception {
		return reviewdao.updateReview(review);
	}

	@Override
	public int removeReview(int id) throws Exception {
		return reviewdao.removeReview(id);
	}

	@Override
	public ReviewDto getReviewById(int id) throws Exception {
		return reviewdao.getReviewById(id);
	}

	@Override
	public ReviewDto getReviewByHotelId(String HotelId) throws Exception {
		return reviewdao.getReviewByHotelId(HotelId);
	}

	@Override
	public ReviewDto getReviewByMemberId(String memberId) throws Exception {
		return reviewdao.getReviewByMemberId(memberId);
	}

	@Override
	public ReviewDto getReviewByScore(String score) throws Exception {
		return reviewdao.getReviewByScore(score);
	}

	@Override
	public List<ReviewDto> getReviewList() throws Exception {
		return reviewdao.getReviewList();
	}
}
