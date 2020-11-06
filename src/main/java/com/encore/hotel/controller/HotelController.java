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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.encore.hotel.domain.HotelDto;
import com.encore.hotel.service.HotelService;

@RestController
@CrossOrigin(origins= {"*"}, maxAge=6000)
public class HotelController {
	@Autowired
	private HotelService service;
	
	@PostMapping("/addHotel")
	public ResponseEntity addHotel(@RequestBody HotelDto hotel) throws Exception{
		service.addHotel(hotel);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@PutMapping("/updateHotel")
	public ResponseEntity updateHotel(@RequestBody HotelDto hotel) throws Exception{
		int result = service.updateHotel(hotel);
		if(result<1) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(HttpStatus.OK);
	}
	@DeleteMapping("/deleteHotel/{id}")
	public ResponseEntity deleteHotel(@PathVariable String id) throws Exception{
		int result = service.removeHotel(id);
		if(result<1) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@GetMapping("/findHotelById/{id}")
	public ResponseEntity findHotelById(@PathVariable String id) throws Exception{
		HotelDto hotel=service.getHotel(id);
		if(hotel==null) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(hotel,HttpStatus.OK);
	}
	
	@GetMapping("/findAllHotel")
	public ResponseEntity<List<HotelDto>> findAllHotel() throws Exception{
		List<HotelDto> hotels=service.getHotelList();
		if(hotels.isEmpty()) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(hotels,HttpStatus.OK);
	}
	
	@GetMapping("/findLikeHotelName/{name}")
	public ResponseEntity<List<HotelDto>> findLikeHotelName(@PathVariable String name) throws Exception{
		List<HotelDto> hotels=service.getLikeHotelName(name);
		if(hotels.isEmpty()) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(hotels,HttpStatus.OK);
	}
	
}
