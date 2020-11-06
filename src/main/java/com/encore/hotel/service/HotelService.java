package com.encore.hotel.service;

import java.util.List;

import com.encore.hotel.domain.HotelDto;

public interface HotelService {
	int addHotel(HotelDto hotel) throws Exception;
	int updateHotel(HotelDto hotel) throws Exception;
	int removeHotel(String id) throws Exception;
	HotelDto getHotel(String id) throws Exception;
	List<HotelDto> getHotelList() throws Exception;
	List<HotelDto> getLikeHotelName(String name) throws Exception;
}
