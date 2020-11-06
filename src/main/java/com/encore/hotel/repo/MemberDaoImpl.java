package com.encore.hotel.repo;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.encore.hotel.domain.MemberDto;

@Repository
public class MemberDaoImpl implements MemberDao{
	private String ns = "HotelMapper.";
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public boolean registMember(MemberDto dto) throws Exception {
		int result = sqlSession.insert(ns + "registMember", dto);
		if (result > 0) return true;
		return false;
	}

	@Override
	public boolean updateMember(MemberDto dto) throws Exception {
		int result = sqlSession.update(ns + "updateMember", dto);
		if (result > 0) return true;
		return false;
	}

	@Override
	public boolean deleteMember(String id) throws Exception {
		int result = sqlSession.delete(ns + "deleteMember", id);
		if (result > 0) return true;
		return false;
	}

	@Override
	public List<MemberDto> getAllMember() throws Exception {
		return sqlSession.selectList(ns + "getAllMember");
	}

	@Override
	public MemberDto getMemberById(String id) throws Exception {
		return sqlSession.selectOne(ns + "getMemberById", id);
	}

	@Override
	public MemberDto loginMember(MemberDto dto) throws Exception {
		return sqlSession.selectOne(ns + "loginMember", dto);
	}

}
