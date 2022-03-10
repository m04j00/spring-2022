package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// 메모리에 config.xml 로딩 시킴 : 객체를 생성해서 컨테이너에 보관
		ClassPathXmlApplicationContext applicationContext = 
			new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		// container에 있는 객체를 가져옴
		TestBean t1 = (TestBean) applicationContext.getBean("test1");
		// t1 주소 출력
		System.out.println("t1 : " + t1);
	}

}
