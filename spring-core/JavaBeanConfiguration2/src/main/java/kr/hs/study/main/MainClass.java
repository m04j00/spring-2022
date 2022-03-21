package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 obj1 = context.getBean("java1", TestBean1.class);
		System.out.println(obj1);
		
		TestBean1 obj2 = context.getBean("new", TestBean1.class);
		System.out.println(obj2);
		
		TestBean1 obj3 = context.getBean("new", TestBean1.class);
		System.out.println(obj3);

	}

}
