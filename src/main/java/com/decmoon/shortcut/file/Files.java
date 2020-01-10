package com.decmoon.shortcut.file;

import com.decmoon.shortcut.exception.io.file.FileNotConnectException;
import com.decmoon.shortcut.exception.io.file.FileNotDirectoryTypeException;
import com.decmoon.shortcut.exception.io.file.FileNotDocumentTypeException;
import com.decmoon.shortcut.exception.io.file.FileNotFoundException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * File processing
 *
 * @author decmoon
 */
public class Files {
    /**
     * separator
     */
    public final static String SEPARATOR = File.separator;


    private Files() {
    }

    public static File newFile(String path) {
        return new File(path);
    }

    /**
     * Create a File that is only allowed to be a directory File object
     *
     * @param path Directory path
     * @return File object
     */
    public static File newDirectory(String path) throws FileNotDirectoryTypeException {
        File file = new File(path);
        if (file.isDirectory()) {
            return file;
        }
        throw new FileNotDirectoryTypeException();
    }

    /**
     * Create a File that is only allowed to be a File object
     *
     * @param path File path of Document
     * @return File object
     * @throws FileNotDocumentTypeException
     * @throws FileNotFoundException
     * @throws FileNotConnectException
     */
    public static File newDocument(String path) {
        return newDocument(path, false);
    }


    /**
     * Create a File that is only allowed to be a File object
     *
     * @param path   File path of Document
     * @param strict if TRUE verifies that the stream of the file is available , otherwise
     * @return File object
     * @throws FileNotDocumentTypeException
     * @throws FileNotFoundException
     * @throws FileNotConnectException
     */
    public static File newDocument(String path, boolean strict) {
        File file = newFile(path);

        if (file.isDirectory()) {
            try {
                throw new FileNotDocumentTypeException();
            } catch (FileNotDocumentTypeException e) {
                e.shutdown();
            }
        }
        if (strict) {

            if (!file.exists()) {
                try {
                    throw new FileNotFoundException();
                } catch (FileNotFoundException e) {
                    e.shutdown();
                }
            }

            try (FileInputStream fileInputStream = FileInputStreamGenerator.newFileInputStream(file)) {
                fileInputStream.read();
            } catch (IOException e) {
                try {
                    throw new FileNotConnectException();
                } catch (FileNotConnectException e1) {
                    e1.shutdown();
                }
            }
            return file;
        } else {
            return file;
        }
    }


    /**
     * Creates a file if the specified file path does not have it
     *
     * @param file File path
     */
    public static void createDocumentFile(File file) {
        if (isDirectory(file)) {
            try {
                throw new FileNotDocumentTypeException();
            } catch (FileNotDocumentTypeException e) {
                e.shutdown();
            }
        }
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                try {
                    throw new FileNotConnectException();
                } catch (FileNotConnectException e1) {
                    e1.shutdown();
                }
            }
        }
    }

    /**
     * Creates files if the specified file path does not have it
     *
     * @param files File paths
     */
    public static void createDocumentFile(File... files) {
        if (isDirectories(files)) {
            try {
                throw new FileNotDocumentTypeException();
            } catch (FileNotDocumentTypeException e) {
                e.shutdown();

            }
        }

        for (File file : files) {
            createDocumentFile(file);
        }
    }


    public static boolean isDirectory(File file) {
        return file.isDirectory();
    }

    public static boolean isDirectories(File... files) {
        boolean bo = true;
        for (File file : files) {
            if ((bo = isDirectory(file)) == false) {
                return bo;
            }
        }
        return bo;
    }

}
