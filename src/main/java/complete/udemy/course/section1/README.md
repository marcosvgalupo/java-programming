# Lecture introduction
In this lecture, I learned how Java works (JDK, JRE, JVM) and what a Java program looks like. Also, I learned how to read input in Java using the Scanner class methods.

## How Java works??


- Java Development Toolkit(JDK): Development Tools(compiling, debugging, etc) + JRE
- Java Runtime Environment(JRE): Java Class Library + JVM
- JVM: execute our java programs

Example: how to execute a file called test.java??
test.java will be compiled by javac(java compiler) present in JDK and converted to test.class file. Now the JRE (internally using JVM) is able to execute the file (java [filename]).

## Skeleton of Java Program


Example:
```java
import java.lang.*;

class First{
    
    public static void main(String args[]){
        System.out.println("Hello World");
    }
    
}
```
* Why must main method be public and static??
    - **public:** if you want to anything from the class to be accessible outside, it must be public. that's why main must be public, to be     visible for JVM.

    - **static:** if you want to use anything from the class without creating an object, then that should be declarated as static.

So, in other words, JVM must be able to call the **main** method, which is present inside the class, without creating an object that it has to call.


## Reading data from keyboard

To read, we will use the class **Scanner** that is available in **util** package.
This class was provided from version 5+.

Example for adding two numbers:
```java
import java.lang.*;
import java.util.*;

public class KeyboardRead{

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter two numbers: ");
        a = s.nextInt();
        b = s.nextInt();
        c = a + b;
        System.out.println("Sum: " + c);
    }
}
```

Some of the Scanner class methods:
* **nextInt**, **nextFloat**(... the same for other types): these methods read their respective types
* **next**: read a String (only one word)
* **nextLine**: read a sentence (multiple words)
* **hasNextInt**, **hasNextFloat**(... the same for other types): confirm if the next value is the expected type.