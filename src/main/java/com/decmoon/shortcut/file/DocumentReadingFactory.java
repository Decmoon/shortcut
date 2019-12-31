package com.decmoon.shortcut.file;

import com.decmoon.shortcut.exception.ExceptionLogger;

import java.io.BufferedReader;
import java.io.IOException;

public class DocumentReadingFactory {


    private DocumentReadingFactory() {
    }
//-----------------------------------------
//By BufferedReader
//-----------------------------------------

    public static String readingLine(BufferedReader bufferedReader) {
        try {
            return readingLineWithThrows(bufferedReader);
        } catch (IOException e) {
            ExceptionLogger.parameterErr(DocumentReadingFactory.class, "readingLine(BufferedReader bufferedReader)", e);
            return null;
        }
    }


    public static String readingLineWithThrows(BufferedReader bufferedReader) throws IOException {
        return bufferedReader.readLine();
    }

}
