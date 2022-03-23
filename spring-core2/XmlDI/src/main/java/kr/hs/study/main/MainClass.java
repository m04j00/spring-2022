package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean4;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean4 obj4 = context.getBean("java4", TestBean4.class);
		System.out.println(obj4.getData1());
		System.out.println(obj4.getData2());
		System.out.println(obj4.getData4());
		System.out.println();

		TestBean4 obj5 = context.getBean("java5", TestBean4.class);
		System.out.println(obj5.getData1());
		System.out.println(obj5.getData2());
		System.out.println(obj5.getData4());
	}

}
