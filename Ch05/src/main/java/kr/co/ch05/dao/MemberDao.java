package kr.co.ch05.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.ch05.vo.MemberVo;
@Repository
public class MemberDao {
	@Inject
    private SqlSessionTemplate mybatis;
	
	public void insertMember(MemberVo vo) {
		
	}
	public void selectMember() {
		
	}
	public List<MemberVo> selectMembers() {
		List<MemberVo> members = mybatis.selectList("mapper.user.selectMembers");
		return members;
	}
	public void updateMember() {
		
	}
	public void deleteMember() {
		
	}
	
}
