package com.decmoon.shortcut;

import com.decmoon.shortcut.core.log.Logger;
import com.decmoon.shortcut.exception.argument.ParameterIllegalException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Autowired
    private Logger logger;

    public void throwException(){
        throw  new ParameterIllegalException();
    }

    public void writeLog(){
        logger.info("Hello world");
    }
}
