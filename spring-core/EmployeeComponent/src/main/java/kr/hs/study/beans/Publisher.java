package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component
public class Publisher implements Employee {
	public void Checkin() {
		System.out.println("�ۺ��� 11�� ���");
		
	}
	public void Checkout() {
		System.out.println("�ۺ��� 6�� ���");
	}
}
