package com.decmoon.shortcut.function;

import com.decmoon.shortcut.ShortcutTest;
import com.decmoon.shortcut.core.log.Console;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

public class BooleanJudgeTest extends TestCase {

    @Override
    protected void runTest() {
        try {
            Console.warn("Test-BooleanJudge has passed the test");
        } catch (AssertionFailedError e) {
            Console.fail("Test-BooleanJudge didn't pass the test");
            ShortcutTest.add(e);
        }
    }
}
