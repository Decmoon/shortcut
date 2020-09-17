package com.decmoon.shortcut.config;

import com.decmoon.shortcut.core.config.ShortcutAspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TestAspect extends ShortcutAspect {

    @Override
    @Pointcut("execution(* com.decmoon.shortcut.*.*(..))")
    public void pointcut() {
    }

    @Around("pointcut()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        super.doVoid(() -> {
            joinPoint.proceed();
        });
    }

}
