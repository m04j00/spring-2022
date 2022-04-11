package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component
public class Designer implements Employee{

	public void Checkin() {
		System.out.println("디자이너 7시 출근");
	}

	public void Checkout() {
		System.out.println("디자이너 10시 퇴근");
	}

}
