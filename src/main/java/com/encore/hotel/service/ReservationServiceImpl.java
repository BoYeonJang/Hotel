package com.encore.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encore.hotel.domain.ReservationDto;
import com.encore.hotel.domain.chartDto;
import com.encore.hotel.repo.ReservationDao;

@Service
public class ReservationServiceImpl implements ReservationService{
	
	@Autowired
	private ReservationDao reservationDao;

	@Override
	public boolean addReservation(ReservationDto dto) throws Exception {
		return reservationDao.addReservation(dto);
	}

	@Override
	public List<ReservationDto> getReservationByMemberId(String memberId) throws Exception {
		return reservationDao.getReservationByMemberId(memberId);
	}

	@Override
	public boolean deleteReservation(int id) throws Exception {
		return reservationDao.deleteReservation(id);
	}

	@Override
	public ReservationDto getReservationById(int id) throws Exception {
		return reservationDao.getReservationById(id);
	}

	@Override
	public List<ReservationDto> getAllReservation() throws Exception {
		return reservationDao.getAllReservation();
	}
	
	@Override
	public List<chartDto> getMonth() throws Exception {
		return reservationDao.getMonth();
	}

}
