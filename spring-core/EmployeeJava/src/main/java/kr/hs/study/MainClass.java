package kr.hs.study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.beans.Employee;
import kr.hs.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		Employee developer = context.getBean("developer", Employee.class);
		Employee designer = context.getBean("designer", Employee.class);
		Employee publisher = context.getBean("publisher", Employee.class);

		developer.Checkin();
		developer.Checkout();
		designer.Checkin();
		designer.Checkout();
		publisher.Checkin();
		publisher.Checkout();

	}

}
