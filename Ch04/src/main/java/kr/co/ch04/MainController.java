package kr.co.ch04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@Component  컴포넌트이름은 추상적이다. 그래서 이 클래스가 하는 역할에 의미를 부여하는 것이 좋다 그래서 Controller어노테이션을 붙인다.

@Controller
public class MainController {
	// 시작페이지 설정을 hello로 잡기위해 루트 설정도 같이 해준다.
	@RequestMapping(value={"/","/hello"}, method = RequestMethod.GET) // 요청하는 주소와 방식 
	public String hello()
	{
		return "hello"; // 경로와 확장자 주소는 이제 빠진다. 
	}
	@RequestMapping(value="/welcome", method= RequestMethod.GET)
	public String welcome() {
		return "welcome";
	}
	@GetMapping("/greeting") // 스프링 버전 4부터 => 버전업은 pom.xml springframework-version 올려준다 
	// 위의 요청주소방식을 바로 get어노테이션으로 받는다 
	public String greeting() {
		return "greeting";
	}
}
