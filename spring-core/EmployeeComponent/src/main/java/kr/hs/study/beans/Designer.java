package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component
public class Designer implements Employee{

	public void Checkin() {
		System.out.println("�����̳� 7�� ���");
	}

	public void Checkout() {
		System.out.println("�����̳� 10�� ���");
	}

}
