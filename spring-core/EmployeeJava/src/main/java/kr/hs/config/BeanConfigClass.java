package kr.hs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.beans.Designer;
import kr.hs.beans.Developer;
import kr.hs.beans.Publisher;

@Configuration
public class BeanConfigClass {

	@Bean
	public Developer developer() {
		return new Developer(10, 7);
	}

	@Bean
	public Designer designer() {
		return new Designer(7, 10);
	}

	@Bean
	public Publisher publisher() {
		return new Publisher(11, 6);
	}
	

}
