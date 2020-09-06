package com.decmoon.shortcut.thread;

import com.decmoon.shortcut.argument.Arguments;
import com.decmoon.shortcut.exception.ExceptionLogger;
import com.decmoon.shortcut.exception.argument.ParameterIllegalException;
import com.decmoon.shortcut.function.Execute;
import com.decmoon.shortcut.function.Mission;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Simple multi-line and multi-thread methods
 *
 * @author decmoon
 */
public class MultithreadedBranch {

    private MultithreadedBranch() {
    }

    /**
     * Using multiple threads to perform tasks,
     * it is recommended to use ramda expressions for writing,
     * type:Runnable
     *
     * @param execute Execute
     */
    public final static void branch(Execute execute) {
        runnableThread(execute, null);
    }

    /**
     * Using multiple threads to perform tasks,
     * it is recommended to use ramda expressions for writing,
     * type:Runnable
     *
     * @param execute    Execute
     * @param threadName Thread name
     */
    public final static void branch(Execute execute, String threadName) {
        if (Arguments.parameterIllegal(threadName)) {
            throw new ParameterIllegalException();
        }
        runnableThread(execute, threadName);
    }


    private final static void runnableThread(Execute execute, String threadName) {
        if (Arguments.parameterLegal(threadName)) {
            new Thread(() -> {
                execute.execute();
            }, threadName).start();
        } else {
            new Thread(() -> {
                execute.execute();
            }).start();
        }
    }

    /**
     * Using multiple threads to perform tasks,
     * it is recommended to use ramda expressions for writing,
     * type:Callable
     *
     * @param mission Mission
     * @param <V>     Supports generics
     * @return Multithreaded return value
     */
    public final static <V> V rBranch(Mission mission) {
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

    /**
     * Using multiple threads to perform tasks,
     * it is recommended to use ramda expressions for writing,
     * type:Callable
     *
     * @param mission    Mission
     * @param threadName Thread name
     * @param <V>        Supports generics
     * @return Multithreaded return value
     */
    public final static <V> V rBranch(Mission mission, String threadName) {
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
