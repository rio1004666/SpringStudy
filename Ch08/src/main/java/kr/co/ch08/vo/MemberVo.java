package kr.co.ch08.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MemberVo {
	
	private String uid;
	private String name;
	private String hp;
	private String pos;
	private int dep;
	private String rdate;
	

}

