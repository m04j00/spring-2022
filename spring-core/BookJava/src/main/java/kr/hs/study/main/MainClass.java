package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Book;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfigClass.class);

		Book novel = context.getBean("novel", Book.class);
		Book poet = context.getBean("poet", Book.class);
		Book magazine = context.getBean("magazine", Book.class);

		novel.buy();
		poet.buy();
		magazine.buy();
	}

}
