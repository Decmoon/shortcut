package com.decmoon.shortcut.file;

import com.decmoon.shortcut.exception.ExceptionLogger;
import com.decmoon.shortcut.exception.io.file.FileNotConnectException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * File stream processing
 *
 * @author decmoon
 */
public class FileWriterGenerator {

    private FileWriterGenerator() {
    }

    /**
     * Create a new FileWriter object
     *
     * @param file File
     * @return FileWriter object
     */
    public static FileWriter newFileWriter(File file) {
        FileWriter fileWriter;
        try {
            fileWriter = newFileWriterWithThrows(file);
            return fileWriter;
        } catch (IOException e) {
            try {
                throw new FileNotConnectException();
            } catch (FileNotConnectException e1) {
                e1.shutdown();
            }
        }
        return null;
    }


    public static FileWriter newFileWriterWithThrows(File file) throws IOException {
        return new FileWriter(file);
    }

    public static FileWriter newFileWriter(File file, boolean clearBefore) throws FileNotConnectException {
        FileWriter fileWriter;
        try {
            fileWriter = newFileWriterWithThrows(file, clearBefore);
            return fileWriter;
        } catch (IOException e) {
            throw new FileNotConnectException();
        }
    }


    public static FileWriter newFileWriterWithThrows(File file, boolean clearBefore) throws IOException {
        if (clearBefore) {
            return new FileWriter(file, false);
        }
        return new FileWriter(file, true);
    }


}
