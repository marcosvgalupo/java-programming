# Section 3 - Introduction
In this section, I learned about Features and Architecture in Java.

## Compiler vs Interpreter
Interpreter and compiler are used to translate our programs into machine code, ando also to get them executed.

**Compiler**: Read all line codes and, if there is no error, generate the machine code after it ends. (Generate a separated file)

**Interpreter**: Read line by line, convert each line and execute it. (Don't generate a separated file)
Example:
```javascript
// js code
let a = 10;
let b = 5;
console.print(a+b); // * console.log()
```
Even there is an error in line 3, the previous lines will be converted into machine code and executed.

- Compiler is faster than interpreter.

Compiler Based Languages: C, C++
Interpreter Based Languages: JavaScript (interpreted by browser)

**OBS**: Java is a hybrid language.

<br><br>
## Java Architecture
First.java ---> (compile javac) ---> First.class ---> (java) ---> JVM ---> OS
source code ---> bytecode ---> JVM ---> OS 

Steps for executing and Java Program
- The source code is compiled to generate byte code. Bytecode can't be executed, but is an error free program. 
- The bytecode will be loaded and verified by JVM. 
- After verification, JVM can execute the bytecode using the Interpreter or the JIT Compiler (Just In Time).
- Finally, after being interpreted or compiled, the bytecode can be executed.

<br><br>
## How Java is Platform Independent
A bytecode don't interact directly to Operational System(OS). The bytecode is understood by JVM and JVM is responsible to comunicate to OS. So, in other words, if JVM is present in the OS (windows, macOS, linux, etc), the Java program can be executed. The JVM that comunicate to each OS is different.
