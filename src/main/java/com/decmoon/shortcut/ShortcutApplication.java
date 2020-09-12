package com.decmoon.shortcut;

import com.decmoon.shortcut.core.annotation.EnableShortcutAspect;
import com.decmoon.shortcut.core.annotation.EnableShortcutLogger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableShortcutAspect
public class ShortcutApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShortcutApplication.class, args);
    }

}
