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
public abstract class ShortcutAspect {

    public ShortcutAspect() {
        Console.info("The aspect service of Shortcut is started");
    }


    public abstract void pointcut();

    public void doVoid(AspectStrategy aspectStrategy) throws Throwable {
        try {
            aspectStrategy.execute();
        } catch (ShortCutException e) {
            e.printStackTrace();
        }
    }

    public Object doReturn(AspectReturnStrategy aspectReturnStrategy) throws Throwable {
        try {
            return aspectReturnStrategy.execute();
        } catch (ShortCutException e) {
            e.printStackTrace();
        }
        return null;
    }


}
