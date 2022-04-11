package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Designer;
import kr.hs.study.beans.Developer;
import kr.hs.study.beans.Publisher;
import kr.hs.study.config.ConfigBeanClass;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext xml = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(ConfigBeanClass.class);
		
		Designer xml1 = xml.getBean(Designer.class);
		Developer xml2 = xml.getBean(Developer.class);
		Publisher xml3 = xml.getBean(Publisher.class);
		System.out.println("xml---");
		xml1.Checkin();
		xml1.Checkout();
		xml2.Checkin();
		xml2.Checkout();
		xml3.Checkin();
		xml3.Checkout();
		
		Designer anno1 = anno.getBean(Designer.class);
		Developer anno2 = anno.getBean(Developer.class);
		Publisher anno3 = anno.getBean(Publisher.class);
		System.out.println("annotation---");
		anno1.Checkin();
		anno1.Checkout();
		anno2.Checkin();
		anno2.Checkout();
		anno3.Checkin();
		anno3.Checkout();
		
		xml.close();
		anno.close();
	}

}