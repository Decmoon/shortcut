package com.decmoon.shortcut.core.annotation;

import com.decmoon.shortcut.core.config.ShortcutBeanDefinitionRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author decmoon
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(ShortcutBeanDefinitionRegistrar.class)
public @interface EnableShortcutLogger {
    boolean enable() default true;
}
