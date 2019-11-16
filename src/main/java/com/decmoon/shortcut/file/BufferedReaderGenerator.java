package com.decmoon.shortcut.file;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderGenerator {

    public static BufferedReader newBufferedReader(FileReader fileReader) {
        return new BufferedReader(fileReader);
    }

}
