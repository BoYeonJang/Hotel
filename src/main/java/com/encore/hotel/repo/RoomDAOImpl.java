package com.encore.hotel.repo;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.encore.hotel.domain.OptionDto;
import com.encore.hotel.domain.RoomDto;

@Repository
public class RoomDAOImpl implements RoomDAO {
	private String ns = "HotelMapper.";
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int addRoom(RoomDto room) throws Exception {
		return sqlSession.insert(ns+"addRoom", room);
	}

	@Override
	public int updateRoom(RoomDto room) throws Exception {
		return sqlSession.update(ns+"updateRoom",room);
	}

	@Override
	public int removeRoom(int id) throws Exception {
		return sqlSession.delete(ns+"deleteRoom",id);
	}

	@Override
	public RoomDto getRoomById(int id) throws Exception {
		return sqlSession.selectOne(ns+"selectRoomById",id);
	}

	@Override
	public List<RoomDto> getRoomByHotelId(String id) throws Exception {
		return sqlSession.selectList(ns+"selectRoomByHotelId",id);
	}

	@Override
	public List<RoomDto> getRoomList() throws Exception {
		return sqlSession.selectList(ns+"selectAllRoom");
	}
	@Override
	public List<RoomDto> getPeopleLimit(int limit) throws Exception {
		return sqlSession.selectList(ns+"selectPeopleLimit",limit);
	}

	@Override
	public List<RoomDto> getAllOptionApply(OptionDto dto) throws Exception {
		return sqlSession.selectList(ns+"selectAllOptionApply",dto);
	}
	

}
