package com.decmoon.shortcut;

import com.decmoon.shortcut.argument.Arguments;
import com.decmoon.shortcut.core.annotation.EnableShortcutAspect;
import com.decmoon.shortcut.core.annotation.EnableShortcutLogger;
import com.decmoon.shortcut.core.log.Logger;
import com.decmoon.shortcut.function.ArgumentsTest;
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
    private Logger logger;

    @Test
    public void contextLoads() {
        ArgumentsTest test = new ArgumentsTest();
        test.run();


        ShortcutTest.print();
    }
}
