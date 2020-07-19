package com.zdk.aop;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopTest {
	//expression="execution(* com.service.*.*(..))";    // 后面两个*,表示service包下的所有类下的所有方法
	@Pointcut(value="execution(* com.zdk.service.*.*(..))")
	public void point(){

	}

	@Before(value="point()")
	public void before(){
		System.out.println(" before -----------------log ");
	}

	@After(value="point()")
	public void after(){
		System.out.println(" after -----------------log ");
	}
}
