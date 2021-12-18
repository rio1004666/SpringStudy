package kr.co.ch05.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.ch05.vo.UserVo;

@Repository
public class UserDao {

    @Inject
    private SqlSessionTemplate mybatis;

    
    
    public void insertUser(UserVo vo) {
    	mybatis.insert("mapper.user.insertUser", vo); // 여기서 쿼리문은 mapper폴더에서 user.xml파일에 정의한다.
    }
    
    
    
    public UserVo selectUser(String uid) {
    	// select결과가 하나이므로 selectOne
    	return mybatis.selectOne("mapper.user.selectUser", uid);
    }
    
    
    public List<UserVo> selectUsers() {
    	
    	List<UserVo> users = mybatis.selectList("mapper.user.selectUsers");
    	return users;
    }
    
    
    
    public void updateUser(UserVo vo) {
    	mybatis.update("mapper.user.updateUser",vo);
    }
    public void deleteUser(String uid) {
    	mybatis.delete("mapper.user.deleteUser",uid);
    }
}