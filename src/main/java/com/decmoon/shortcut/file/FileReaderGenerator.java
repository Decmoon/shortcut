package com.decmoon.shortcut.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderGenerator {

    private FileReaderGenerator() {
    }

    public static FileReader newFileReader(File file) throws com.decmoon.shortcut.exception.io.file.FileNotFoundException {
        try {
            return new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new com.decmoon.shortcut.exception.io.file.FileNotFoundException();
        }
    }


}
