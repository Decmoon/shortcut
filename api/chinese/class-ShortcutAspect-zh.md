# SHORTCUT-API-ZH

### [abstract-class] ShortcutAspect


简介
-
> Shortcut 切片服务配置类，若使用Shortcut内置切片，
需手动配置切片类并继承与此类

结构
-
+ [com.decmoon.shortcut](API-zh.md)
    + [core](package-core-zh.md)
        + [config](package-config-zh.md)
            + ShortcutAspect

方法
-
pointcut 配置方法
```` 
public abstract void pointcut();
````
执行无返回值执行策略   [[AspectStrategy]](interface-AspectStrategy-zh.md)
```` 
public void doVoid(AspectStrategy aspectStrategy) throws Throwable

  参数：
        aspectStrategy   AspectStrategy 类型参数
 异常：
        Throwable       
````
执行存在返回值的执行策略  [[AspectReturnStrategy]](interface-AspectReturnStrategy-zh.md)
```` 
public Object doReturn(AspectReturnStrategy aspectReturnStrategy) throws Throwable 
    
  参数：
        aspectReturnStrategy   AspectReturnStrategy 类型参数
  返回：
        Object 类型对象    
  异常：
        Throwable    
````

注
-
+ 提倡 使用 lambda 表达式进行方法的调用
+ 用例：[decluna-aspect](https://github.com/Decmoon/decluna/blob/master/src/main/java/com/decmoon/decluna/config/DecLunaAspect.java)