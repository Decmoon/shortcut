package com.decmoon.shortcut;

import com.decmoon.shortcut.date.DateRecorder;
import com.decmoon.shortcut.thread.MultithreadedBranch;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class ShortcutTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        for (String s : list) {
            if("1".equals(s)){
                list.remove(s);
            }
        }
    }
}
