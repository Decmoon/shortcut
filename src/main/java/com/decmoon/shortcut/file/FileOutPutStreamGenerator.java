package com.decmoon.shortcut.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *  FileOutPutStream 生成器
 *
 * @author decmoon
 */
public class FileOutPutStreamGenerator {

    private FileOutPutStreamGenerator() {
    }

    /**
     * 创建 FileOutPutStream 流
     *
     * @param file File
     * @return FileOutputStream object
     */
    public static FileOutputStream newFileOutPutStream(File file) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = newFileOutPutStreamWithThrows(file);
            return fileOutputStream;
        } catch (FileNotFoundException e) {
            try {
                throw new com.decmoon.shortcut.exception.io.file.FileNotFoundException();
            } catch (com.decmoon.shortcut.exception.io.file.FileNotFoundException e1) {
                e1.shutdown();
            }
        }
        return null;
    }

    /**
     * 创建 FileOutPutStream 流
     *
     * @param file
     * @return
     * @throws FileNotFoundException
     */
    public static FileOutputStream newFileOutPutStreamWithThrows(File file) throws FileNotFoundException {
        return new FileOutputStream(file);
    }

}
