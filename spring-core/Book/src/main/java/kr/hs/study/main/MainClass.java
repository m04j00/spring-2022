package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Book;
import kr.hs.study.beans.Magazine;
import kr.hs.study.beans.Novel;
import kr.hs.study.beans.Poet;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");

		Book novel = context.getBean("novel", Novel.class);
		Book poet = context.getBean("poet", Book.class);
		Book magazine = context.getBean("magazine", Magazine.class);
		
		novel.buy();
		poet.buy();
		magazine.buy();
		
		context.close();
		

	}

}
