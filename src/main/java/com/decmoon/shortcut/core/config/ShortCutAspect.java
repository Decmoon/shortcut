package com.decmoon.shortcut.core.config;

import com.decmoon.shortcut.core.annotation.EnableShortcutAspect;
import com.decmoon.shortcut.exception.ShortCutException;
import com.decmoon.shortcut.core.log.Console;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 异常监听
 *
 * @author decmoon
 * @see EnableShortcutAspect
 */
@Aspect
public class ShortCutAspect {

    public ShortCutAspect() {
        Console.info("The aspect service of Shortcut is started");
    }

    @Pointcut("execution(* com.decmoon.shortcut.*.*(..))")
    public void pointcut() {

    }

    @Around("pointcut()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            joinPoint.proceed();
        } catch (ShortCutException e) {
            e.printStackTrace();
            e.shutdown();
        }
    }


    public Object aroundReturn(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            return joinPoint.proceed();
        } catch (ShortCutException e) {
            e.printStackTrace();
            e.shutdown();
        }
        throw new IllegalArgumentException();
    }


}
