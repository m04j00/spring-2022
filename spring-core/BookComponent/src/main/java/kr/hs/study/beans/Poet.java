package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Poet implements Book {
	@Autowired
	private BookInfo poetBookInfo;

	public void buy() {
		System.out.println(poetBookInfo.getName() + "의 시 '" + poetBookInfo.getBook() + "'를 " + poetBookInfo.getPrice() + "원에 산다.");
	}

	public void sell() {
		System.out.println(poetBookInfo.getName() + "의 시 '" + poetBookInfo.getBook() + "'를 " + poetBookInfo.getPrice() + "원에 판다.");
	}

	public void create() {
		System.out.println(poetBookInfo.getName() + "가 시를 짓는다.");
	}
}
