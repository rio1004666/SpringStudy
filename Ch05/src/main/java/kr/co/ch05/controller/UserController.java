package kr.co.ch05.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.ch05.service.UserService;
import kr.co.ch05.vo.UserVo;

@Controller
public class UserController {
	@Autowired
	private UserService service;
	

    @RequestMapping(value= "/user/list", method = RequestMethod.GET)
    public String list(Model model) {
    	List<UserVo> users = service.selectUsers();
        model.addAttribute("users", users); //request��ü�� ����ص��ǰ�
        // model��ü�� �̿��ؼ� ������������ ������ �� �ֵ��� ���ش�.
        return "/user/list";
    }

    @GetMapping("/user/register")
    public String register() {
        return "/user/register";
    }

    @PostMapping("/user/register")
    public String register(UserVo vo) {
    	service.insertUser(vo);
        return "redirect:/user/register";
    }
    @GetMapping("/user/modify")
    public String modify(String uid, Model model) {
    	
    	UserVo user = service.selectUser(uid);
    	model.addAttribute(user); // ��ü���� ǥ����ϸ� �ҹ��ڽ��� ��, userVo�� Ű���� �ȴ�. 
    	
        return "/user/modify";
    }
    @PostMapping("/user/modify")
    public String modify(UserVo vo) {
    	service.updateUser(vo);
    	return "redirect:/user/list";
    }
    @GetMapping("/user/delete")
    public String delete(String uid) {
    	service.deleteUser(uid);
    	return "redirect:/user/list";
    }
}