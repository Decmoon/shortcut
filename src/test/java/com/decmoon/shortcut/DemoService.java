package com.decmoon.shortcut;

import com.decmoon.shortcut.exception.argument.ParameterIllegalException;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public void throwException(){
        throw  new ParameterIllegalException();
    }

}
