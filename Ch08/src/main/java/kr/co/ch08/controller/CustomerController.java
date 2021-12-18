package kr.co.ch08.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.ch08.service.CustomerService;
import kr.co.ch08.vo.CustomerVo;

@Controller
public class CustomerController {
	
	
	@Autowired
	private CustomerService service;
	
	
	
	@GetMapping("/customer/list")
	public String list(Model model) {
		List<CustomerVo> customers = service.selectCustomers();
		model.addAttribute("customers",customers);
		return "/customer/list";
	}
	
	
	
	
	
	@GetMapping("/customer/register")
	public String register() {
		return "/customer/register";
	}
	@GetMapping("/customer/modify")
	public String modify() {
		return"/customer/modify";
	}
	@GetMapping("/customer/delete")
	public String delete() {
		return "redirect:/customer/list";
	}
}
