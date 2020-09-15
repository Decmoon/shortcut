# SHORTCUT-API-ZH

### [class] BooleanJudge


简介
-
> boolean 裁决类

结构
-
+ [com.decmoon.shortcut](API-zh.md)
    + [bool](package-bool-zh.md)
        + BooleanJudge

构造方法
-
[[异常触发]](exception-InstantiateException-zh.md)
````
private BooleanJudge()

异常：
      InstantiateException
````

静态方法
-
判断参数是否全部为TRUE
````
public static boolean allTrue(boolean... booleans)

 参数：
        booleans - boolean类型参数集
 返回：
        如果全部为 TRUE,返回 TRUE，否则返回 FALSE
````
判断参数是否全部为FALSE
```` 
public static boolean allFalse(boolean... booleans)

 参数：
        booleans - boolean类型参数集
 返回：
        如果全部为 FALSE,返回 TRUE，否则返回 FALSE
````
判断参数是否存在 TRUE
```` 
public static boolean hasTrue(boolean... booleans)

 参数：
        booleans - boolean类型参数集
 返回：
        如果参数存在TRUE,返回 TRUE，否则返回 FALSE
````

判断参数是否存在FALSE
```` 
public static boolean hasFalse(boolean... booleans)

 参数：
        booleans - boolean类型参数集
 返回：
        如果参数存在FALSE,返回 TRUE，否则返回 FALSE
````
