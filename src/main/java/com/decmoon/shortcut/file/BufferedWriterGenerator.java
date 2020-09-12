package com.decmoon.shortcut.file;

import com.decmoon.shortcut.exception.illegal.InstantiateException;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * File stream processing
 *
 * @author decmoon
 */
public class BufferedWriterGenerator {

    private BufferedWriterGenerator() {
        throw new InstantiateException();
    }

    /**
     * Create a new BufferedWriter object
     *
     * @param fileWriter FileWriter
     * @return BufferedWriter object
     */
    public static BufferedWriter newBufferedWriter(FileWriter fileWriter) {
        return new BufferedWriter(fileWriter);
    }


}
