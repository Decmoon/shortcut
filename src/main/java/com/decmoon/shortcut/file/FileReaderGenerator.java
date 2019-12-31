package com.decmoon.shortcut.file;

import com.decmoon.shortcut.exception.ExceptionLogger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderGenerator {
    private FileReaderGenerator() {
    }

    public static FileReader newFileReader(File file) {
        try {
            return newFileReaderWithThrows(file);
        } catch (FileNotFoundException e) {
            ExceptionLogger.parameterErr(FileReaderGenerator.class, "newFileReader(File file)", e);
            return null;
        }
    }

    public static FileReader newFileReaderWithThrows(File file) throws FileNotFoundException {
        return new FileReader(file);
    }


}
