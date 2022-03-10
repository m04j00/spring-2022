package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Animal;
import kr.hs.study.beans.Cat;
import kr.hs.study.beans.Dog;
import kr.hs.study.beans.Rabbit;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		Animal dog = context.getBean("dog", Dog.class);
		Animal cat = context.getBean("cat", Cat.class);
		Animal rabbit = context.getBean("rabbit", Rabbit.class);

		dog.eat();
		cat.eat();
		rabbit.eat();
	}

}
