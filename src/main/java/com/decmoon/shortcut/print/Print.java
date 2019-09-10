package com.decmoon.shortcut.print;

import com.decmoon.shortcut.string.ToString;

public class Print {

    public static void print(String ... strings){
        System.out.println(ToString.toString(strings));
    }

    public static void print(StringBuffer ... stringBuffers){
        System.out.println(ToString.toString(stringBuffers));
    }

}
