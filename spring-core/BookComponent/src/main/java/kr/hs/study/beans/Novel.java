package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Novel implements Book {
	@Autowired
	private BookInfo novelBookInfo;

	public void buy() {
		System.out.println(novelBookInfo.getName() + "�� �Ҽ� '" + novelBookInfo.getBook() + "'�� " + novelBookInfo.getPrice() + "���� ���.");
	}

	public void sell() {
		System.out.println(novelBookInfo.getName() + "�� �Ҽ� '" + novelBookInfo.getBook() + "'�� " + novelBookInfo.getPrice() + "���� �Ǵ�.");
	}

	public void create() {
		System.out.println(novelBookInfo.getName() + "�� �Ҽ� 'spring'�� 8000���� �����.");
	}

}
