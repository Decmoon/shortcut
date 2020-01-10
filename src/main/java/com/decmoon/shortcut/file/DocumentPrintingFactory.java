package com.decmoon.shortcut.file;

import com.decmoon.shortcut.argument.Arguments;
import com.decmoon.shortcut.exception.ExceptionLogger;
import com.decmoon.shortcut.exception.io.file.FileNotConnectException;
import com.decmoon.shortcut.string.ToString;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;

public class DocumentPrintingFactory {

    private DocumentPrintingFactory() {
    }

//-----------------------------------------
//By BufferedOutputStream
//-----------------------------------------

    /**
     * Output text in a file using BufferedOutputStream
     *
     * @param bufferedOutputStream BufferedOutputStream
     * @param messages             The information you want to print
     */
    public static void typewriting(BufferedOutputStream bufferedOutputStream, String... messages) throws FileNotConnectException {
        typewriting(bufferedOutputStream, ToString.toString(messages));
    }

    /**
     * Output text in a file using BufferedOutputStream
     *
     * @param bufferedOutputStream BufferedOutputStream
     * @param message              The information you want to print
     */
    public static void typewriting(BufferedOutputStream bufferedOutputStream, String message) throws FileNotConnectException {
        try {
            bufferedOutputStream.write(message.getBytes());
            bufferedOutputStream.flush();
        } catch (IOException e) {
            throw new FileNotConnectException();
        }

    }


//-----------------------------------------
//By BufferedWriter
//-----------------------------------------

    public static void typewriting(BufferedWriter bufferedWriter, String... messages) {
        if (Arguments.parameterIllegal(messages)) {
            ExceptionLogger.parameterErr(DocumentPrintingFactory.class, "typewriting(BufferedWriter bufferedWriter, String... messages)", "No illegal elements are allowed");
            return;
        }
        typewriting(bufferedWriter, ToString.toString(messages));
    }

    public static void typewriting(BufferedWriter bufferedWriter, String message) {
        try {
            typewritingWithThrows(bufferedWriter, message);
        } catch (IOException e) {
            ExceptionLogger.parameterErr(DocumentPrintingFactory.class, "typewriting(BufferedWriter bufferedWriter , String message)", e);
        }
    }

    public static void typewritingWithThrows(BufferedWriter bufferedWriter, String message) throws IOException {
        bufferedWriter.write(message);
        bufferedWriter.flush();
    }

}