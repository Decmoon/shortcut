package com.decmoon.shortcut.exception.thread;

import com.decmoon.shortcut.exception.ShortCutException;

public class ThreadException extends ShortCutException {

    public ThreadException() {
        super(ThreadException.class, "Thread scheduling failure");
    }

    public ThreadException(String message) {
        super(ThreadException.class, message);
    }
}
