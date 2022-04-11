package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Book;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		ClassPathXmlApplicationContext xml = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		Book xml1 = xml.getBean("novel", Book.class);
		Book xml2 = xml.getBean("poet", Book.class);
		Book xml3 = xml.getBean("magazine", Book.class);
		
		System.out.println("xml---");
		xml1.buy();
		xml2.buy();
		xml3.buy();
		
		Book novel = context.getBean("novel", Book.class);
		Book poet = context.getBean("poet", Book.class);
		Book magazine = context.getBean("magazine", Book.class);

		System.out.println("annotation---");
		novel.buy();
		poet.buy();
		magazine.buy();
	}

}
