package com.decmoon.shortcut.file;

import com.decmoon.shortcut.exception.ExceptionLogger;
import com.decmoon.shortcut.string.ToString;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * File stream processing
 *
 * @author decmoon
 */
public class BufferWriter {

    /**
     * Create a new BufferedWriter object
     *
     * @param fileWriter FileWriter
     * @return BufferedWriter object
     */
    public static BufferedWriter newBufferedWriter(FileWriter fileWriter) {
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        return bufferedWriter;
    }

    /**
     * Output text in a file using BufferedWriter
     *
     * @param bufferedWriter BufferedWriter
     * @param messages       The information you want to print
     */
    public static void typewriting(BufferedWriter bufferedWriter, String... messages) {
        typewriting(bufferedWriter, ToString.toString(messages));
    }

    /**
     * Output text in a file using BufferedWriter
     *
     * @param bufferedWriter BufferedWriter
     * @param message        The information you want to print
     */
    public static void typewriting(BufferedWriter bufferedWriter, String message) {
        try {
            bufferedWriter.write(message);
            bufferedWriter.flush();
        } catch (IOException e) {
            ExceptionLogger.parameterErr(BufferWriter.class, "typewriting(BufferedWriter bufferedWriter , String message)", e);
        }
    }


}
