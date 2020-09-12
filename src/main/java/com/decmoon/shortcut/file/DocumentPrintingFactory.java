package com.decmoon.shortcut.file;

import com.decmoon.shortcut.argument.Arguments;
import com.decmoon.shortcut.exception.argument.ParameterIllegalException;
import com.decmoon.shortcut.exception.illegal.InstantiateException;
import com.decmoon.shortcut.exception.io.file.FileNotConnectException;
import com.decmoon.shortcut.string.ToString;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;

public class DocumentPrintingFactory {

    private DocumentPrintingFactory() {
        throw new InstantiateException();
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
        typewriting(bufferedOutputStream, message.getBytes());
    }

    public static void typewriting(BufferedOutputStream bufferedOutputStream, byte[] bytes) throws FileNotConnectException {
        try {
            bufferedOutputStream.write(bytes);
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
            throw new ParameterIllegalException();
        }
        typewriting(bufferedWriter, ToString.toString(messages));
    }

    public static void typewriting(BufferedWriter bufferedWriter, String message) {
        try {
            bufferedWriter.write(message);
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new FileNotConnectException();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new FileNotConnectException();
            }
        }
    }

}
