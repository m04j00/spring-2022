package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
	public void beforeMethod() {
		System.out.println("충고 advice 횡단 관심사");
	}
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
		pjp.proceed(); 
	}
}
