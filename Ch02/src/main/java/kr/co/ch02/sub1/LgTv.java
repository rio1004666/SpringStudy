package kr.co.ch02.sub1;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class LgTv implements TV{
	
	@Inject
	private Speaker speaker;
	
	// ������ ������ �ؾ��ϴµ� ��ü�� �����ϸ� �����Ѵ�.  ������ �����̳ʿ� �̹� ��ü�� ��ϵǾ� �ֱ⶧���� 
	
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
		// ���Ե� speaker ����
		// TODO Auto-generated method stub
		speaker.soundUp();
	}
	@Override
	public void soundDown() {
		// ���Ե� speaker ����
		// TODO Auto-generated method stub
		speaker.soundDown();
	}
}
