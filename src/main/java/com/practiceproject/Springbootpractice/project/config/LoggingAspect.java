package com.practiceproject.Springbootpractice.project.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.practiceproject.Springbootpractice.project..*(..))")
    public void logBeforeMethod(JoinPoint joinPoint) {
        logger.info("Method execution started: " + joinPoint.getSignature().getName());
    }

    @After("execution(* com.practiceproject.Springbootpractice.project..*(..))")
    public void logAfterMethod(JoinPoint joinPoint) {
        logger.info("Method execution ended: " + joinPoint.getSignature().getName());
    }
    
    
    //import org.aspectj.lang.annotation.AfterThrowing;

    @AfterThrowing(pointcut = "execution(* com.practiceproject.Springbootpractice.project..*(..))", throwing = "error")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
        logger.error("Method execution failed: " + joinPoint.getSignature().getName() + ", error: " + error);
    }


}
