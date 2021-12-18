package kr.co.ch02.sub1;

import org.springframework.stereotype.Component;

@Component
public class Speaker {
	public void soundUp() {
		System.out.println("Speaker soundUp...");
	}
	public void soundDown() {
		System.out.println("Speaker soundDown...");
	}
}
