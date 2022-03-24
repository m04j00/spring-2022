package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean1 xml1 = context.getBean("xml1", TestBean1.class);
		System.out.println(xml1.getData1());

		TestBean2 obj2 = context.getBean("xml2", TestBean2.class);
		System.out.println("data1 : " + obj2.getData1());
		System.out.println("data2 : " + obj2.getData2());
		System.out.println();
		AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		TestBean2 obj3 = context2.getBean("java2", TestBean2.class);
		System.out.println("data1 : " + obj3.getData1());

	}

}
