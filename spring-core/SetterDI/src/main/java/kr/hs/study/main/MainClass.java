package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean t1 = context.getBean("t1", TestBean.class);
		System.out.println("data1 : " + t1.getData1());
		System.out.println("data2 : " + t1.getDtaa2());
		System.out.println("data3 : " + t1.isData3());
		System.out.println("data4 : " + t1.getData4());
		
		TestBean2 t2 = context.getBean("t2", TestBean2.class);
		System.out.println("data1 : " + t2.getData1());
		System.out.println("data2 : " + t2.getData2());
		context.close();

	}

}
