package com.decmoon.shortcut.core.config;

import com.decmoon.shortcut.core.log.Console;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author decmoon
 */
@Configuration
@ComponentScan(value = "com.decmoon.shortcut")
public class ShortcutAutoConfiguration {
    {
        Console.info("Shortcut auto configuration successful");
    }
}
