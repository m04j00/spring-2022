package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean t1 = context.getBean("t1", TestBean.class);
		System.out.println(t1);
		t1.print();

		TestBean t2 = context.getBean("t2", TestBean.class);
		System.out.println(t2);
		t2.print();

		TestBean t3 = context.getBean("t3", TestBean.class);
		System.out.println(t3);
		t3.print();

		TestBean t4 = context.getBean("t4", TestBean.class);
		System.out.println(t4);
		t4.print();

		TestBean t5 = context.getBean("t5", TestBean.class);
		System.out.println(t5);
		t5.print();

		TestBean2 t6 = context.getBean("t6", TestBean2.class);
		System.out.println(t6);
		t6.print();

		TestBean2 t7 = context.getBean("t7", TestBean2.class);
		System.out.println(t7);
		t7.print();
		context.close();

	}

}
