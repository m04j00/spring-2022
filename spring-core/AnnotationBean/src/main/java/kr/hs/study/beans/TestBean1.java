package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class TestBean1 {
	@Autowired
	private DataBean1 data1;
	// 객체 생성과 동시에 DataBean1 type을 data1에 넣어라 
	// 자동으로 set 메소드 만들음
	@Autowired
	private DataBean2 data2;

	public DataBean1 getData1() {
		return data1;
	}

	public DataBean2 getData2() {
		return data2;
	}

}
