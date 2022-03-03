package kr.hs.study.main;

import kr.hs.study.beans.Hello;
import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKr;

public class MainClass {

	public static void main(String[] args) {
		Hello hello = new HelloWorldEn();
		callMethod(hello);
		
	}

	public static void callMethod(Hello hello) {
		hello.sayHello();
	}
}
