package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.BookInfo;
import kr.hs.study.beans.Magazine;
import kr.hs.study.beans.Novel;
import kr.hs.study.beans.Poet;

@Configuration
@ComponentScan(basePackages = "kr.hs.study.beans")
public class BeanConfigClass {
	@Bean
	public BookInfo novelBookInfo() {
		return new BookInfo("Kim", "spring", 8000);
	}

	@Bean
	public BookInfo poetBookInfo() {
		return new BookInfo("Lee", "spring2", 10000);
	}

	@Bean
	public BookInfo magazineBookInfo() {
		return new BookInfo("Park", "spring3", 20000);
	}
}
