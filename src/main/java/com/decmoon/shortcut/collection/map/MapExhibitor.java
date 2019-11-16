package com.decmoon.shortcut.collection.map;

import com.decmoon.shortcut.argument.Arguments;
import com.decmoon.shortcut.bool.BooleanJudge;
import com.decmoon.shortcut.collection.CollectionChecker;
import com.decmoon.shortcut.exception.ExceptionLogger;
import com.decmoon.shortcut.log.Logger;
import com.decmoon.shortcut.object.ObjectInformation;
import com.decmoon.shortcut.print.Print;
import com.decmoon.shortcut.string.StringProcessor;
import com.decmoon.shortcut.string.Strings;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

import static com.decmoon.shortcut.color.ColorCoater.*;

/**
 * Map exhibitor
 *
 * @author decmoon
 */
public class MapExhibitor {


    /**
     * Show the map details
     *
     * @param map map
     * @param <K> Supports generics
     * @param <V> Supports generics
     */
    public static <K, V> void see(Map<K, V> map) {
        if (Arguments.parameterIllegal(map)) {
            ExceptionLogger.parameterErr(MapExhibitor.class, "see(Map<K, V> map)");
            return;
        }
        Logger.log(MapExhibitor.class.getName() + ".see()  printing ...");
        ObjectInformation.information(map);
        int keySize = 20, valueSize = 30, keyTypeSize = 30, valueTypeSize = 30;

        for (Map.Entry<K, V> entry : map.entrySet()) {
            K k = entry.getKey();
            V v = entry.getValue();

            int keyLength = k.toString().length();
            int valueLength = v.toString().length();
            keySize = Math.max(keySize, keyLength);
            valueSize = Math.max(valueSize, valueLength);
            keyTypeSize = Math.max(keyTypeSize, k.getClass().getName().length());
            valueTypeSize = Math.max(valueTypeSize, v.getClass().getName().length());
        }

        int length = keySize + valueSize + keyTypeSize + valueTypeSize + 11;

        StringBuffer stringBuffer = Strings.newStringBuffer("|");
        for (int i = 0; i < length; i++) {
            stringBuffer.append("-");
        }
        stringBuffer.append("|");
        Print.print(blue(stringBuffer));
        boolean is = true;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            K k = entry.getKey();
            V v = entry.getValue();
            if (is) {
                Print.print(
                        blue("| "),
                        red(StringProcessor.headString(keySize, "KEY")),
                        blue(" | "),
                        red(StringProcessor.headString(valueSize, "VALUE")),
                        blue(" | "),
                        red(StringProcessor.headString(valueSize, "KEY TYPE")),
                        blue(" | "),
                        red(StringProcessor.headString(valueSize, "VALUE TYPE")),
                        blue(" |"));
                Print.print(stringBuffer);
                is = false;
            }

            Print.print(
                    blue("| "),
                    black(StringProcessor.headString(keySize, k.toString())),
                    blue(" | "),
                    black(StringProcessor.headString(valueSize, v.toString())),
                    blue(" | "),
                    white(StringProcessor.headString(keyTypeSize, k.getClass().getName())),
                    blue(" | "),
                    white(StringProcessor.headString(valueTypeSize, v.getClass().getName())),
                    blue(" |"));
        }
        Print.print(blue(stringBuffer));
        Print.print(black(""));
    }


}
