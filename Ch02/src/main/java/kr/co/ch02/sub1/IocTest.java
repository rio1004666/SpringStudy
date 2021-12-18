package kr.co.ch02.sub1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 
 * ��¥: 2021/10/11
 * �̸�: ����ȭ
 * ����: ������ Ioc �ǽ��ϱ� 
 * 
 * 
 * */
/*
 *  IoC(������ ����)
 *  
 *   - �ڹ� ��ü�� �����ϰ� ��ü�� ������ �������踦 ������ �����̳ʷ� ó���ϴ� ����  
 * 	 - ������ IoC�� �̿��ؼ� ��ü���� ���յ��� ��ȭ ȿ�� 
 *   - IoC�� �����ϴ� ����� DI(Dependency Injection)
 *   - DI ��� �� ������̼� ����� ���� ���� ��� 
 *   
 * */


public class IocTest {
	
	// ������ �����̳ʴ� ������ ���� ��ϵ� ��ü�� �����ϴ� ����
	// �����������̳ʿ� �̹� ������߰� �������� ��ü�� �̹� �����Ǿ� �ִ�.
	// �׷��� ������ �����̳ʰ� ������ �ϸ� ���������� ���Ḹ �����ش�.
	
//	@Autowired
//	private LgTv lgtv;
//	
//	@Inject
//	private SamsungTv samsungtv;
	
	
	
	public static void main(String[] args) {
		
		//DI�� Ȱ������ ���� ��ü ���� 
		
		// ��ü�� servlet-context.xml�� ����ؾ��Ѵ�. 
		// ���α׷� ���� �߿� �����Ǵ� ��ü�� ���� ���� ��ü��� �Ѵ�. 
		// Spring Container (IOC Container)�� ���� ��ü���� �������ִ°Ͱ� ����(��2����) 
		// �ٵ� ������������ �����۾��� ���⶧���� �̰��� ���� ���������� �Ǿ� ������ ��Ʈ�� �Ѿ�� �ȴ�. 
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
		
		// DI�� Ȱ���� ��ü ���� 
		
		// ������ �������Ϸ� ���� ������ ���ؽ�Ʈ ��ü => �̳��� �����ϴ� ��ü�� �������Ͽ� ����Ѵ�. 
		// �̸��� id�� �ش�Ǵ� �κ��̴�. 
		// �̸��� �ش�Ǵ� Ŭ�����̸��� ��ü�� �����ؼ� �����´� getBean�� ���ؼ�.
		// ������ @Component �� IOC �����̳ʿ� ��ü�� ����Ѵ� ������ ���� �ʾƼ� 
		// ���⼭ xml���Ͽ� ���������� ����ؼ� ������ �޴´�. 
		
		
		// ������ �����̳ʿ� ��ϵ� ��ü�� ������ �����ϴ� ��� 
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:root-context.xml");
		
		
		TV lgTv = (TV) ctx.getBean("lgTv"); /* root-context.xml�� �����س��� bean id�� Ŭ������ �����ؼ� �����´�.*/
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
		
		// DI ������̼� ����� Ȱ���� ��ü ���� 
	
//		IocTest ioc = new IocTest();
//		ioc.lgtv.powerOn();
		
	}
}
