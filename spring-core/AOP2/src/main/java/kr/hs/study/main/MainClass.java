package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.IPrintMsg;
import kr.hs.study.beans.PrintMsg;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext xml = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		IPrintMsg obj1 = xml.getBean("p1", IPrintMsg.class);
		obj1.sayHello1();
		obj1.sayHello2();
		xml.close();
	}

}