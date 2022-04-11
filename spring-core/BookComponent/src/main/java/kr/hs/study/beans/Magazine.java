package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Magazine implements Book {
	@Autowired
	private BookInfo magazineBookInfo;

	public void buy() {
		System.out.println(magazineBookInfo.getName() + "의 잡지 '" + magazineBookInfo.getBook() + "'을 " + magazineBookInfo.getPrice() + "원에 산다");
	}

	public void sell() {
		System.out.println(magazineBookInfo.getName() + "의 잡지 '" + magazineBookInfo.getBook() + "'을 " + magazineBookInfo.getPrice() + "원에 판다.");
	}

	public void create() {
		System.out.println(magazineBookInfo.getName() + "의 잡지를 쓴다.");
	}
}