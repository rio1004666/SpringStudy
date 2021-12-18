package kr.co.ch08.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.ch08.vo.CustomerVo;

@Repository
public interface CustomerDao {
	public List<CustomerVo> selectCustomers();
}
