package com.encore.hotel.repo;

import java.util.List;

import com.encore.hotel.domain.MemberDto;

public interface MemberDao {
	public boolean registMember(MemberDto dto) throws Exception;
	public boolean updateMember(MemberDto dto) throws Exception;
	public boolean deleteMember(String id) throws Exception;
	public List<MemberDto> getAllMember() throws Exception;
	public MemberDto getMemberById(String id) throws Exception;
	public MemberDto loginMember(MemberDto dto) throws Exception;
	
}
