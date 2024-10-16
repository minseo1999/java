package com.kh.aop.aspect;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/*
 	- Aspect : 해당 클래스가 Aspect(aop객체)라는 것을 선언
 	- @Component : Spring이 해당 빈을 서칭할 수 있도록 선언 (Bean 등록)
 */

@Slf4j
@Aspect
@Component
public class LoginAOP {
	//특정 매서드나 패키지등의 join point 만들수 있음
	//com.kh아래 모든 controller 패키지 하위 클래스의 모든 메서드에 전부 적용하겠다고 지점 설정
	@Pointcut("execution(* com.kh.etc.aoptest.*.*(..) )")
	private void cut() {};
	
	//cut메서드가 실행되는 지점 이전에 before() 메서드를 실행
	//JoinPoint : pointcut에 대한 정보가 들어있다
	@Before("cut()")
	public void before(JoinPoint joinPoint) {
		
		MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
		Method method = methodSignature.getMethod();
		
		Object[] args = joinPoint.getArgs();
		
		log.info("========================= start =============================");
		log.info("----------------------- API Controller -------------------------");
		log.info("information : " + methodSignature);
		log.info("Method : " + method);
		log.info("Parameter : " + Arrays.toString(args));
		
		
	}
}
