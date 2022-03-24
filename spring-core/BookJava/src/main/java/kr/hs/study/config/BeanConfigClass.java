package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.Magazine;
import kr.hs.study.beans.Novel;
import kr.hs.study.beans.Poet;

@Configuration
public class BeanConfigClass {
	@Bean
	public Novel novel() {
		return new Novel("Kim", "spring", 8000);
	}

	@Bean
	public Poet poet() {
		return new Poet("Lee", "spring2", 10000);
	}

	@Bean
	public Magazine magazine() {
		return new Magazine("Park", "spring3", 20000);
	}
}
