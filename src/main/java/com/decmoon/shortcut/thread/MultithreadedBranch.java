package com.decmoon.shortcut.thread;

import com.decmoon.shortcut.exception.ExceptionLogger;
import com.decmoon.shortcut.function.Execute;
import com.decmoon.shortcut.function.Mission;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class MultithreadedBranch {

    public final static void branch(Execute execute) {
        new Thread(() -> {
            execute.execute();
        }).start();
    }

    public final static void branch(Execute execute, String threadName) {
        new Thread(() -> {
            execute.execute();
        }, threadName).start();
    }

    public final static <V> V branch(Mission mission) {
        Callable callable = () -> mission.execute();
        FutureTask futureTask = new FutureTask(callable);
        new Thread(futureTask).start();
        V v = null;
        try {
            v = (V) futureTask.get();
        } catch (Exception e) {
            ExceptionLogger.parameterErr(MultithreadedBranch.class, "branch(Mission mission)", e);
        }
        return v;
    }

    public final static <V> V branch(Mission mission, String threadName) {
        Callable callable = () -> mission.execute();
        FutureTask futureTask = new FutureTask(callable);
        new Thread(futureTask, threadName).start();
        V v = null;
        try {
            v = (V) futureTask.get();
        } catch (Exception e) {
            ExceptionLogger.parameterErr(MultithreadedBranch.class, "branch(Mission mission, String threadName)", e);
        }
        return v;
    }

}
