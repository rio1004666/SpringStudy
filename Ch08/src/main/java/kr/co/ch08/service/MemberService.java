package kr.co.ch08.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch08.dao.MemberDao;
import kr.co.ch08.vo.MemberVo;
@Service
public class MemberService {
	@Autowired
	private MemberDao dao;
	
	public void insertUser(MemberVo vo) {
		dao.insertMember(vo);
	}
	public MemberVo selectMember(String uid) {
		return dao.selectMember(uid);
	}
	public List<MemberVo> selectMembers() {
		return dao.selectMembers();
	}
	public void updateMember(MemberVo vo) {
		dao.updateMember(vo);
	}
	public void deleteUser(String uid) {
		dao.deleteMember(uid);
	}
}
