package kr.hs.study.beans;

public class TestBean1 {
	public void method1() {
		System.out.println("kr.hs.study.beans.TestBean1의 method1");
	}
	public void method1(int a1) {
		System.out.println("int 매개변수 method1");
	}
	public void method1(int a1, int a2) {
		System.out.println("int 매개변수 2개 method1");
	}
	public void method1(String s1) {
		System.out.println("String 매개변수 method1");
	}
	public void method1(int a1, String s1) {
		System.out.println("int형 매개변수 1개, String형 매개변수 1개 method1");
	}
	public void method2() {
		System.out.println("kr.hs.study.beans.TestBean1의 method2");
	}
	public int method3() {
		System.out.println("kr.hs.study.beans.TestBean1의 method3");
		return 1;
	}
}
