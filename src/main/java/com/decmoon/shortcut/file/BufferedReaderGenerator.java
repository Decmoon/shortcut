package com.decmoon.shortcut.file;

import com.decmoon.shortcut.exception.illegal.InstantiateException;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author decmoon
 */
public class BufferedReaderGenerator {

    private BufferedReaderGenerator() {
        throw new InstantiateException();
    }

    public static BufferedReader newBufferedReader(FileReader fileReader) {
        return new BufferedReader(fileReader);
    }

}
