package com.encore.hotel.repo;

import java.util.List;

import com.encore.hotel.domain.ReservationDto;

public interface ReservationDao {
	public boolean addReservation(ReservationDto dto) throws Exception;
	public List<ReservationDto> getReservationByMemberId(String memberId) throws Exception;
	public boolean deleteReservation(int id)throws Exception;
	public ReservationDto getReservationById(int id)  throws Exception;
	public List<ReservationDto> getAllReservation() throws Exception;
}
