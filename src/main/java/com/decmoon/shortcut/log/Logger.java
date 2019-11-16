package com.decmoon.shortcut.log;

import com.decmoon.shortcut.date.DateRecorder;
import com.decmoon.shortcut.file.BufferedWriterGenerator;
import com.decmoon.shortcut.file.DocumentPrintingFactory;
import com.decmoon.shortcut.file.FileWriterGenerator;
import com.decmoon.shortcut.file.Files;
import com.decmoon.shortcut.print.Print;
import com.decmoon.shortcut.string.StringProcessor;
import com.decmoon.shortcut.string.ToString;
import com.decmoon.shortcut.system.SystemInfo;

import java.io.File;
import java.io.FileWriter;

import static com.decmoon.shortcut.color.ColorCoater.*;

public class Logger {

    private final static String LOG_NAME_INFO = "shortcut.log.info.txt";
    private final static String LOG_NAME_ERR = "shortcut.log.err.txt";

    private final static String LOG_INFO_PATH;
    private final static String LOG_ERR_PATH;

    private final static File LOG_INFO_FILE;
    private final static File LOG_ERR_FILE;

    private final static FileWriter LOG_INFO;
    private final static FileWriter LOG_ERR;

    private final static String SHORTCUT;


    static {
        LOG_INFO_PATH = SystemInfo.getUserDir() + Files.SEPARATOR + LOG_NAME_INFO;
        LOG_ERR_PATH = SystemInfo.getUserDir() + Files.SEPARATOR + LOG_NAME_ERR;
        SHORTCUT = Logger.class.getName() + " ";
        LOG_INFO_FILE = Files.newFile(LOG_INFO_PATH);
        LOG_ERR_FILE = Files.newFile(LOG_ERR_PATH);

        Files.createFile(LOG_INFO_FILE, LOG_ERR_FILE);

        LOG_INFO = FileWriterGenerator.newFileWriter(LOG_INFO_FILE);
        LOG_ERR = FileWriterGenerator.newFileWriter(LOG_ERR_FILE);


    }

    public static void log(String message) {
        log(message, true);
    }

    public static void log(String message, boolean print) {
        String time = DateRecorder.now();
        String string = ToString.toString(content(time), green(message), black(""));
        Print.print(string);
        if (print)
            DocumentPrintingFactory.typewriting(BufferedWriterGenerator.newBufferedWriter(LOG_INFO), time + " " + message + "\n");
    }

    public static void err(String message) {
        err(message, true);
    }

    public static void err(String message, boolean print) {
        String time = DateRecorder.now();
        String string = ToString.toString(content(time), red(message), black(""));
        Print.print(string);
        if (print)
            DocumentPrintingFactory.typewriting(BufferedWriterGenerator.newBufferedWriter(LOG_ERR), time + " " + message + "\n");
    }


    private final static StringBuffer content(String time) {
        return ToString.toStringBuffer(white("["),
                yellow(time),
                white("]"),
                white(" ∽ ["),
                white(StringProcessor.tailString(16, Thread.currentThread().getName().toUpperCase())),
                white("] ∽ "),
                cyan(SHORTCUT),
                white(">>>> :  "));
    }


}
