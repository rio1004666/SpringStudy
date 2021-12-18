package kr.co.ch08.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.ch08.service.MemberService;
import kr.co.ch08.vo.MemberVo;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	
	@GetMapping("/member/list")
	public String list(Model model) {
		List<MemberVo> memers = service.selectMembers();
		model.addAttribute("members",memers);
		return "/member/list";
		
	}
	
	
	
	@GetMapping("/member/register")
	public String register() {
		
		return "/member/register";
	}
	@PostMapping("/member/register")
	public String register(MemberVo vo) {
		service.insertUser(vo);
		return "redirect:/member/list";
	}
	
	@GetMapping("/member/modify")
	public String modify(String uid, Model model) {
		MemberVo vo = service.selectMember(uid);
		model.addAttribute(vo); // 키값은 memberVo로 잡힌다. 
		return"/member/modify";
	}
	
	@PostMapping("/member/modify")
	public String modify(MemberVo vo) {
		service.updateMember(vo);
		return "redirect:/member/list";
	}
	
	@GetMapping("/member/delete")
	public String delete(String uid) {
		service.deleteUser(uid);
		return "redirect:/member/list";
	}
}
