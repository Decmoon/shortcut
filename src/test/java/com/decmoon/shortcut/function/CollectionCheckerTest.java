package com.decmoon.shortcut.function;

import com.decmoon.shortcut.ShortcutTest;
import com.decmoon.shortcut.collection.CollectionChecker;
import com.decmoon.shortcut.core.log.Console;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionCheckerTest extends TestCase {

    private List<String> list = new ArrayList<>();
    private List<String> list2 = new ArrayList<>();

    {
        list.add(null);


        list.add("");
    }

    public void test_for_containNULL() {
        assertTrue(CollectionChecker.containNULL(list));
        assertFalse(CollectionChecker.containNULL(list2));
    }


    public void test_for_nonContainNULL() {
        assertFalse(CollectionChecker.nonContainNULL(list));
        assertTrue(CollectionChecker.nonContainNULL(list2));
    }

    @Override
    protected void runTest() {
        try {
            test_for_containNULL();
            test_for_nonContainNULL();
            Console.warn("Test-BooleanJudge has passed the test");
        } catch (AssertionFailedError e) {
            Console.fail("Test-BooleanJudge didn't pass the test");
            ShortcutTest.add(e);
        }
    }
}
