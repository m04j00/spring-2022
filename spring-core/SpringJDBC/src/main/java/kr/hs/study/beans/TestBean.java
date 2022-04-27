package kr.hs.study.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// db table에 들어갈 값이나 가져온 값을 저장하는 곳
@Component
@Scope("prototype")
public class TestBean {
	private int data1;
	private String data2;
	
	public int getData1() {
		return data1;
	}
	public void setData1(int data1) {
		this.data1 = data1;
	}
	public String getData2() {
		return data2;
	}
	public void setData2(String data2) {
		this.data2 = data2;
	}
}
