package kr.co.ch02.sub1;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class SamsungTv implements TV{
	
	@Inject
	private Speaker speaker;
	
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv powerOn...");
	}
	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv powerOff...");
	}
	@Override
	public void chDown() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv chDown...");
		
	}
	@Override
	public void chUp() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv chUp...");
		
	}
	
	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		// 林涝等 speaker 角青
		speaker.soundUp();
	}
	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		// 林涝等 speaker 角青
		speaker.soundDown();
	}
}
