package com.decmoon.shortcut.file;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * File stream processing
 *
 * @author decmoon
 */
public class BufferedWriterGenerator {

    private BufferedWriterGenerator() {
    }

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
