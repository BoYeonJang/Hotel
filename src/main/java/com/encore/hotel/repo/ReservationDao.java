package com.encore.hotel.repo;

import java.util.List;

import com.encore.hotel.domain.ReservationDto;
import com.encore.hotel.domain.chartDto;

public interface ReservationDao {
	public boolean addReservation(ReservationDto dto) throws Exception;
	public List<ReservationDto> getReservationByMemberId(String memberId) throws Exception;
	public boolean deleteReservation(int id)throws Exception;
	public ReservationDto getReservationById(int id)  throws Exception;
	List<ReservationDto> getAllReservation() throws Exception;
	List<chartDto> getMonth() throws Exception;
}
