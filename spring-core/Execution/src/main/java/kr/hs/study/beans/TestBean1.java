package kr.hs.study.beans;

public class TestBean1 {
	public void method1() {
		System.out.println("kr.hs.study.beans.TestBean1�� method1");
	}
	public void method1(int a1) {
		System.out.println("int �Ű����� method1");
	}
	public void method1(int a1, int a2) {
		System.out.println("int �Ű����� 2�� method1");
	}
	public void method1(String s1) {
		System.out.println("String �Ű����� method1");
	}
	public void method1(int a1, String s1) {
		System.out.println("int�� �Ű����� 1��, String�� �Ű����� 1�� method1");
	}
	public void method2() {
		System.out.println("kr.hs.study.beans.TestBean1�� method2");
	}
	public int method3() {
		System.out.println("kr.hs.study.beans.TestBean1�� method3");
		return 1;
	}
}
