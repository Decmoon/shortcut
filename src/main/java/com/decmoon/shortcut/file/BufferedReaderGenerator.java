package com.decmoon.shortcut.file;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author decmoon
 */
public class BufferedReaderGenerator {
    private BufferedReaderGenerator() {
    }

    public static BufferedReader newBufferedReader(FileReader fileReader) {
        return new BufferedReader(fileReader);
    }

}
