# Section 2 - Introduction
 In this section, I learned about Data types and Variables in detail.
 
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

* obs.: Unicode is supported in Java.

### Difference between String and character
* character: character it's a primitive type. Also, it's declared with single quote:
```java
char c = 'A';    
```

* String: String it's not a primitive type. Also, it's declared with double quotes:
```java
String s = "My name";
```
### When choose double instead of float?
Double must be chosen when we want more precision. The range is 6-7 digits to choose float and, more than that, it's recommended to choose double.
<br> Example:
```java
float f = 0.123456f; // 6 decimal digits

double d = 0.1234567890123f; // 13 decimal digits
```
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

In Java, there is the "Boxing Conversion" mechanism that converts the primitive data type to its respective wrapper.
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

We can use the above command in prompt to check the content of any class
```shell
javap [package_name].[class_name]
```
Example:
```shell
javap java.lang.Integer
```

## Variables
Some information about variables in Java.
<br>

### Rules for variables name
* Case-sensitive (name != Name)
* Variables name can contain alphabet, numbers, _ or $
* Can start with alphabet, _ or $
* Can't be a keyword like "class", "public", etc.
* Should not be a class name
* There isn't limit on name's length
* Follow Camel Cases: it's recommended to use "amountOfMoney" instead of amount_of_money


### Literals
In the following expression in Java:
```java
int i = 2 * x + 10 * y;
```
2 and 10 are literals. By default, in Java, values with decimal point is **double** and without decimal point is **integer**.

| Type    | Literals   |
|---------|------------|
| byte    | int        |
| short   | int        |
| int     | int        |
| long    | L or l     |
| float   | F or f     |
| double  | D or d     |
| char    | ' '        |
| boolean | true/false |