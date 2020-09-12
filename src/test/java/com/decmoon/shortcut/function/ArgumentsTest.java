package com.decmoon.shortcut.function;

import com.decmoon.shortcut.ShortcutTest;
import com.decmoon.shortcut.argument.Arguments;
import com.decmoon.shortcut.core.log.Console;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

import java.util.*;

/**
 * @author decmoon
 */
public class ArgumentsTest extends TestCase {

    private void test_for_isNull() {
        assertTrue(Arguments.isNull(null));
        assertFalse(Arguments.isNull(""));
    }

    private void test_for_parameterIllegal() {
        List list = new ArrayList<>();
        list.add(null);
        Set set = new HashSet<>();
        set.add(null);

        assertTrue(Arguments.parameterIllegal(""));
        assertTrue(Arguments.parameterIllegal(" "));
        assertTrue(Arguments.parameterIllegal(list));
        assertTrue(Arguments.parameterIllegal(set));
        assertFalse(Arguments.parameterIllegal(0));

        assertTrue(Arguments.nonNull(""));
        assertTrue(Arguments.parameterIllegal(false, ""));
        assertFalse(Arguments.parameterIllegal(false, " "));
        assertFalse(Arguments.parameterIllegal(false, list));
        assertFalse(Arguments.parameterIllegal(false, set));
        assertFalse(Arguments.parameterIllegal(false, 0));
    }

    @Override
    protected void runTest() {
        try {
            test_for_isNull();
            test_for_parameterIllegal();
            Console.warn("Test-Argument has passed the test");
        } catch (AssertionFailedError e) {
            Console.fail("Test-Argument didn't pass the test");
            ShortcutTest.add(e);
        }
    }
}
