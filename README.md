SHORTCUT
-
**caption**：Open source toolkit

**Author**： Decmoon 

```logo
   ______ ___  __________ _______________________  __________
  / ____//  /_/  /  __  |/  ___/__  __/  ___ /  / /  __   __/
 (____ )/  ___  /  /_/  /  /    /  / / (___ /  /_/  / /  /    version 0.0.3
/_____//__/ /__/|______/__/    /__/  \____/ \______/ /__/       faster AND easier
```
Intro
-
Open source toolkit based on springboot with built-in static method,
You can use it to simplify code and improve development efficiency

Function
-
+ Nonempty judgment of parameter
+ Custom log
+ Complex set traversal
+ More sophisticated handling of Math classes
+ Multithreaded automatic branching
+ .....

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
You could even write it like this,**they're both correct ~**
```
    double random = RandomNumberGenerator.random(15.0, 5.0);
```
What about random Numbers that are negative?<br/>
Now let's **generate random Numbers from -5 to 10**
```
    double random = (Math.random() * - 5) +(Math.random()*10);
```
I bet you're tired of writing difficult sentences,
So let's see, what if you use **shortcut**
```
    double random = RandomNumberGenerator.random(-5,10);
```
I'm sure it will make your program **simpler** and **faster** to develop~~

#### Thread: 

If you wanted to create a **multithread** and run it, what would you write?
```
  new Thread(()->"The traditional threading approach makes the code look more complex").start();

```
Now , you have shortcut ,you just need....
```
    MultithreadedBranch.branch(()->"Shortcut greatly simplifies your code");
```

Do you find the effect very modest?<br/>
Don't worry ~ <br/>
Let's look at the **Callable** interface
```
 Callable<String> callable = () -> "Traditional callable requires a lot of code to write";
 FutureTask<String> futureTask = new FutureTask<>(callable);
 new Thread(futureTask).start();
     try {
        String string = futureTask.get();
     } catch (InterruptedException e) {
         e.printStackTrace();
     } catch (ExecutionException e) {
         e.printStackTrace();
     }
```
Okay ,very complicated <br/> 
So let's see the amount of code **shortcut** has
```
     Object object = branch(() -> "shortcut can greatly simplify your code and increase your development efficiency");
```

#### Traverse the collection: 

> Method : **_ListExhibitor.see(List<E> list)_**
```
|----------------------------------------------------------|
| INDEX | VALUE                     | TYPE                 |
|----------------------------------------------------------|
| 0     | English                   | java.lang.String     |
| 1     | 123                       | java.lang.Integer    |
| 2     | class java.lang.Object    | java.lang.Class      |
| 3     | java.lang.Object@488232a1 | java.lang.Object     |
|----------------------------------------------------------|

```
>  Method: **_MapExhibitor.see(Map<K, V> map)_**
```
|------------------------------------------------------------------------------------------------------------------------------|
| KEY                       | VALUE                          | KEY TYPE                       | VALUE TYPE                     |
|------------------------------------------------------------------------------------------------------------------------------|
| A                         | aaaa                           | java.lang.String               | java.lang.String               |
| 1                         | 11                             | java.lang.Integer              | java.lang.Integer              |
| java.lang.Object@5290501d | [I@51acc179                    | java.lang.Object               | [I                             |
| 111111111111111           | 11.1                           | java.lang.Long                 | java.lang.Double               |
|------------------------------------------------------------------------------------------------------------------------------|

```
---

This is only a small part of the built-in simplification of **shortcut**

You can find lots of surprises in **shortcut**<br/>
......

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
    <version>0.0.3-SNAPSHOT</version>
</dependency>
```

Statement
-

**Copyright © [Decmoon](https://github.com/Decmoon)**<br/>
**Shortcut** toolkit is readily available to developers<br/>
**Unauthorized reproduction is prohibited**