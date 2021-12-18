package kr.co.ch08.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch08.dao.CustomerDao;
import kr.co.ch08.vo.CustomerVo;
@Service
public class CustomerService {
	@Autowired
	private CustomerDao dao;
	public List<CustomerVo> selectCustomers(){
		return dao.selectCustomers();
	}
}
