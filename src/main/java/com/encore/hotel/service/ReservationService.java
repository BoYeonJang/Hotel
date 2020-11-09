package com.encore.hotel.service;

import java.util.List;

import com.encore.hotel.domain.ReservationDto;
import com.encore.hotel.domain.chartDto;

public interface ReservationService {
	public boolean addReservation(ReservationDto dto) throws Exception;
	public List<ReservationDto> getReservationByMemberId(String memberId) throws Exception;
	public boolean deleteReservation(int id)throws Exception;
	public ReservationDto getReservationById(int id)  throws Exception;
	public List<ReservationDto> getAllReservation() throws Exception;
	public List<chartDto> getMonth() throws Exception;
}
