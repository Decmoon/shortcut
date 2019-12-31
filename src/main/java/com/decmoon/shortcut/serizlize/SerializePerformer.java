package com.decmoon.shortcut.serizlize;

import com.decmoon.shortcut.log.Logger;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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
     * @param bytes Formatted byte array
     * @return Unformatted object
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
