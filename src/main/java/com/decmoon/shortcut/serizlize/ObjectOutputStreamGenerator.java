package com.decmoon.shortcut.serizlize;

import com.decmoon.shortcut.exception.illegal.InstantiateException;
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
        throw new InstantiateException();
    }

    public static ObjectOutputStream newObjectOutputStream(FileOutputStream fileOutputStream) {
        try {
            return new ObjectOutputStream(fileOutputStream);
        } catch (IOException e) {
            throw new FileNotFoundException();
        }
    }

}
