# SHORTCUT-API-ZH

### [class] Arguments


简介
-
> 参数管理类

结构
-
+ [com.decmoon.shortcut](API-zh.md)
    + [argument](package-argument-zh.md)
        + Arguments

构造方法
-
[[异常触发]](exception-InstantiateException-zh.md)
````
private Arguments()

异常：
      InstantiateException
````
静态方法
-
判断参数是否为空
````
 public static boolean isNull(Object object)
 
 参数：
        object - Object类型对象
 返回：
        如果对象为空，返回TRUE,否则返回TRUE
````

判断参数是否非空
```` 
public static boolean nonNull(Object object)
 
  参数：
        object - Object类型对象
  返回：
        如果对象非空，返回TRUE,否则返回TRUE
````

创建【ArgumentList】校验集合 用于复合参数检验
```` 
 public static ArgumentList asList(Object... objects)
 
   参数：
         objects - Object类型对象
````



判断参数是否非法【严格】 [【非法条件】](#非法条件)
```` 
public static boolean parameterIllegal(Object object) 

  参数：
        object - Object 类型对象
  返回：
        如果对象非法，返回TRUE，否则返回FALSE
````

判断复合参数是否非法【严格】 [【非法条件】](#非法条件)
```` 
public static boolean parameterIllegal(ArgumentList argumentList) 

  参数：
        argumentList - ArgumentList 类型校验集合
  返回：
        如果对象非法，返回TRUE，否则返回FALSE
````

判断参数是否非法 [【非法条件】](#非法条件)
```` 
public static boolean parameterLegal(boolean strict, Object object)   
   
  参数：
        strict  - boolean 是否严格
        object - Object 类型对象
  返回：
        如果对象非法，返回TRUE，否则返回FALSE
````

判断复合参数是否非法 [【非法条件】](#非法条件)
```` 
public static boolean parameterIllegal(boolean strict,ArgumentList argumentList) 
   
  参数：
        strict  - boolean 是否严格
        argumentList - ArgumentList 类型校验集合
  返回：
        如果对象非法，返回TRUE，否则返回FALSE
````


判断参数是否合法【严格】 [【非法条件】](#非法条件)
```` 
public static boolean parameterLegal(Object object)

  参数：
        object - Object 类型对象
  返回：
        如果对象合法，返回TRUE，否则返回FALSE
````

判断复合参数是否合法【严格】 [【非法条件】](#非法条件)
```` 
public static boolean parameterLegal(ArgumentList argumentList)

  参数：
        argumentList - ArgumentList 类型校验集合
  返回：
        如果对象合法，返回TRUE，否则返回FALSE
````

判断参数是否合法  [【非法条件】](#非法条件)
```` 
public static boolean parameterLegal(boolean strict, Object object)

  参数：
        strict  - boolean 是否严格
        object - Object 类型对象
  返回：
        如果对象合法，返回TRUE，否则返回FALSE
````
判断复合参数是否合法  [【非法条件】](#非法条件)
```` 
public static boolean parameterLegal(boolean strict, ArgumentList argumentList)
    
  参数：
        strict  - boolean 是否严格
        argumentList - ArgumentList 类型校验集合
  返回：
        如果对象合法，返回TRUE，否则返回FALSE
````


备注
-
#### 非法条件
````
如符合一下条件信息，视为非法参数：

A：尚未初始化的数据，如 null
B：Size为 0 的 Collection 对象   [strict] 包含null字段的 Collection 对象
C: Size为 0 的 Map 对象          [strict] 包含null字段的 Map 对象
D: 长度为0的 String 对象         [strict] 去除空字符后长度为0的对象
E: 长度为0的 StringBuffer 或 StringBuilder 对象
                 [strict] 去除空字符后长度为0的 StringBuffer 或 StringBuilder 对象


````


