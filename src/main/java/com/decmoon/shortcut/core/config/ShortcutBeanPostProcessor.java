package com.decmoon.shortcut.core.config;

import com.decmoon.shortcut.core.log.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class ShortcutBeanPostProcessor implements BeanPostProcessor {

    boolean init = false;

    private boolean shortcutLogTurnOn;

    @Autowired
    private Logger logger;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (Boolean.FALSE.equals(init) && shortcutLogTurnOn) {
            logger.init();
            init = true;
        }
        return bean;
    }

    public void setShortcutLogTurnOn(boolean shortcutLogTurnOn) {
        this.shortcutLogTurnOn = shortcutLogTurnOn;
    }

}
