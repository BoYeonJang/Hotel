package com.encore.hotel.repo;

import java.util.List;

import com.encore.hotel.domain.OptionDto;
import com.encore.hotel.domain.RoomDto;



public interface RoomDAO {
	int addRoom(RoomDto room) throws Exception;
	int updateRoom(RoomDto room) throws Exception;
	int removeRoom(int id) throws Exception;
	RoomDto getRoomById(int id) throws Exception;
	List<RoomDto> getRoomByHotelId(String id) throws Exception;
	List<RoomDto> getRoomList() throws Exception;
	List<RoomDto> getPeopleLimit(int limit) throws Exception;
	List<RoomDto> getAllOptionApply(OptionDto dto) throws Exception;
}
