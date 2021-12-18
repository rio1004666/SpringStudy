package kr.co.ch03.sub1;

import org.springframework.stereotype.Component;

@Component
public class DaoAdvice {
	// Advice : �ΰ���� ����� ���� AOP ������Ʈ

	public void beforeAdvice1() {
		System.out.println("=======================");
		System.out.println("Ⱦ�ܰ��� -- beforeAdvice1");		
	}
	public void beforeAdvice2() {
		System.out.println("=======================");
		System.out.println("Ⱦ�ܰ��� -- beforeAdvice2");
	}
	public void beforeAdvice3() {
		System.out.println("=======================");
		System.out.println("Ⱦ�ܰ��� -- beforeAdvice3");
	}
	
	public void afterAdvice1() {
		System.out.println("Ⱦ�ܰ��� -- afterAdvice1");
		System.out.println("-----------------------");
	}
	public void afterAdvice2() {
		System.out.println("Ⱦ�ܰ��� -- afterAdvice2");
		System.out.println("-----------------------");
	}
	public void afterAdvice3() {
		System.out.println("Ⱦ�ܰ��� -- afterAdvice3");
		System.out.println("-----------------------");
	}
}
