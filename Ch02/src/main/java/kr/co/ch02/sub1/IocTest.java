package kr.co.ch02.sub1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 
 * 날짜: 2021/10/11
 * 이름: 강병화
 * 내용: 스프링 Ioc 실습하기 
 * 
 * 
 * */
/*
 *  IoC(제어의 역행)
 *  
 *   - 자바 객체를 생성하고 객체들 사이의 의존관계를 스프링 컨테이너로 처리하는 개념  
 * 	 - 스프링 IoC를 이용해서 객체간의 결합도를 완화 효과 
 *   - IoC를 구현하는 기술이 DI(Dependency Injection)
 *   - DI 기법 중 어노테이션 기법을 가장 많이 사용 
 *   
 * */


public class IocTest {
	
	// 스프링 컨테이너는 무수히 많이 등록된 객체를 관리하는 역할
	// 스프링컨테이너에 이미 등록했했고 힙영역에 객체가 이미 생성되어 있다.
	// 그래서 스프링 컨테이너가 주입을 하면 참조변수에 연결만 시켜준다.
	
//	@Autowired
//	private LgTv lgtv;
//	
//	@Inject
//	private SamsungTv samsungtv;
	
	
	
	public static void main(String[] args) {
		
		//DI를 활용하지 않은 객체 생성 
		
		// 객체를 servlet-context.xml에 등록해야한다. 
		// 프로그램 실행 중에 생성되는 객체를 동적 생성 객체라고 한다. 
		// Spring Container (IOC Container)가 서비스 객체들을 관리해주는것과 같다(모델2에서) 
		// 근데 스프링에서는 설정작업이 많기때문에 이것이 가장 불편한점이 되어 스프링 부트로 넘어가게 된다. 
		TV ltv = new LgTv(); 
		TV stv = new SamsungTv();
		ltv.powerOn();
		ltv.powerOff();
		ltv.chDown();
		ltv.chUp();
		stv.powerOn();
		stv.powerOff();
		stv.chUp();
		stv.chDown();
		
		// DI를 활용한 객체 생성 
		
		// 스프링 설정파일로 만든 스프링 컨텍스트 객체 => 이놈이 관리하는 객체를 설정파일에 등록한다. 
		// 이름이 id에 해당되는 부분이다. 
		// 이름에 해당되는 클래스이름의 객체를 생성해서 꺼내온다 getBean을 통해서.
		// 원래는 @Component 로 IOC 컨테이너에 객체를 등록한다 하지만 되지 않아서 
		// 여기서 xml파일에 임의적으로 등록해서 주입을 받는다. 
		
		
		// 스프링 컨테이너에 등록된 객체를 가져와 실행하는 방식 
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:root-context.xml");
		
		
		TV lgTv = (TV) ctx.getBean("lgTv"); /* root-context.xml에 정의해놓은 bean id의 클래스를 연동해서 가져온다.*/
		TV samsungTv = (TV) ctx.getBean("samsungTv");
		lgTv.powerOn();
		lgTv.chDown();
		lgTv.soundUp();
		lgTv.chUp();
		lgTv.powerOff();
		samsungTv.powerOn();
		samsungTv.chUp();
		samsungTv.soundDown();
		samsungTv.chDown();
		samsungTv.powerOff();
		
		// DI 어노테이션 기법을 활용한 객체 주입 
	
//		IocTest ioc = new IocTest();
//		ioc.lgtv.powerOn();
		
	}
}
