package com.decmoon.shortcut.core.config;

import com.decmoon.shortcut.core.annotation.EnableShortcutAspect;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

@Deprecated
public class ShortCutImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        Map<String, Object> annotationAttributes =
                importingClassMetadata.getAnnotationAttributes(
                        EnableShortcutAspect.class.getName()
                );
        Boolean enable = Boolean.valueOf(annotationAttributes.get("") + "");
        BeanDefinitionBuilder beanDefinitionBuilder =
                BeanDefinitionBuilder.rootBeanDefinition(ShortcutBeanPostProcessor.class);
        beanDefinitionBuilder.addPropertyValue("", enable);
        registry.registerBeanDefinition(ShortcutBeanPostProcessor.class.getName(),
                beanDefinitionBuilder.getBeanDefinition());
    }
}
