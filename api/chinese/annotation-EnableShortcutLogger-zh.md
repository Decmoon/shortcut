# SHORTCUT-API-ZH

### [annotation] EnableShortCutLogger


简介
-
> Shortcut 日志启动注解


结构
-
+ [com.decmoon.shortcut](API-zh.md)
    + [core](package-core-zh.md)
        + [annotation](package-annotation-zh.md)
            + EnableShortCutLogger

方法
-
````
boolean enable() default true;
````

功能
-
+ 启动 Shortcut 日志记录
+ `Info`与`Warn`级别日志输出至指定`info`级别文件
+ `Err`级别日志输出至指定`err`级别文件

使用
-
在`.properties` 或者 `.yml` 文件中配置日志输出位置

 ````yml
spring:
  shortcut:
    log:
      info: "Info category output file path"
      err: "Error category output file path"
````
添加注解至启动类
````java
@SpringBootApplication
@EnableShortcutLogger
public class ShortcutApplication {
    
    @Autowired
    private Logger logger;

    public static void main(String[] args) {
        SpringApplication.run(ShortcutApplication.class, args);
    }

}
````
通过 @Autowired 注入 Logger 
````java
public class TestLogger{
    
    @Autowired
    private Logger logger;
    
    public void test_logger(){
        logger.info("");
        logger.warn("");
        logger.err("");
    }
}
````