package com.cts.demo.loggingAspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* com.cts.demo.service.ProductServiceImpl.*(..))")
    public void logBeforeAllMethods(JoinPoint joinPoint) {
        LOGGER.info("********Adding new Product : " + joinPoint.getSignature().getName());
    }

    @Before("execution(* com.cts.demo.service.ProductServiceImpl.addProduct(..))")
    public void logBeforeAddProduct(JoinPoint joinPoint) {
        LOGGER.info("******* Product added  : " + joinPoint.getSignature().getName());
    }

    @After("execution(* com.cts.demo.service.ProductServiceImpl.addProduct(..))")
    public void logAfterAddingProduct(JoinPoint joinPoint) {
        LOGGER.info("****Product Added Successfully : " + joinPoint.getSignature().getName());
    }
}
