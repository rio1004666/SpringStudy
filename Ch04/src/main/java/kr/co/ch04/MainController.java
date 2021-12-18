package kr.co.ch04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@Component  ������Ʈ�̸��� �߻����̴�. �׷��� �� Ŭ������ �ϴ� ���ҿ� �ǹ̸� �ο��ϴ� ���� ���� �׷��� Controller������̼��� ���δ�.

@Controller
public class MainController {
	// ���������� ������ hello�� ������� ��Ʈ ������ ���� ���ش�.
	@RequestMapping(value={"/","/hello"}, method = RequestMethod.GET) // ��û�ϴ� �ּҿ� ��� 
	public String hello()
	{
		return "hello"; // ��ο� Ȯ���� �ּҴ� ���� ������. 
	}
	@RequestMapping(value="/welcome", method= RequestMethod.GET)
	public String welcome() {
		return "welcome";
	}
	@GetMapping("/greeting") // ������ ���� 4���� => �������� pom.xml springframework-version �÷��ش� 
	// ���� ��û�ּҹ���� �ٷ� get������̼����� �޴´� 
	public String greeting() {
		return "greeting";
	}
}
