package com.encore.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encore.hotel.domain.OptionDto;
import com.encore.hotel.domain.RoomDto;
import com.encore.hotel.repo.RoomDAO;

@Service
public class RoomServiceImpl implements RoomService{

	@Autowired
	private RoomDAO roomdao;

	@Override
	public int addRoom(RoomDto room) throws Exception {
		return roomdao.addRoom(room);
	}

	@Override
	public int updateRoom(RoomDto room) throws Exception {
		return roomdao.updateRoom(room);
	}

	@Override
	public int removeRoom(int id) throws Exception {
		return roomdao.removeRoom(id);
	}

	@Override
	public RoomDto getRoomById(int id) throws Exception {
		return roomdao.getRoomById(id);
	}

	@Override
	public List<RoomDto> getRoomByHotelId(String id) throws Exception {
		return roomdao.getRoomByHotelId(id);
	}

	@Override
	public List<RoomDto> getRoomList() throws Exception {
		return roomdao.getRoomList();
	}

	@Override
	public List<RoomDto> getPeopleLimit(int limit) throws Exception {
		return roomdao.getPeopleLimit(limit);
	}

	@Override
	public List<RoomDto> getAllOptionApply(OptionDto dto) throws Exception {
		return roomdao.getAllOptionApply(dto);
	}
}
