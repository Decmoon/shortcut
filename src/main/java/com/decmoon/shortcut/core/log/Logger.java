package com.decmoon.shortcut.core.log;

import com.decmoon.shortcut.date.DateRecorder;
import com.decmoon.shortcut.file.*;
import com.decmoon.shortcut.system.SystemInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileWriter;

@Component
public class Logger {

    private String log_info_path;
    private String log_err_path;
    private File log_info_file;
    private File log_err_file;
    private FileWriter log_info;
    private FileWriter log_err;

    @Autowired
    private LoggerScan loggerScan;

    public void init() {
        log_info_path = loggerScan.getInfo();
        log_err_path = loggerScan.getErr();

        log_info_file = new File(log_info_path);
        log_err_file = new File(log_err_path);

        FileMaker.createDocumentFile(log_info_file, log_err_file);
        log_info = FileWriterGenerator.newFileWriter(log_info_file);
        log_err = FileWriterGenerator.newFileWriter(log_err_file);

        Console.info("The logging service of Shortcut is started");
        Console.info("The path of info is ["+log_info_path+"]");
        Console.info("The path of err is ["+log_err_path+"]");
    }


    public void info(String message) {
        String time = DateRecorder.now();
        DocumentPrintingFactory.typewriting(BufferedWriterGenerator.newBufferedWriter(log_info), time + " " + message + "\n");
    }

    public void warn(String message) {
        String time = DateRecorder.now();
        DocumentPrintingFactory.typewriting(BufferedWriterGenerator.newBufferedWriter(log_info), time + " " + message + "\n");
    }

    public void err(String message) {
        String time = DateRecorder.now();
        DocumentPrintingFactory.typewriting(BufferedWriterGenerator.newBufferedWriter(log_err), time + " " + message);
    }

}
