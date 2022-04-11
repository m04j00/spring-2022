package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Magazine implements Book {
	@Autowired
	private BookInfo magazineBookInfo;

	public void buy() {
		System.out.println(magazineBookInfo.getName() + "�� ���� '" + magazineBookInfo.getBook() + "'�� " + magazineBookInfo.getPrice() + "���� ���");
	}

	public void sell() {
		System.out.println(magazineBookInfo.getName() + "�� ���� '" + magazineBookInfo.getBook() + "'�� " + magazineBookInfo.getPrice() + "���� �Ǵ�.");
	}

	public void create() {
		System.out.println(magazineBookInfo.getName() + "�� ������ ����.");
	}
}