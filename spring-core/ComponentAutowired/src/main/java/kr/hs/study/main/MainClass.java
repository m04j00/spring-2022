package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.ConfigBeanClass;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext xml = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(ConfigBeanClass.class);
		
		TestBean1 java1 = anno.getBean(TestBean1.class);
		System.out.println("data1 : " + java1.getData1());
		System.out.println("data2 : " + java1.getData2());
		
		TestBean1 java2 = anno.getBean(TestBean1.class);
		System.out.println("data1 : " + java2.getData1());
		System.out.println("data2 : " + java2.getData2());
		System.out.println("data3 : " + java2.getData3());
		xml.close();
		anno.close();
	}

}