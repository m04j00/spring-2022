package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class advisorClass {
	public void beforeMethod() {
		System.out.println("advice�� before method");
	}
	public void afterMethod() {
		System.out.println("advice�� after method");
	}
	public void arroundMethod(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("arround Method ȣ�� 1");
		pjp.proceed(); // �ٽ� �޼ҵ� ����
		System.out.println("arround Method ȣ�� 2");
	}
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod ȣ��");
	}
	public void afterThrowingMethod(Throwable e) {
		System.out.println("afterThrowing Method ȣ��");
		System.out.println("e : " + e);
	}
}
