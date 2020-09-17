package com.decmoon.shortcut;

import com.decmoon.shortcut.core.annotation.EnableShortcutAspect;
import com.decmoon.shortcut.core.annotation.EnableShortcutLogger;
import com.decmoon.shortcut.function.ArgumentsTest;
import com.decmoon.shortcut.function.BooleanJudgeTest;
import com.decmoon.shortcut.function.CollectionCheckerTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableShortcutAspect
//@EnableShortcutLogger
public class ShortcutApplicationTests {

    @Autowired
    private  DemoService demoService;

    @Test
    public void contextLoads() {
        new ArgumentsTest().run();
        new BooleanJudgeTest().run();
        new CollectionCheckerTest().run();

        ShortcutTest.print();
//        demoService.throwException();
//        demoService.writeLog();
    }
}
