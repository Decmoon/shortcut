package com.decmoon.shortcut.file;

import com.decmoon.shortcut.exception.ExceptionLogger;
import com.decmoon.shortcut.string.ToString;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * File stream processing
 *
 * @author decmoon
 */
public class BufferOutPut {

    /**
     * Create a new BufferedOutputStream object
     *
     * @param fileOutputStream FileOutputStream
     * @return BufferedOutputStream object
     */
    public static BufferedOutputStream newBufferedOutputStream(FileOutputStream fileOutputStream) {
        BufferedOutputStream bufferedOutputStream;
        bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        return bufferedOutputStream;
    }

    /**
     * Output text in a file using BufferedOutputStream
     *
     * @param bufferedOutputStream BufferedOutputStream
     * @param messages             The information you want to print
     */
    public static void typewriting(BufferedOutputStream bufferedOutputStream, String... messages) {
        typewriting(bufferedOutputStream, ToString.toString(messages));
    }

    /**
     * Output text in a file using BufferedOutputStream
     *
     * @param bufferedOutputStream BufferedOutputStream
     * @param message              The information you want to print
     */
    public static void typewriting(BufferedOutputStream bufferedOutputStream, String message) {
        try {
            bufferedOutputStream.write(message.getBytes());
            bufferedOutputStream.flush();
        } catch (IOException e) {
            ExceptionLogger.parameterErr(BufferOutPut.class, "typewriting(BufferedOutputStream bufferedOutputStream , String message)", e);
        }

    }


}
