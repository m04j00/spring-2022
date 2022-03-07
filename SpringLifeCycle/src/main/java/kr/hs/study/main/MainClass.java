package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"kr/hs/study/config/config.xml");

		TestBean1 t1 = applicationContext.getBean("t1", TestBean1.class);
		System.out.println("t1 : " + t1);

		TestBean2 t2 = applicationContext.getBean("t2", TestBean2.class);
		System.out.println("t2 : " + t2);

		TestBean2 t3 = applicationContext.getBean("t2", TestBean2.class);
		System.out.println("t3 : " + t3);

		applicationContext.close();
	}

}
