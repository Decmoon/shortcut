package com.decmoon.shortcut.core.annotation;

import com.decmoon.shortcut.core.config.ShortCutAspect;
import com.decmoon.shortcut.core.config.ShortCutImportBeanDefinitionRegistrar;
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
@Import({ShortCutAspect.class})
public @interface EnableShortcutAspect {

}
