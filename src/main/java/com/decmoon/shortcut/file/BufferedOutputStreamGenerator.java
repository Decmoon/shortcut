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
public class BufferedOutputStreamGenerator {

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
