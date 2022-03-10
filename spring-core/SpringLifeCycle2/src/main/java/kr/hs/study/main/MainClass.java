package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.DataBean1;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");

		// DataBea1의 기본 생성자
		DataBean1 obj1 = context.getBean("d1", DataBean1.class);
//		DataBean1 obj2 = context.getBean("d2", DataBean1.class);
//		DataBean1 obj3 = context.getBean("d3", DataBean1.class);
//		DataBean1 obj4 = context.getBean("d3", DataBean1.class);

		System.out.println("obj1 : " + obj1);
//		System.out.println("obj2 : " + obj2);
//		System.out.println("obj3 : " + obj3);
//		System.out.println("obj4 : " + obj4);

		context.close();
	}

}
