package com.decmoon.shortcut;

import com.decmoon.shortcut.core.annotation.EnableShortcutAspect;
import com.decmoon.shortcut.core.annotation.EnableShortcutLogger;
import com.decmoon.shortcut.core.log.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableShortcutAspect
@EnableShortcutLogger
public class ShortcutApplication {
    @Autowired
    private Logger logger;

    public static void main(String[] args) {
        SpringApplication.run(ShortcutApplication.class, args);
    }

}
