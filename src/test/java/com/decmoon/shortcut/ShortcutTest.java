package com.decmoon.shortcut;

import com.decmoon.shortcut.date.DateRecorder;
import com.decmoon.shortcut.thread.MultithreadedBranch;

public class ShortcutTest {
    public static void main(String[] args) {

//        MultithreadedBranch.branch(()-> System.out.println(DateRecorder.now()));

        System.out.println(System.getProperties().getProperty("user.dir"));
//        System.out.println(System.getProperties().getProperty("os.name"));
//        System.out.println(System.getProperties().getProperty("user.name"));
//        System.out.println(System.getProperties().getProperty("user.home"));
    }
}
