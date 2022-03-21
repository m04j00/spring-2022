package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Designer;
import kr.hs.study.beans.Developer;
import kr.hs.study.beans.Publisher;
import kr.hs.study.beans.Employee;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		Employee designer = context.getBean("designer", Designer.class);
		Employee developer = context.getBean("developer", Developer.class);
		Employee publisher = context.getBean("publisher", Publisher.class);

		designer.Checkin();
		designer.Checkout();
		developer.Checkin();
		developer.Checkout();
		publisher.Checkin();
		publisher.Checkout();
	}

}
