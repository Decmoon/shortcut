package com.decmoon.shortcut.file;

import com.decmoon.shortcut.exception.illegal.InstantiateException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * FileOutPutStream 生成器
 *
 * @author decmoon
 */
public class FileOutPutStreamGenerator {

    private FileOutPutStreamGenerator() {
        throw new InstantiateException();
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
            fileOutputStream = new FileOutputStream(file);
            return fileOutputStream;
        } catch (FileNotFoundException e) {
            throw new com.decmoon.shortcut.exception.io.file.FileNotFoundException();
        }
    }


}
