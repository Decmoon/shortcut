package com.decmoon.shortcut.file;

import com.decmoon.shortcut.exception.illegal.InstantiateException;
import com.decmoon.shortcut.exception.io.file.FileNotConnectException;

import java.io.BufferedReader;
import java.io.IOException;

public class DocumentReadingFactory {


    private DocumentReadingFactory() {
        throw new InstantiateException();
    }
    //-----------------------------------------
    //By BufferedReader
    //-----------------------------------------

    public static String readingLine(BufferedReader bufferedReader) throws FileNotConnectException {
        try {
            return readingLineWithThrows(bufferedReader);
        } catch (IOException e) {
            throw new FileNotConnectException();
        }
    }


    public static String readingLineWithThrows(BufferedReader bufferedReader) throws IOException {
        return bufferedReader.readLine();
    }

}
