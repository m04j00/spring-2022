package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class advisorClass {
	public void beforeMethod() {
		System.out.println("advice의 before method");
	}
	public void afterMethod() {
		System.out.println("advice의 after method");
	}
	public void arroundMethod(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("arround Method 호출 1");
		pjp.proceed(); // 핵심 메소드 실행
		System.out.println("arround Method 호출 2");
	}
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod 호출");
	}
	public void afterThrowingMethod(Throwable e) {
		System.out.println("afterThrowing Method 호출");
		System.out.println("e : " + e);
	}
}
