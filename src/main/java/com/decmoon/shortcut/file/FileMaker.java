package com.decmoon.shortcut.file;

import com.decmoon.shortcut.exception.io.file.FileNotConnectException;
import com.decmoon.shortcut.exception.io.file.FileNotDocumentTypeException;

import java.io.File;
import java.io.IOException;

public class FileMaker {


    /**
     * 创建文件 ,若有该文件则不作为
     *
     * @param file File path
     */
    public static void createDocumentFile(File file) {
        if (Files.isDirectory(file)) {
            throw new FileNotDocumentTypeException();
        }
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new FileNotConnectException();
            }
        }
    }

    /**
     * 创建文件
     *
     * @param files File paths
     */
    public static void createDocumentFile(File... files) {
        if (Files.isDirectories(files)) {
            throw new FileNotDocumentTypeException();
        }

        for (File file : files) {
            createDocumentFile(file);
        }
    }

    /**
     * 创建目录, 若有该目录则不作为
     *
     * @param file
     */
    public static void createDirectory(File file) {
        if (!file.exists()) {
            file.mkdir();
        }
    }


}
