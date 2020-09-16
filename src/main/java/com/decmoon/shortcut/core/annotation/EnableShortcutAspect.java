package com.decmoon.shortcut.core.annotation;

import com.decmoon.shortcut.core.config.ShortCutAspect;
import com.decmoon.shortcut.core.config.ShortCutBeanDefinitionRegistrar;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.config.AspectEntry;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 异常监听
 *
 * @author decmoon
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(ShortCutBeanDefinitionRegistrar.class)
public @interface EnableShortcutAspect {
    boolean enable() default true;

}
