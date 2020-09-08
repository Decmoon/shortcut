
SHORTCUT
-

**AUTHOR:**
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

Example
-
#### Math: 
Are you tired of the complicated logic of generating random Numbers every time？<br/>
**_Generate random Numbers between 5 and 15,_**<br/>
you need to write it this way before:
```
    double random = Math.random() * (15 - 5) + 5;
```
Alright, **shortcut** gives you a more convenient way, and you just need to use it.
```
    double random = RandomNumberGenerator.random(5.0, 15.0);
```
You could even write it like this, they're both correct
```
    double random = RandomNumberGenerator.random(15.0, 5.0);
```
Negative Numbers are still valid
```
    double random = RandomNumberGenerator.random(-5,10);
```

#### Thread: 

If you wanted to create a **multithread** and run it, what would you write?
```
  new Thread(()->"The traditional threading approach makes the code look more complex").start();
```
Now , you have shortcut ,you just need....
```
    MultithreadedBranch.rBranch(()->"Shortcut greatly simplifies your code");
```
**Callable interface** are still valid
```
     Object object = MultithreadedBranch.cBranch(() -> "shortcut can greatly simplify your code and increase your development efficiency");
```

#### Traverse the collection: 

> Method : **_ListExhibitor.see(List<E> list)_**
```
|----------------------------------------------------------|
| INDEX | VALUE                     | TYPE                 |
|----------------------------------------------------------|
| 0     | English                   | java.lang.String     |
| 1     | 123                       | java.lang.Integer    |
|----------------------------------------------------------|
```
>  Method: **_MapExhibitor.see(Map<K, V> map)_**
```
|------------------------------------------------------------------------------------------------------------------------------|
| KEY                       | VALUE                          | KEY TYPE                       | VALUE TYPE                     |
|------------------------------------------------------------------------------------------------------------------------------|
| java.lang.Object@5290501d | [I@51acc179                    | java.lang.Object               | [I                             |
| 111111111111111           | 11.1                           | java.lang.Long                 | java.lang.Double               |
|------------------------------------------------------------------------------------------------------------------------------|

```
#### Developer tools :
 Shortcut have collected tools that are commonly used during the development process
 like
+ Chinese ASCII code conversion for Chinese developer
+ HTML Converter
+ Etc


Log
-

Since shortcut's internal methods are all static, 
there's no way to specify where the log file should go, so make sure the log location is...<br/>

NAME|LOCATION
:---:|:---
**INFO**|your project's location/shortcut.log.info.txt
**ERR**|your project's location/shortcut.log.err.txt

**---------------- upgrading ---------------**

Annotation
-
Annotation|description
:---:|:---
@EnableShortcutAspect|Turn on aspect of shortcut 

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
    <version>0.0.8-SNAPSHOT</version>
</dependency>
```


Statement
-
I'm sure it will make your program **simpler** and **faster** to develop

**Copyright © [Decmoon](https://github.com/Decmoon)**<br/>
