package com.decmoon.shortcut.serizlize;

import com.decmoon.shortcut.exception.io.serialize.SerializeException;
import com.decmoon.shortcut.exception.io.serialize.UnserializeException;
import com.decmoon.shortcut.log.Logger;

import java.io.*;

/**
 * Simple formatting and encapsulation
 *
 * @author decmoon
 */
public class SerializePerformer {

    private SerializePerformer() {
    }

    /**
     * Serialization for redis to store objects
     *
     * @param object Objects
     * @return Formatted byte array
     */
    public static byte[] serialize(Object object) throws SerializeException {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        ) {
            objectOutputStream.writeObject(object);
            byte[] bytes = byteArrayOutputStream.toByteArray();
            return bytes;
        } catch (Exception e) {
            throw new SerializeException();
        }
    }

    /**
     * Deserialization for redis to read objects
     *
     * @param bytes Formatted byte array
     * @return Unformatted object
     */
    public final static Object unSerialize(byte[] bytes) throws UnserializeException {
        try (
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        ) {
            return objectInputStream.readObject();
        } catch (Exception e) {
            throw new UnserializeException();
        }
    }
}
