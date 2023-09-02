# A few theoretical concepts in the form of questions.

***

1. Why is java a platform independent language?
=> Because of the Java virtual machine. Note that JVM itself is platform dependent. Once the compiler converts your code into platform independent bytecode (.class file), the JVM then runs that code according to the system where it's installed. 
Also note that JRE provides the environment, JVM specifies how the program is executed (i.e. the bytecode), and JDK is a toolkit consisting of JDK and JRE, along with other tools. 

2. Why is java not a pure object oriented language?
=> Pure OOLs are those that have no primitive datatypes. For example, SmallTalk, Eiffel, Ruby, Python, etc. Since java has primitive datatypes, but is object oriented, it is not a pure object oriented language.

3. Differentiate between heap and stack memory, and how java uses them?
=> Stack stores all data that java needs during compile time, and Heap stores all data that java needs during run time.  

4. What do you understand by instance variables and local variables?
=> Local variables are those that exist in a specific scope/block/method. Instance variables are object variables that are unique to an object, and are accessible throughout the entire class of that object.

5. What does an object contain?
=> An object contains a copy of all the properties (members, variables, methods, etc.) of the class. 

6. What are the default values given to local variables and instance variables in java?
=> Variables have no value and return an error if accessed. Instance variables have a default value based on their respective datatype. Note that characters and reference type variables have a default value of NULL. 

7. What is data encapsulation?
=> One of the four OOP principles that combine data (variables) and methods into a single unit. Often seen in get() and set() methods, and helps with modularity and security in the program.

8. Explain the JIT.
=> The Just In Time compiler saves space and processing time by only compiling methods having a call count beyond the threshold value of the compiler. The rest of the methods are only interpreted.

9. Give the difference between the method, 'equals()' and '==' operator.
=> equals() is a method belonging to the Object class, and compares the contents of 2 objects. '==' is a binary operator that compares the contents of 2 primitive datatype items. 

10. Explain constructor overloading.
=> Constructor overloading is creating multiple constructors with different parameter properties (count, datatypes, etc).

11. What is a copy constructor?
=> A constructor that takes another object of the same class as a parameter and replicates all its properties into the current instance is called a copy constructor.

12. Can main() be overloaded?
=> Yes, but its pointless because the compiler specifically calls the one with string args[] for starting compilation and execution. Also, you can call other main methods from this method.

13. Give the difference between method overloading and overriding?
=> Overloading refers to 2 methods having the same name and different parameter properties in the same class.
Overriding refers to 2 methods at different levels (parent and child) having the same name and parameter properties. Objects of the child class use the updated method, objects of the parent class use the parent's definition.

14. Explain the use of final keyword in variables, methods, and classes.
=> 

Notes:
* Python prioritizes the functions of the first class over the second class when it comes to clashing functions, using the method resolution operator.
* Operators in java - Arithmetic, Logical, Bitwise, Assignment, Conditional/Comparison/Relational, Increment/Decrement, Ternary(aka ?: operator)
* += is called addition assignment, coming under shorthand assignment operators. 
* Under Arithmetic:
    Addition (unary, binary), subtraction (unary binary), multiplication, division, modulus, power
* Under Relational Operators:
    Equality operators (<>, ==) , Inequality operator (!=).
* Under Logical Operators:
    AND (&&), OR(||), NOT(!).
* Under Bitwise Operators:
    Bitwise shift left(<<), bitwise shift right(>>), bitwise or(|), bitwise xor(^), bitwise and(&).

* Zero fill right shift (>>>):
    7 >> 2 = 1
    7 >>> 2 = 1 (Cuz zero fills.)
    -7 >> 2 = (1111) >> 2 = 3 (becuse first bit on left is sign bit) but this is old.
    Now, negatives are taken with 2's complement. So invert bits and add 1.
    
    TLDR:
    For positives, >> and >>> is same output.
    For negatives, >> is negative of positive's regular >>. But, >>> is a huge positive number.
