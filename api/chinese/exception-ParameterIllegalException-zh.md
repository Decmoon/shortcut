# SHORTCUT-API-ZH

### [class] ParameterIllegalException


简介
-
> 参数非法异常

结构
-
+ [com.decmoon.shortcut](API-zh.md)
    + [exception](package-exception-zh.md)
        + [argument](package-exception-argument-zh.md)
            + ParameterIllegalException
        
构造方法
-

````
public ParameterIllegalException()
````
```` 
public ParameterIllegalException(String message)

 参数：
         message - 异常信息
````

适用范围
-
+ 经 [Argument](class-Arguments-zh.md).parameterLegal() 方法未通过的参数异常
+ 未通过用户自定义判断条件的参数异常