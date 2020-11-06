package com.encore.hotel.service;

import java.util.List;

import com.encore.hotel.domain.MemberDto;

public interface MemberService {
	public boolean registMember(MemberDto dto) throws Exception;
	public boolean updateMember(MemberDto dto) throws Exception;
	public boolean deleteMember(String id) throws Exception;
	public List<MemberDto> getAllMember() throws Exception;
	public MemberDto getMemberById(String id) throws Exception;
	public MemberDto loginMember(MemberDto dto) throws Exception;
}
