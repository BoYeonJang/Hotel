package com.encore.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encore.hotel.domain.MemberDto;
import com.encore.hotel.repo.MemberDao;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberDao memberDao;

	@Override
	public boolean registMember(MemberDto dto) throws Exception {
		memberDao.registMember(dto);
		return false;
	}

	@Override
	public boolean updateMember(MemberDto dto) throws Exception {
		memberDao.updateMember(dto);
		return false;
	}

	@Override
	public boolean deleteMember(String id) throws Exception {
		memberDao.deleteMember(id);
		return false;
	}

	@Override
	public List<MemberDto> getAllMember() throws Exception {
		return memberDao.getAllMember();
	}

	@Override
	public MemberDto getMemberById(String id) throws Exception {
		return memberDao.getMemberById(id);
	}

	@Override
	public MemberDto loginMember(MemberDto dto) throws Exception {
		return memberDao.loginMember(dto);
	}

}
