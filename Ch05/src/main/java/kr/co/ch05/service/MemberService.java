package kr.co.ch05.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch05.dao.MemberDao;
import kr.co.ch05.vo.MemberVo;

@Service
public class MemberService {
	@Autowired
	private MemberDao dao;
	
	public void insertMember(MemberVo vo) {
		dao.insertMember(vo);	
	}
	public void selectMember() {
		dao.selectMember();
	}
	public List<MemberVo> selectMembers() {
		return dao.selectMembers();
	}
	public void updateMember() {
		dao.updateMember();
	}
	public void deleteMember() {
		
		dao.deleteMember();
	}
		
}
