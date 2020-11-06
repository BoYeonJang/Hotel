package com.encore.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encore.hotel.domain.HotelDto;
import com.encore.hotel.repo.HotelDAO;

@Service
public class HotelServiceImpl implements HotelService {
	@Autowired
	private HotelDAO hoteldao;

	@Override
	public int addHotel(HotelDto hotel) throws Exception {
		return hoteldao.addHotel(hotel);
	}

	@Override
	public int updateHotel(HotelDto hotel) throws Exception {
		return hoteldao.updateHotel(hotel);
	}

	@Override
	public int removeHotel(String id) throws Exception {
		return hoteldao.removeHotel(id);
	}

	@Override
	public HotelDto getHotel(String id) throws Exception {
		return hoteldao.getHotel(id);
	}

	@Override
	public List<HotelDto> getHotelList() throws Exception {
		return hoteldao.getHotelList();
	}

	@Override
	public List<HotelDto> getLikeHotelName(String name) throws Exception {
		return hoteldao.getLikeHotelName(name);
	}
}
