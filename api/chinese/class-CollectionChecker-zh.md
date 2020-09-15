# SHORTCUT-API-ZH

### [class] CollectionChecker


简介
-
> 集合审查类

结构
-
+ [com.decmoon.shortcut](API-zh.md)
    + [collection](package-collection-zh.md)
        + CollectionChecker
        
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
判断Collection集合是否包含空元素 [[异常触发]](exception-ParameterIllegalException-zh.md)
```` 
 public static boolean containNULL(Collection collection) 
 
 
 参数：
        collection - Collection 类型参数
 返回：
        如果集合包含 NULL 元素,返回 TRUE，否则返回 FALSE
 异常：
        ParameterIllegalException
````

判断Collection集合是否不包含空元素 [[异常触发]](exception-ParameterIllegalException-zh.md)
```` 
 public static boolean nonContainNULL(Collection collection) 
 
 
 参数：
        collection - Collection 类型参数
 返回：
        如果集合不包含 NULL 元素,返回 TRUE，否则返回 FALSE
 异常：
        ParameterIllegalException
````

判断Map集合是否包含空元素 [[异常触发]](exception-ParameterIllegalException-zh.md)
```` 
public static <K, V> boolean nonContainNULL(Map<K, V> map)
 
 
 参数：
        map - Map 类型参数
 返回：
        如果集合包含 NULL 元素,返回 TRUE，否则返回 FALSE
 异常：
        ParameterIllegalException
````

判断Map集合是否不包含空元素 [[异常触发]](exception-ParameterIllegalException-zh.md)
```` 
public static <K, V> boolean nonContainNULL(Map<K, V> map)
 
 
 参数：
         map - Map 类型参数
 返回：
        如果集合不包含 NULL 元素,返回 TRUE，否则返回 FALSE
 异常：
        ParameterIllegalException
````