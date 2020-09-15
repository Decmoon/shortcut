# SHORTCUT-API-ZH

### [class] InstantiateException


简介
-
> 参数非法异常

结构
-
+ [com.decmoon.shortcut](API-zh.md)
    + [exception](package-exception-zh.md)
        + [illegal](package-illegal-zh.md)
            + InstantiateException
        
构造方法
-

````
public InstantiateException()
````
```` 
public InstantiateException(String message)

 参数：
         message - 异常信息
````

适用范围
-
+ 规避外部调用对静态类的对象创建
+ 规避静态类内部方法创造对象

