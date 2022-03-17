package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");

		TestBean1 t1 = context.getBean("t1", TestBean1.class);
		System.out.println("a : " + t1.getA());
		System.out.println("b : " + t1.getB());
		System.out.println("c : " + t1.getC());
		System.out.println();

		TestBean2 t2 = context.getBean("t2", TestBean2.class);
		System.out.println("a : " + t2.getA());
		System.out.println("b : " + t2.getB());
		System.out.println("c : " + t2.getC());
		System.out.println();

		TestBean3 t3 = context.getBean("t3", TestBean3.class);
		context.close();

	}

}
