package com.decmoon.shortcut;

import com.decmoon.shortcut.core.annotation.EnableShortcutAspect;
import com.decmoon.shortcut.function.ArgumentsTest;
import com.decmoon.shortcut.function.BooleanJudgeTest;
import com.decmoon.shortcut.function.CollectionCheckerTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableShortcutAspect
public class ShortcutApplicationTests {

    @Test
    public void contextLoads() {
        new ArgumentsTest().run();
        new BooleanJudgeTest().run();
        new CollectionCheckerTest().run();

        ShortcutTest.print();
    }
}
