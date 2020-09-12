package com.decmoon.shortcut.object;

import com.decmoon.shortcut.argument.Arguments;
import com.decmoon.shortcut.exception.argument.ParameterIllegalException;
import com.decmoon.shortcut.core.log.Logger;
import com.decmoon.shortcut.exception.illegal.InstantiateException;
import com.decmoon.shortcut.print.Print;
import com.decmoon.shortcut.string.StringProcessor;

import java.util.Collection;
import java.util.Map;

import static com.decmoon.shortcut.color.ColorCoater.white;

/**
 * Used to query any object information
 *
 * @author decmoon
 */
public class ObjectInformation {

    private ObjectInformation() {
        throw new InstantiateException();
    }

    /**
     * Query object information
     *
     * @param object Object
     */
    public static void information(Object object) {
        if (Arguments.parameterIllegal(object)) {
            throw new ParameterIllegalException();
        }
        sharer(object);
    }

    private final static void sharer(Object object) {
        if (object instanceof Collection) {
            logCollection((Collection) object);
        } else if (object instanceof Map) {
            logMap((Map) object);
        } else if (StringProcessor.equals(object.getClass().getName(), "[I")) {
            logGeneral(object);
        } else {
            logGeneral(object);
        }
    }


    private final static void logCollection(Collection collection) {
        Print.print(
                white("| type     : "),
                white("["),
                white(collection.getClass().getName()),
                white("]\n"),
                white("| length   : "),
                white("["),
                white(collection.size() + ""),
                white("]\n"),
                white("| hashCode : "),
                white("["),
                white(Integer.toHexString(collection.hashCode()) + ""),
                white("]")
        );
    }

    private final static void logMap(Map map) {
        Print.print(
                white("| type     : "),
                white("["),
                white(map.getClass().getName()),
                white("]\n"),
                white("| length   : "),
                white("["),
                white(map.size() + ""),
                white("]\n"),
                white("| hashCode : "),
                white("["),
                white(Integer.toHexString(map.hashCode()) + ""),
                white("]")
        );
    }

    private final static void logGeneral(Object object) {
        Print.print(
                white("| type     : "),
                white("["),
                white(object.getClass().getName()),
                white("]\n"),
                white("| hashCode : "),
                white("["),
                white(Integer.toHexString(object.hashCode()) + ""),
                white("]")
        );
    }


}
