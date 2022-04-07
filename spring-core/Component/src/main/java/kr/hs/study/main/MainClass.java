package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.config.ConfigBeanClass;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext xml = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(ConfigBeanClass.class);
		TestBean1 obj1 = xml.getBean(TestBean1.class);
		System.out.println("obj1 : " + obj1);
		TestBean2 java2 = anno.getBean("t2", TestBean2.class);
		System.out.println("java2 : " + java2);
		xml.close();
		anno.close();
	}

}