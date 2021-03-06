package com.decmoon.shortcut.serialize;

import com.decmoon.shortcut.argument.Arguments;
import com.decmoon.shortcut.exception.illegal.InstantiateException;
import com.decmoon.shortcut.exception.io.file.FileNotConnectException;
import com.decmoon.shortcut.file.FileInputStreamGenerator;
import com.decmoon.shortcut.file.FileOutPutStreamGenerator;
import com.decmoon.shortcut.file.Files;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化
 *
 * @author decmoon
 */
public class SerializePerformer {

    private SerializePerformer() {
        throw new InstantiateException();
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
            throw new FileNotConnectException();
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
            throw new FileNotConnectException();
        }
    }
}
