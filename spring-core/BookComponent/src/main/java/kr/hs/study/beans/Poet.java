package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Poet implements Book {
	@Autowired
	private BookInfo poetBookInfo;

	public void buy() {
		System.out.println(poetBookInfo.getName() + "�� �� '" + poetBookInfo.getBook() + "'�� " + poetBookInfo.getPrice() + "���� ���.");
	}

	public void sell() {
		System.out.println(poetBookInfo.getName() + "�� �� '" + poetBookInfo.getBook() + "'�� " + poetBookInfo.getPrice() + "���� �Ǵ�.");
	}

	public void create() {
		System.out.println(poetBookInfo.getName() + "�� �ø� ���´�.");
	}
}
