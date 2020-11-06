package com.encore.hotel.repo;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.encore.hotel.domain.HotelDto;
import com.encore.hotel.domain.ReviewDto;
import com.encore.hotel.domain.RoomDto;

@Repository
public class ReviewDAOImpl implements ReviewDAO {
	private String ns = "HotelMapper.";
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int addReview(ReviewDto review) throws Exception {
		return sqlSession.insert(ns+"addReview",review);
	}

	@Override
	public int updateReview(ReviewDto review) throws Exception {
		return sqlSession.update(ns+"updateReview",review);
	}

	@Override
	public int removeReview(int id) throws Exception {
		return sqlSession.delete(ns+"deleteReview",id);
	}

	@Override
	public ReviewDto getReviewById(int id) throws Exception {
		return sqlSession.selectOne(ns+"selectReviewById",id);
	}

	@Override
	public ReviewDto getReviewByHotelId(String hotelId) throws Exception {
		return sqlSession.selectOne(ns+"selectReviewByHotelId",hotelId);
	}

	@Override
	public ReviewDto getReviewByMemberId(String memberId) throws Exception {
		return sqlSession.selectOne(ns+"selectReviewByMemberId",memberId);
	}

	@Override
	public ReviewDto getReviewByScore(String score) throws Exception {
		return sqlSession.selectOne(ns+"selectReviewByScore",score);
	}

	@Override
	public List<ReviewDto> getReviewList() throws Exception {
		return sqlSession.selectList(ns+"selectAllReview");
	}

	

}
