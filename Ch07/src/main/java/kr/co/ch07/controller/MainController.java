package kr.co.ch07.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.ch07.vo.UserVo;

@Controller
public class MainController {

	@GetMapping(value={"/","/index"})
	public String index(Model model) {
		
		String title = "스프링 타임리프 실습";
		String hello = "Hello Thymeleaf !!!!!!";
		UserVo user = new UserVo();
		user.setUid("a101");
		user.setName("홍길동");
		user.setHp("010-1234-1111");
		user.setAge(21);
		
		List<UserVo> users = new ArrayList<>();
		users.add(new UserVo("a101","김유신","010-1234-0001",23));
		users.add(new UserVo("a102","김춘추","010-1234-0002",26));
		users.add(new UserVo("a103","장보고","010-1234-0003",29));
		users.add(new UserVo("a104","강감찬","010-1234-0004",18));
		users.add(new UserVo("a105","이순신","010-1234-0005",12));
		
		model.addAttribute("title", title);
		model.addAttribute("hello", hello);
		model.addAttribute(user); // 참조할때 클래스 이름 소문자시작으로 참조변수가 정해진다. 즉 userVo로 정해진다.
		model.addAttribute("users",users); // 제네릭타임은 참조변수로 설정할 수 없어서 키값으로 정해준다.
		return "/index";
	}
	
	@GetMapping("/include")
	public String include() {
		return "/include";
	}
}
