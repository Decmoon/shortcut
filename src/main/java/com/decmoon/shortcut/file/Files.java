package com.decmoon.shortcut.file;

import com.decmoon.shortcut.exception.ExceptionLogger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

    /**
     * Create a File that is only allowed to be a directory File object
     *
     * @param path Directory path
     * @return File object
     */
    public final static File newDirectory(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            return file;
        } else {
            ExceptionLogger.parameterErr(Files.class, "newDirectory(String path)", file + " not a directory");
            return null;
        }

    }

    /**
     * Create a File that is only allowed to be a File object
     *
     * @param path File path
     * @return File object
     */
    public final static File newFile(String path) {
        return newFile(path, false);
    }

    /**
     * Create a File that is only allowed to be a File object
     *
     * @param path   File path
     * @param strict if TRUE verifies that the stream of the file is available , otherwise
     * @return File object
     */
    public final static File newFile(String path, boolean strict) {
        File file = new File(path);
        boolean directory = file.isDirectory();
        if (directory) {
            ExceptionLogger.parameterErr(Files.class, "newFile(String path)", file + " not file");
            return null;
        }
        if (strict) {
            try (FileInputStream fileInputStream = FileInputStreamGenerator.newFileInputStream(file)) {
                fileInputStream.close();
                return file;
            } catch (FileNotFoundException e) {
                ExceptionLogger.parameterErr(Files.class, "newFile(String path)", e);
                return null;
            } catch (IOException e) {
                ExceptionLogger.parameterErr(Files.class, "newFile(String path)", e);
                return null;
            }
        } else {
            return file;
        }
    }

    /**
     * Creates a file if the specified file path does not have it
     *
     * @param file File path
     */
    public static void createFile(File file) {
        if (isDirectory(file)) {
            ExceptionLogger.parameterErr(Files.class, "createFile(File file)", file + " is a directory");
        }
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                ExceptionLogger.parameterErr(Files.class, "createFile(File file)", e);
            }
        }
    }

    /**
     * Creates files if the specified file path does not have it
     *
     * @param files File paths
     */
    public static void createFile(File... files) {
        for (File file : files) {
            if (file.isDirectory()) {
                ExceptionLogger.parameterErr(Files.class, "createFile(File file)", file + " is a directory");
                return;
            }
        }
        for (File file : files){
            createFile(file);
        }
    }


    public static boolean isDirectory(File file) {
        return file.isDirectory();
    }

    public static boolean isDirectories(File... files) {
        boolean bo = true;
        for (File file : files){
            if ((bo = isDirectory(file) == false)){
                return bo;
            }
        }
        return bo;
    }

}
