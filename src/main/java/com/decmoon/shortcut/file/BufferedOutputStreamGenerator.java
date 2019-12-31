package com.decmoon.shortcut.file;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * File stream processing
 *
 * @author decmoon
 */
public class BufferedOutputStreamGenerator {

    private BufferedOutputStreamGenerator(){}
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




}
