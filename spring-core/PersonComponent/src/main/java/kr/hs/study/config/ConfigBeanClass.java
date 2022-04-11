package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.Person;
import kr.hs.study.beans.Test;

@Configuration
@ComponentScan(basePackages = "kr.hs.study.beans")
public class ConfigBeanClass {
	@Bean Person p1() {
		Person p1 = new Person("kim", 30,"¹ä");
		return p1;
	}
	@Bean Person p2() {
		Person p = new Person("lee", 20,"°úÀÚ");
		return p;
	}
	@Bean Person p3() {
		Person p = new Person("park", 40,"¹°");
		return p;
	}

}
