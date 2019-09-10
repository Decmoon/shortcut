package com.decmoon.shortcut.collection.list;

import com.decmoon.shortcut.bool.BooleanJudge;
import com.decmoon.shortcut.collection.CollectionRecognizer;
import com.decmoon.shortcut.log.Logger;
import com.decmoon.shortcut.print.Print;
import com.decmoon.shortcut.string.StringProcessor;
import com.decmoon.shortcut.string.Strings;

import java.util.Iterator;
import java.util.List;

import static com.decmoon.shortcut.color.ColorCoater.*;

public class ListExhibitor {

    public static <E> void see(List<E> list) {
        if (BooleanJudge.hasTrue(CollectionRecognizer.isNull(list), CollectionRecognizer.isEmpty(list))) {
            Logger.err("The list must not be empty");
            return;
        }
        Logger.log(ListExhibitor.class.getName() + ".see()  printing ...");
        int keySize=5, valueSize = 20, typeSize = 20;

        keySize = Math.max(keySize, list.size());
        for (E e : list) {
            valueSize = Math.max(valueSize,e.toString().length());
            typeSize = Math.max(typeSize,e.getClass().getName().length());
        }

        Iterator iterator = list.iterator();
        int length = keySize + valueSize + typeSize + 8;
        StringBuffer stringBuffer = Strings.newStringBuffer("|");
        for (int i = 0; i < length; i++)
            stringBuffer.append("-");
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
    }


}
