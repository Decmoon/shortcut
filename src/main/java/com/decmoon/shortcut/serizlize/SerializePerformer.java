package com.decmoon.shortcut.serizlize;

import com.decmoon.shortcut.argument.Arguments;
import com.decmoon.shortcut.exception.io.serialize.SerializeException;
import com.decmoon.shortcut.file.FileInputStreamGenerator;
import com.decmoon.shortcut.file.FileOutPutStreamGenerator;
import com.decmoon.shortcut.file.Files;

import java.io.*;

/**
 * 序列化
 *
 * @author decmoon
 */
public class SerializePerformer {

    private SerializePerformer() {
    }

    /**
     * 序列化
     *
     * @param object Objects
     */
    public static void serialize(String path, Object object) {
        ObjectOutputStream objectOutputStream = ObjectOutputStreamGenerator.newObjectOutputStream(FileOutPutStreamGenerator.newFileOutPutStream(Files.newDocument(path)));
        try {
            objectOutputStream.writeObject(object);
        } catch (IOException e) {
            try {
                throw new SerializeException();
            } catch (SerializeException e1) {
                e1.shutdown();
            }
        }
    }

    /**
     * 反序列化
     *
     * @return Unformatted object
     */
    public final static Object unSerialize(String path) {
        ObjectInputStream objectInputStream = ObjectInputStreamGenerator.newObjectInputStream(FileInputStreamGenerator.newFileInputStream(Files.newDocument(path)));
        //EOFException 文档空结尾
        if (Arguments.isNull(objectInputStream)) {
            return null;
        }
        try {
            return objectInputStream.readObject();
        } catch (Exception e) {
            try {
                throw new SerializeException();
            } catch (SerializeException e1) {
                e1.shutdown();
            }
        }
        return null;
    }
}
