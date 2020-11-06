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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.encore.hotel.domain.MemberDto;
import com.encore.hotel.service.MemberService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins= {"*"}, maxAge=6000)
@Api(tags= {"Encore Hotels"})
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	@ApiOperation(value="회원 가입", response=Boolean.class)
	@PostMapping("/registMember")
	public ResponseEntity registMember(@RequestBody MemberDto dto) throws Exception {
		if(!(service.registMember(dto))) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@ApiOperation(value="회원 수정", response=Boolean.class)
	@PutMapping("/updateMember")
	public ResponseEntity updateMember(@RequestBody MemberDto dto) throws Exception {
		if (!(service.updateMember(dto))) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@ApiOperation(value="아이디에 해당하는 회원을 삭제 한다.", response=Boolean.class)
	@DeleteMapping("/deleteMember/{id}")
	public ResponseEntity deleteMember(@PathVariable String id) throws Exception {
		if (!(service.deleteMember(id))) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@ApiOperation(value="모든 회원을 조회한다.", response=List.class)
	@GetMapping("/findAllMember")
	public ResponseEntity findAllMember() throws Exception {
		List<MemberDto> members = service.getAllMember();
		if (members.isEmpty()) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(members, HttpStatus.OK);
	}
	
	@ApiOperation(value="아이디로 회원을 조회한다.", response=MemberDto.class)
	@GetMapping("/findMemberById/{id}")
	public ResponseEntity findMemberById(@PathVariable String id) throws Exception {
		MemberDto member = service.getMemberById(id);
		if (member == null) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(member, HttpStatus.OK);
	}
	
	@ApiOperation(value="로그인", response=MemberDto.class)
	@PostMapping("/loginMember")
	public ResponseEntity loginMember(@RequestBody MemberDto dto) throws Exception {
		MemberDto member = service.loginMember(dto);
		if (member == null) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(member, HttpStatus.OK);
	}
	

}

