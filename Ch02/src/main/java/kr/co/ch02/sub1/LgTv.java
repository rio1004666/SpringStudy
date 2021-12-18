package kr.co.ch02.sub1;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class LgTv implements TV{
	
	@Inject
	private Speaker speaker;
	
	// 원래는 생성자 해야하는데 객체를 주입하면 생략한다.  스프링 컨테이너에 이미 객체가 등록되어 있기때문에 
	
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LgTv powerOn...");
	}
	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LgTv powerOff...");
	}
	@Override
	public void chDown() {
		// TODO Auto-generated method stub
		
		System.out.println("LgTv chDown...");
		
	}
	@Override
	public void chUp() {
		// TODO Auto-generated method stub
		System.out.println("LgTv chUp...");
		
	}
	@Override
	public void soundUp() {
		// 주입된 speaker 실행
		// TODO Auto-generated method stub
		speaker.soundUp();
	}
	@Override
	public void soundDown() {
		// 주입된 speaker 실행
		// TODO Auto-generated method stub
		speaker.soundDown();
	}
}
