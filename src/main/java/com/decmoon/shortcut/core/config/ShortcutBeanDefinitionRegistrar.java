package com.decmoon.shortcut.core.config;

import com.decmoon.shortcut.core.annotation.EnableShortcutAspect;
import com.decmoon.shortcut.core.annotation.EnableShortcutLogger;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;
import java.util.Objects;

public class ShortcutBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    private boolean init = false;

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        if(!init) {
            registerLog(importingClassMetadata, registry);
            registerAspect(importingClassMetadata, registry);
            init=true;
        }
    }


    private void registerLog(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        Map<String, Object> annotationAttributes = importingClassMetadata.
                getAnnotationAttributes(EnableShortcutLogger.class.getName());
        if (Objects.isNull(annotationAttributes)) {
            return;
        }
        Boolean enable = Boolean.valueOf(annotationAttributes.get("enable") + "");
        BeanDefinitionBuilder beanDefinitionBuilder =
                BeanDefinitionBuilder.rootBeanDefinition(ShortcutBeanPostProcessor.class);
        beanDefinitionBuilder.addPropertyValue("shortcutLogTurnOn", enable);

        registry.registerBeanDefinition(ShortcutBeanPostProcessor.class.getName(),
                beanDefinitionBuilder.getBeanDefinition());
    }

    private void registerAspect(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        Map<String, Object> annotationAttributes = importingClassMetadata.
                getAnnotationAttributes(EnableShortcutAspect.class.getName());
        if (Objects.isNull(annotationAttributes)) {
            return;
        }
        Boolean enable = Boolean.valueOf(annotationAttributes.get("enable").toString());
        Class<?> aspectClass ;


        if (enable) {
            try {
                String s = annotationAttributes.get("aspect").toString();
                int i = s.lastIndexOf(' ')+1;
                aspectClass = Class.forName(s.substring(i));
                BeanDefinitionBuilder beanDefinitionBuilder =
                        BeanDefinitionBuilder.rootBeanDefinition(aspectClass);
                registry.registerBeanDefinition(aspectClass.getName(),
                        beanDefinitionBuilder.getBeanDefinition());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

}
