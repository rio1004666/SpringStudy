package kr.co.ch08.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.ch08.vo.UserVo;

@Repository
public interface UserDao { // 추상메서드로 설정하여 mappers에서 실행되도록한다 
	public void insertUser(UserVo vo);
	public UserVo selectUser(String uid); // 여기서부터는 쿼리함수이다.
	public List<UserVo> selectUsers();
	public void updateUser(UserVo vo);
	public void deleteUser(String uid);
}
