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

import com.encore.hotel.domain.OptionDto;
import com.encore.hotel.domain.RoomDto;
import com.encore.hotel.service.RoomService;


@RestController
@CrossOrigin(origins= {"*"}, maxAge=6000)
public class RoomController {
	@Autowired
	private RoomService service;
	
	@PostMapping("/addRoom")
	public ResponseEntity addRoom(@RequestBody RoomDto room) throws Exception{
		service.addRoom(room);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@PutMapping("/updateRoom")
	public ResponseEntity updateRoom(@RequestBody RoomDto room) throws Exception{
		int result = service.updateRoom(room);
		if(result<1) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(HttpStatus.OK);
	}
	@DeleteMapping("/deleteRoom/{id}")
	public ResponseEntity deleteRoom(@PathVariable int id) throws Exception{
		int result = service.removeRoom(id);
		if(result<1) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@GetMapping("/findRoomById/{id}")
	public ResponseEntity findHotelById(@PathVariable int id) throws Exception{
		RoomDto room=service.getRoomById(id);
		if(room==null) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(room,HttpStatus.OK);
	}
	
	@GetMapping("/findRoomByHotelId/{id}")
	public ResponseEntity findRoomByHotelId(@PathVariable String id) throws Exception{
		List<RoomDto> rooms=service.getRoomByHotelId(id);
		if(rooms.isEmpty()) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(rooms,HttpStatus.OK);
	}
	
	
	@GetMapping("/findAllRoom")
	public ResponseEntity<List<RoomDto>> findAllHotel() throws Exception{
		List<RoomDto> rooms=service.getRoomList();
		if(rooms.isEmpty()) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(rooms,HttpStatus.OK);
	}
	
	@GetMapping("/findPeopleLimit/{limit}")
	public ResponseEntity<List<RoomDto>> findPeopleLimit(@PathVariable int limit) throws Exception{
		List<RoomDto> rooms=service.getPeopleLimit(limit);
		if(rooms.isEmpty()) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(rooms,HttpStatus.OK);
	}
	
	@PostMapping("/findAllOptionApply")
	public ResponseEntity<List<RoomDto>> findAllOptionApply(@RequestBody OptionDto dto) throws Exception{
		System.out.println("여기");
		List<RoomDto> rooms=service.getAllOptionApply(dto);
		System.out.println(rooms);
		for (RoomDto roomDto : rooms) {
			System.out.println(roomDto);
		}
		if(rooms.isEmpty()) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(rooms,HttpStatus.OK);
	}
	
	
}
