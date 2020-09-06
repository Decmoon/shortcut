package com.decmoon.shortcut.serizlize;

import com.decmoon.shortcut.exception.io.file.FileNotFoundException;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * ObjectInputStream 生成器
 *
 * @author decmoon
 */
public class ObjectInputStreamGenerator {

    private ObjectInputStreamGenerator() {
    }

    /**
     * 返回 ObjectInputStream 对象，当文档空结尾时会返回 null
     *
     * @param fileOutputStream
     * @return
     */
    public static ObjectInputStream newObjectInputStream(FileInputStream fileOutputStream) {
        try {
            return newObjectInputStreamWithThrow(fileOutputStream);
        } catch (IOException e) {
            if (e instanceof EOFException) {
                //文档无内容
                return null;
            }
            throw new FileNotFoundException();
        }
    }

    public static ObjectInputStream newObjectInputStreamWithThrow(FileInputStream fileOutputStream) throws IOException {
        return new ObjectInputStream(fileOutputStream);
    }
}
