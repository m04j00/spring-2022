package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");

		TestBean1 obj1 = context.getBean("t1", TestBean1.class);
		System.out.println("obj1 : " + obj1);
		context.close();
	}

}
