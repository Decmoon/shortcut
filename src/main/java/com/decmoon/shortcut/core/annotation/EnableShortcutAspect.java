package com.decmoon.shortcut.core.annotation;

import com.decmoon.shortcut.core.config.ShortcutBeanDefinitionRegistrar;
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
@Import(ShortcutBeanDefinitionRegistrar.class)
public @interface EnableShortcutAspect {
    boolean enable() default true;

    Class aspect();
}
