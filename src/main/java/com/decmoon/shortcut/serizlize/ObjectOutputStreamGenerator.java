package com.decmoon.shortcut.serizlize;

import com.decmoon.shortcut.exception.io.file.FileNotFoundException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * ObjectOutputStream 生成器
 *
 * @author decmoon
 */
public class ObjectOutputStreamGenerator {

    private ObjectOutputStreamGenerator() {
    }

    public static ObjectOutputStream newObjectOutputStream(FileOutputStream fileOutputStream) {
        try {
            return newObjectOutputStreamWithThrow(fileOutputStream);
        } catch (IOException e) {
            throw new FileNotFoundException();
        }
    }


    public static ObjectOutputStream newObjectOutputStreamWithThrow(FileOutputStream fileOutputStream) throws IOException {
        return new ObjectOutputStream(fileOutputStream);
    }


}
