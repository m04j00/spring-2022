package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		TestBean3 obj1 = context.getBean("test", TestBean3.class);
		System.out.println(obj1);
		System.out.println();
		
		TestBean3 obj2 = context.getBean("t2", TestBean3.class);
		System.out.println(obj2);
		System.out.println();
		
		TestBean4 obj4 = context.getBean("java4", TestBean4.class);
		System.out.println(obj4.getData1());
		System.out.println(obj4.getData2());
		System.out.println(obj4.getData4());
		System.out.println();
		
		TestBean4 obj5 = context.getBean("java5", TestBean4.class);
		System.out.println(obj5.getData1());
		System.out.println(obj5.getData2());
		System.out.println(obj5.getData4());
	}

}
