package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Novel implements Book {
	@Autowired
	private BookInfo novelBookInfo;

	public void buy() {
		System.out.println(novelBookInfo.getName() + "의 소설 '" + novelBookInfo.getBook() + "'을 " + novelBookInfo.getPrice() + "원에 산다.");
	}

	public void sell() {
		System.out.println(novelBookInfo.getName() + "의 소설 '" + novelBookInfo.getBook() + "'을 " + novelBookInfo.getPrice() + "원에 판다.");
	}

	public void create() {
		System.out.println(novelBookInfo.getName() + "의 소설 'spring'을 8000원에 만든다.");
	}

}
