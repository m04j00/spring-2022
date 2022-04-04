package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);

		System.out.println("--- annotation");
		TestBean1 anno1 = context2.getBean("java1", TestBean1.class);
		System.out.println(anno1.getData1());
		System.out.println(anno1.getData2());
		
		System.out.println("--- xml");
		TestBean1 xml1 = context1.getBean("xml1", TestBean1.class);
		System.out.println(xml1.getData1());
		System.out.println(xml1.getData2());
		
		System.out.println("--- xml");
		TestBean2 xml2 = context1.getBean("t2", TestBean2.class);
		System.out.println(xml2.getData1());
		System.out.println(xml2.getData2());
		
		System.out.println("--- xml");
		TestBean3 xml3 = context1.getBean("t3", TestBean3.class);
		System.out.println(xml3.getData1());
		System.out.println(xml3.getData2());
		System.out.println(xml3.getData3());
		System.out.println(xml3.getData4());
		
		System.out.println("--- annotation");
		TestBean3 anno3 = context2.getBean("java3", TestBean3.class);
		System.out.println(anno3.getData1());
		System.out.println(anno3.getData2());
		System.out.println(anno3.getData3());
		System.out.println(anno3.getData4());
	}
}
