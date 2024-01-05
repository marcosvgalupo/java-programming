# Section 2 - Introduction
 In this section, I learn about Data types and Variables in detail.
 
## Data Types

![Data Types in Java](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20191105111644/Data-types-in-Java.jpg)

<br><br>
About each type:

| Type    | Size(in bytes) | Range                     | Default |
|---------|----------------|---------------------------|---------|
| byte    | 1              | -128 to 127               | 0       |
| short   | 2              | -32768 to 32767           | 0       |
| int     | 4              | -2147483648 to 2147483647 | 0       |
| long    | 8              | -                         | 0       |
| float   | 4              | -                         | 0.0f    |
| double  | 8              | -                         | 0.0d    |
| char    | 2              | 0 to 655335               | \u0000  |
| boolean | ?              | true/false                | false   |

* char: in Java, support unicode instead of ASCII.

<br><br>
In Java, for each data type, there is a class available with methods.

| Type    | Class     |
|---------|-----------|
| byte    | Byte      |
| short   | Short     |
| int     | Integer   |
| long    | Long      |
| float   | Float     |
| double  | Double    |
| char    | Character |
| boolean | Boolean   |

In Java, there is the "Boxing Conversion" mechanism that converts the primitive data type to its respective wrapper
Instead of using this:
```java
Integer i = new Integer(10);
```

You can use the boxing conversion:
```java
Integer i = 10;
```

It's possible to use the "Unboxing Conversion" too, that converts the wrapper to its respective primitive type:
```java
int i = new Integer(10);
```
<br><br>
**USEFUL COMMAND**
<br>
We can use the above command in prompt to check the content of any class
```shell
javap [package_name].[class_name]
```
Example:
```shell
javap java.lang.Integer
```