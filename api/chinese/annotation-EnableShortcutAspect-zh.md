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
````
boolean enable() default true;
````

功能
-
+ 优化 Shortcut 异常抛出

使用
-
配置启动类
````java
@SpringBootApplication
@EnableShortcutAspect
public class ShortcutApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(ShortcutApplication.class, args);
    }
    
}
````