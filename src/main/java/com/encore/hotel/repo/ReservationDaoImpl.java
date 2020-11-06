package com.encore.hotel.repo;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.encore.hotel.domain.ReservationDto;

@Repository
public class ReservationDaoImpl implements ReservationDao{
	private String ns = "HotelMapper.";
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public boolean addReservation(ReservationDto dto) throws Exception {
		int result = sqlSession.insert(ns + "addReservation", dto);
		if (result > 0) return true; 
		return false;
	}

	@Override
	public List<ReservationDto> getReservationByMemberId(String memberId) throws Exception {
		return sqlSession.selectList(ns + "getReservationByMemberId", memberId);
	}

	@Override
	public boolean deleteReservation(int id) throws Exception {
		int result = sqlSession.delete(ns + "deleteReservation", id);
		if (result > 0) return true; 
		return false;
	}

	@Override
	public ReservationDto getReservationById(int id) throws Exception {
		return sqlSession.selectOne(ns + "getReservationById", id);
	}

	@Override
	public List<ReservationDto> getAllReservation() throws Exception {
		return sqlSession.selectList(ns + "getAllReservation");
	}
	
	

}
