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

import com.encore.hotel.domain.ReviewDto;
import com.encore.hotel.service.ReviewService;


@RestController
@CrossOrigin(origins= {"*"}, maxAge=6000)
public class ReviewController {
	@Autowired
	private ReviewService service;
	
	@PostMapping("/addReview")
	public ResponseEntity addReview(@RequestBody ReviewDto review) throws Exception{
		int result = service.addReview(review);
		if(result<1) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@PutMapping("/updateReview")
	public ResponseEntity updateReview(@RequestBody ReviewDto review) throws Exception{
		int result = service.updateReview(review);
		if(result<1) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(HttpStatus.OK);
	}
	@DeleteMapping("/deleteReview/{id}")
	public ResponseEntity deleteReview(@PathVariable int id) throws Exception{
		int result = service.removeReview(id);
		if(result<1) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@GetMapping("/findReviewById/{id}")
	public ResponseEntity findHotelById(@PathVariable int id) throws Exception{
		ReviewDto review=service.getReviewById(id);
		if(review==null) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(review,HttpStatus.OK);
	}
	
	@GetMapping("/findReviewByHotelId/{hotelId}")
	public ResponseEntity findReviewByHotelId(@PathVariable String hotelId) throws Exception{
		ReviewDto review=service.getReviewByHotelId(hotelId);
		if(review==null) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(review,HttpStatus.OK);
	}
	
	@GetMapping("/findReviewByMemberId/{memberId}")
	public ResponseEntity findReviewByMemberId(@PathVariable String memberId) throws Exception{
		ReviewDto review=service.getReviewByMemberId(memberId);
		if(review==null) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(review,HttpStatus.OK);
	}
	
	@GetMapping("/findReviewByScore/{score}")
	public ResponseEntity findReviewByScore(@PathVariable String score) throws Exception{
		ReviewDto review=service.getReviewByScore(score);
		if(review==null) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(review,HttpStatus.OK);
	}
	
	@GetMapping("/findAllReview")
	public ResponseEntity<List<ReviewDto>> findAllHotel() throws Exception{
		List<ReviewDto> reivews=service.getReviewList();
		if(reivews.isEmpty()) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(reivews,HttpStatus.OK);
	}
	
	
	
}
