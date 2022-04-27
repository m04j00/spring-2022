package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.ConfigBeanClass;
import kr.hs.study.dao.TestDAO;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(ConfigBeanClass.class);
		
		TestDAO testDAO = anno.getBean(TestDAO.class);
		TestBean testBean = anno.getBean(TestBean.class);
		
		testBean.setData1(1);
		testBean.setData2("spring");
		testDAO.insertData(testBean);
		
		TestBean t2 = new TestBean();
		t2.setData1(20);
		t2.setData2("Spring2");
		testDAO.insertData(t2);
		
		anno.close();
	}

}