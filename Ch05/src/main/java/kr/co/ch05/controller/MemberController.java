package kr.co.ch05.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.ch05.service.MemberService;
import kr.co.ch05.vo.MemberVo;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	
	@GetMapping("/member/list")
	public String list(Model model) {
		
		List<MemberVo> members = service.selectMembers();
		
		model.addAttribute("members", members);
		return "/member/list";
	}
	@GetMapping("/member/register")
	public String register() {
		return "/member/register";
		
	}
	@PostMapping("/member/register")
	public String register(MemberVo vo) {
		service.insertMember(vo);
		return "redirect:/member/list";
	}
}
