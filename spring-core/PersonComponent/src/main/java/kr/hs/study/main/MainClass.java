package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Test;
import kr.hs.study.config.ConfigBeanClass;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext xml = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(ConfigBeanClass.class);
		
		Test t1 = anno.getBean(Test.class);
		System.out.println("annotation---");
		t1.getP1().eat();
		t1.getP2().eat();
		t1.getP3().eat();
		System.out.println();
		Test t2 = xml.getBean(Test.class);
		System.out.println("xml---");
		t2.getP1().eat();
		t2.getP2().eat();
		t2.getP3().eat();
		
		
		xml.close();
		anno.close();
	}

}
