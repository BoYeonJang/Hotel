package com.encore.hotel.repo;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.encore.hotel.domain.HotelDto;

@Repository
public class HotelDAOImpl implements HotelDAO {
	private String ns = "HotelMapper.";
	
	@Autowired
	private SqlSession sqlSession;
	@Override
	public int addHotel(HotelDto hotel) throws Exception {
		return sqlSession.insert(ns+"addHotel",hotel);
	}

	@Override
	public int updateHotel(HotelDto hotel) throws Exception {
		
		return sqlSession.update(ns+"updateHotel",hotel);
		
	}

	@Override
	public int removeHotel(String id) throws Exception {
		return sqlSession.delete(ns+"deleteHotel",id);
	}

	@Override
	public HotelDto getHotel(String id) throws Exception {
		return sqlSession.selectOne(ns+"selectHotelById",id);
	}

	@Override
	public List<HotelDto> getHotelList() throws Exception {
		return sqlSession.selectList(ns+"selectAllHotel");
	}
	
	@Override
	public List<HotelDto> getLikeHotelName(String name) throws Exception {
		return sqlSession.selectList(ns+"selectLikeHotelName", name);
	}

}
