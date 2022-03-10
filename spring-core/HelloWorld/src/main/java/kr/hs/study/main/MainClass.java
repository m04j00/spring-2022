package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.HelloWorld;
import kr.hs.study.beans.HelloWorldEn;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		HelloWorldEn helloWorldEn = applicationContext.getBean("helloWorldEn", HelloWorldEn.class);
		System.out.println("helloWorldEn : " + helloWorldEn);
	}

}
