package com.decmoon.shortcut.serizlize;

import com.decmoon.shortcut.log.Logger;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerizlizePerformer {

    /**
     * Serialization for redis to store objects
     *
     * @param object
     * @return
     */
    public final static byte[] serialize(Object object) {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        ) {
            objectOutputStream.writeObject(object);
            byte[] bytes = byteArrayOutputStream.toByteArray();
            return bytes;
        } catch (Exception e) {
            Logger.err("serialize failure");
        }
        return null;
    }

    /**
     * Deserialization for redis to read objects
     *
     * @param bytes
     * @return
     */
    public final static Object unSerialize(byte[] bytes) {
        try (
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        ) {
            return objectInputStream.readObject();
        } catch (Exception e) {
            Logger.err("un serialize failure");
        }
        return null;
    }
}
