
SHORTCUT
-

[![Build Status](https://travis-ci.org/Decmoon/shortcut.svg?branch=master)](https://travis-ci.org/github/Decmoon/shortcut)
[![Gitpod Ready-to-Code](https://img.shields.io/badge/Gitpod-Ready--to--Code-blue?logo=gitpod)](https://gitpod.io/#https://github.com/Decmoon/shortcut) 

**Author**

> [<img width="30px" title="Decmoon" src="https://avatars3.githubusercontent.com/u/51840843?s=400&u=d909c885dc61d75a2ca60c6d52c2315714d8bdfe&v=4"/>
](https://github.com/Decmoon)


Intro
-
Open source toolkit based on springboot.
You can use it to simplify code and improve development efficiency

 

Function
-
+ Static methods that makes your development easier and faster
+ Custom log
+ Better looking console
+ General utility tool 
+ Etc

API
-
+ [中文](api/chinese/API-zh.md)
+ [English](api/english/API-en.md)

Log
-
Customize the log location by configuring the information
 in the `.properties` or `.yml` file.
 ````yml
spring:
  shortcut:
    log:
      info: "Info category output file path"
      err: "Error category output file path"
````
 
And **configure the annotations** in the application class
````java
@SpringBootApplication
@EnableShortcutAspect
@EnableShortcutLogger
public class ShortcutApplication {
    
    @Autowired
    private Logger logger;

    public static void main(String[] args) {
        logger.info("Enjoying your code");
        SpringApplication.run(ShortcutApplication.class, args);
    }

}
````


Annotation
-
Annotation|Target|description
:---:|:---:|:---
@EnableShortcutAspect|Application.java|Turn on aspect of shortcut,make the console look better 
@EnableShortcutLogger|Application.java|Turn on the logging service

JDK
-
JDK version 1.8 and above

Quote 
-
At present, **shortcut** no upload on the web, so if you wanna use **shortcut** to program development,
for the moment can by **clone** project to your local computer, 
packaged into **shortcut jar package**, and then import **shortcut**'s dependencies ,
I hope you in the use of shortcut programming development, give me some feedback,
I'm really looking forward to your opinion

Import dependence
-

You can add a dependency under the pom file in your project to use the toolkit

```xml
<dependency>
    <groupId>com.decmoon</groupId>
    <artifactId>shortcut</artifactId>
    <version>0.0.9</version>
</dependency>
```


Statement
-
**Copyright © [Decmoon](https://github.com/Decmoon)**<br/>
