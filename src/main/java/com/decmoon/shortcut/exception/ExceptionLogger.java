package com.decmoon.shortcut.exception;

import com.decmoon.shortcut.log.Logger;

public class ExceptionLogger {

    public  static void parameterErr(Class clazz , String method ){
        Logger.err(clazz.getName() +"."+ method+"  ->  parameter is illegal");
    }

    public  static void parameterErr(Class clazz , String method ,Throwable throwable){
        Logger.err(clazz.getName() +"."+ method+"  ->  "+throwable.fillInStackTrace());
    }

    public  static void parameterErr(Class clazz ,Throwable throwable){
        Logger.err(clazz.getName() +"  ->  "+throwable.fillInStackTrace());
    }
}
