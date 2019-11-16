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
public class BufferedWriterGenerator {

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



}
