package com.decmoon.shortcut.collection;

import com.decmoon.shortcut.argument.Arguments;
import com.decmoon.shortcut.exception.argument.ParameterIllegalException;
import com.decmoon.shortcut.exception.illegal.InstantiateException;
import com.decmoon.shortcut.object.ObjectInformation;
import com.decmoon.shortcut.print.Print;
import com.decmoon.shortcut.string.StringProcessor;
import com.decmoon.shortcut.string.Strings;

import java.util.Collection;
import java.util.Iterator;

import static com.decmoon.shortcut.color.ColorCoater.*;

/**
 * Collection exhibitor
 *
 * @author decmoon
 */
public class CollectionExhibitor {

    private CollectionExhibitor() {
        throw new InstantiateException();
    }

    /**
     * Show the collection details
     *
     * @param collection collection
     * @param <E>        Supports generics
     */
    public static <E> void see(Collection<E> collection){
        if (Arguments.parameterIllegal(collection)) {
            throw new ParameterIllegalException();
        }
        ObjectInformation.information(collection);
        int keySize = 5, valueSize = 20, typeSize = 20;

        keySize = Math.max(keySize, collection.size());
        for (E e : collection) {
            valueSize = Math.max(valueSize, e.toString().length());
            typeSize = Math.max(typeSize, e.getClass().getName().length());
        }

        Iterator iterator = collection.iterator();
        int length = keySize + valueSize + typeSize + 8;
        StringBuffer stringBuffer = Strings.newStringBuffer("|");
        for (int i = 0; i < length; i++) {
            stringBuffer.append("-");
        }
        stringBuffer.append("|");
        Print.print(blue(stringBuffer));
        boolean is = true;
        int index = 0;
        while (iterator.hasNext()) {
            E e = (E) iterator.next();
            if (is) {
                Print.print(
                        blue("| "),
                        red(StringProcessor.headString(keySize, "INDEX")),
                        blue(" | "),
                        red(StringProcessor.headString(valueSize, "VALUE")),
                        blue(" | "),
                        red(StringProcessor.headString(typeSize, "TYPE")),
                        blue(" |"));
                Print.print(stringBuffer);
                is = false;
            }
            Print.print(
                    blue("| "),
                    magenta(StringProcessor.headString(keySize, (index++) + "")),
                    blue(" | "),
                    black(StringProcessor.headString(valueSize, e.toString())),
                    blue(" | "),
                    white(StringProcessor.headString(typeSize, e.getClass().getName())),
                    blue(" |"));
        }
        Print.print(blue(stringBuffer));
        Print.print(black(""));
    }


}
