package com.decmoon.shortcut;

import com.decmoon.shortcut.core.annotation.EnableShortcutAspect;
import com.decmoon.shortcut.core.annotation.EnableShortcutLogger;
import com.decmoon.shortcut.core.log.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableShortcutAspect
@EnableShortcutLogger
public class ShortcutApplicationTests {

    @Autowired
    private ShortcutTest shortcutTest;

    @Autowired
    private Logger logger;

    @Test
    public void contextLoads() {
        shortcutTest.exe();
        logger.info("Hello world2");
    }
}
