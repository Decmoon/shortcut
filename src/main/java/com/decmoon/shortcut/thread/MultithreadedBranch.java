package com.decmoon.shortcut.thread;

import com.decmoon.shortcut.argument.Arguments;
import com.decmoon.shortcut.exception.argument.ParameterIllegalException;
import com.decmoon.shortcut.exception.illegal.InstantiateException;
import com.decmoon.shortcut.exception.thread.ThreadException;
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
        throw new InstantiateException();
    }

    /**
     * Using multiple threads to perform tasks,
     * it is recommended to use ramda expressions for writing,
     * type:Runnable
     *
     * @param execute Execute
     */
    public final static void rBranch(Execute execute) {
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
    public final static void rBranch(Execute execute, String threadName) {
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
     * @param <T>     Supports generics
     * @return Multithreaded return value
     */
    public final static <T> T cBranch(Mission mission, Class<T> type) {
        return callableThread(mission, null, type);
    }

    public final static <T> T cBranch(Mission mission, String threadName, Class<T> type) {
        if (Arguments.parameterIllegal(threadName)) {
            throw new ParameterIllegalException();
        }
        return callableThread(mission, threadName, type);
    }


    /**
     * Using multiple threads to perform tasks,
     * it is recommended to use ramda expressions for writing,
     * type:Callable
     *
     * @param mission    Mission
     * @param threadName Thread name
     * @param <T>        Supports generics
     * @return Multithreaded return value
     */
    private final static <T> T callableThread(Mission mission, String threadName, Class<T> type) {
        Callable callable = () -> mission.execute();
        FutureTask futureTask = new FutureTask(callable);
        if (Arguments.parameterLegal(threadName)) {
            new Thread(futureTask, threadName).start();
        } else {
            new Thread(futureTask).start();
        }

        try {
            return (T) futureTask.get();
        } catch (Exception e) {
            throw new ThreadException();
        }
    }
}
