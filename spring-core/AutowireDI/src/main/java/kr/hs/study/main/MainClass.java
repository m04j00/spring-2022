package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean1 t1 = context.getBean("t1", TestBean1.class);
		System.out.println("data1 : " + t1.getData1());
		System.out.println("data2 : " + t1.getData2());

		TestBean1 t2 = context.getBean("t2", TestBean1.class);
		System.out.println("data1 : " + t2.getData1());
		System.out.println("data2 : " + t2.getData2());

		TestBean2 t3 = context.getBean("t3", TestBean2.class);
		System.out.println("data1 : " + t3.getData1());
		System.out.println("data2 : " + t3.getData2());
		context.close();
	}

}
