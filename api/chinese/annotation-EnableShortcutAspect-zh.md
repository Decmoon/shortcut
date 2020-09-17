# SHORTCUT-API-ZH

### [annotation] EnableShortCutAspect


简介
-
> Shortcut AOP切片启动注解


结构
-
+ [com.decmoon.shortcut](API-zh.md)
    + [core](package-core-zh.md)
        + [annotation](package-annotation-zh.md)
            + EnableShortcutAspect

方法
-
是否开启切片
````
boolean enable() default true;
````
切片配置类
```` 
 Class aspect()
````

功能
-
+ 优化 Shortcut 异常抛出

使用
-
撰写本地化Aspect配置监听文件,文件类需继承 [ShortcutAspect](class-ShortcutAspect-zh.md)，
自定义`pointcut`切点 并在监听中引用 `doVoid()` 或 `doReturn()` 方法进行配置
> 摘自 com.decmoon.decluna 项目 ↓
````java
@Aspect
public class DecLunaAspect extends ShortCutAspect {

    @Override
    @Pointcut("execution(* com.decmoon.decluna.service.page.*.*(..))")
    public void pointcut() {
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        return doReturn(() -> joinPoint.proceed());
    }

}
````
配置启动类并配置切片类
````java
@SpringBootApplication
@EnableShortcutAspect(aspect = DecLunaAspect.class)
public class Application {
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
}
````