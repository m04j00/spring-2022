package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test {
	@Autowired
	private Person p1;
	@Autowired
	private Person p2;
	@Autowired
	private Person p3;
	public Person getP1() {
		return p1;
	}
	public Person getP2() {
		return p2;
	}
	public Person getP3() {
		return p3;
	}
	
	
}
