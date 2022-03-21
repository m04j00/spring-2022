package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.TestBean1;

@Configuration // bean ������ ����ϴ� ���� ���� == config.xml
public class BeanConfigClass {

	@Bean // �Ʒ� �޼ҵ� ������ �ָ� bean���� ����� �����̳ʿ� ����
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	@Bean(name="new")
	public TestBean1 java2() {
		return new TestBean1();
	}
	@Bean
	@Lazy
	@Scope("prototype")
	public TestBean1 java3() {
		return new TestBean1();
	}
}
