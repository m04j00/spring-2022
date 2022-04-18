package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext xml = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean1 obj1 = xml.getBean("t1", TestBean1.class);
		obj1.method1();
		obj1.method2();
		obj1.method1(100);
		obj1.method1("Spring");
		obj1.method1(100, 200);
		xml.close();
	}

}