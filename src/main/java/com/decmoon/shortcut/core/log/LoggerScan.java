package com.decmoon.shortcut.core.log;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoggerScan {

    @Value("${spring.shortcut.log.info}")
    private String info;
    @Value("${spring.shortcut.log.err}")
    private String err;

    public String getInfo() {
        return info;
    }

    public String getErr() {
        return err;
    }


}
