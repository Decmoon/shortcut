package com.decmoon.shortcut.function;

import com.decmoon.shortcut.ShortcutTest;
import com.decmoon.shortcut.bool.BooleanJudge;
import com.decmoon.shortcut.core.log.Console;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

public class BooleanJudgeTest extends TestCase {

    public void test_for_allTrue() {
        assertTrue(BooleanJudge.allTrue(true, true, true, true));
        assertFalse(BooleanJudge.allTrue(true, false, true, true));
    }

    public void test_for_allFalse() {
        assertTrue(BooleanJudge.allFalse(false, false, false, false));
        assertFalse(BooleanJudge.allFalse(true, false, false, false));
    }

    public void test_for_hasTrue() {
        assertTrue(BooleanJudge.hasTrue(false, false, true, false));
        assertFalse(BooleanJudge.hasTrue(false, false, false, false));
    }

    public void test_for_hasFalse() {
        assertTrue(BooleanJudge.hasFalse(false, true, true, true));
        assertFalse(BooleanJudge.hasFalse(true, true, true, true));
    }

    @Override
    protected void runTest() {
        try {
            test_for_allFalse();
            test_for_allTrue();
            test_for_hasFalse();
            test_for_hasTrue();
            Console.warn("Test-BooleanJudge has passed the test");
        } catch (AssertionFailedError e) {
            Console.fail("Test-BooleanJudge didn't pass the test");
            ShortcutTest.add(e);
        }
    }
}
