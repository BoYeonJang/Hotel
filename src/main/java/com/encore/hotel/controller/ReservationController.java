package com.encore.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.encore.hotel.domain.ReservationDto;
import com.encore.hotel.domain.chartDto;
import com.encore.hotel.service.ReservationService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins= {"*"}, maxAge=6000)
@Api(tags= {"Encore Hotels"})
public class ReservationController {
	
	@Autowired
	private ReservationService service;
	
	@ApiOperation(value="예약 하기", response=Boolean.class)
	@PostMapping("/addReservation")
	public ResponseEntity addReservation(@RequestBody ReservationDto dto) throws Exception {
		if(!(service.addReservation(dto))) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@ApiOperation(value="내가 한 예약 가져오기", response=List.class)
	@GetMapping("/findReservationByMemberId/{memberId}")
	public ResponseEntity findReservationByMemberId(@PathVariable String memberId) throws Exception {
		List<ReservationDto> reservations = service.getReservationByMemberId(memberId);
		if(reservations.isEmpty()) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(reservations, HttpStatus.OK);
	}
	
	@ApiOperation(value="예약 삭제하기", response=boolean.class)
	@DeleteMapping("/deleteReservation/{id}")
	public ResponseEntity deleteReservation(@PathVariable int id) throws Exception {
		if(service.deleteReservation(id)) return new ResponseEntity(HttpStatus.OK);
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
	
	@ApiOperation(value="특정 예약 검색하기", response=ReservationDto.class)
	@GetMapping("/findReservationById/{id}")
	public ResponseEntity findReservationById(@PathVariable int id) throws Exception {
		ReservationDto dto = service.getReservationById(id);
		if(dto == null) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(dto, HttpStatus.OK);
	}
	
	@ApiOperation(value="전체 예약 목록 불러오기", response=List.class)
	@GetMapping("/findAllReservation")
	public ResponseEntity findAllReservation() throws Exception {
		List<ReservationDto> reservations = service.getAllReservation();
		if(reservations.isEmpty()) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(reservations, HttpStatus.OK);
	}
	
	@GetMapping("/findReservationMounth")
	public ResponseEntity<List<chartDto>> findReservationMounth() throws Exception{
		List<chartDto> rooms=service.getMonth();
		
		if(rooms.isEmpty()) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(rooms,HttpStatus.OK);
	}

}


