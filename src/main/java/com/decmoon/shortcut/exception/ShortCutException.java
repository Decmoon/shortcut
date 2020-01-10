package com.decmoon.shortcut.exception;

import com.decmoon.shortcut.argument.Arguments;
import com.decmoon.shortcut.exception.io.file.FileNotConnectException;
import com.decmoon.shortcut.log.Logger;
import com.decmoon.shortcut.string.StringProcessor;
import com.decmoon.shortcut.string.Strings;

/**
 * @author decmoon
 */
public class ShortCutException extends Exception {

    private String exceptionMessage;

    public ShortCutException(Class clazz, String message) {
        this.exceptionMessage = clazz.getName() + " -> " + message + "\n\r" + lineInfo();
    }


    private String lineInfo() {
        StringBuffer stringBuffer = Strings.newStringBuffer();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i = 0; i < stackTrace.length; i++) {
            if (i == 0 || StringProcessor.contains(stackTrace[i].toString(), "Exception")) {
                continue;
            }
            if (Arguments.parameterLegal(stringBuffer)) {
                stringBuffer.append("\t" + stackTrace[i].toString() + "\n\r");
            }
        }
        return Arguments.parameterLegal(stringBuffer) ? stringBuffer.toString() : "";

    }

    @Override
    public void printStackTrace() {
        Logger.err(exceptionMessage);
    }


    public void shutdown() {
        printStackTrace();
        System.exit(1);
    }

    public void catchThrow() {
        try {
            throw new FileNotConnectException();
        } catch (FileNotConnectException e1) {
            e1.shutdown();
        }
    }


}
