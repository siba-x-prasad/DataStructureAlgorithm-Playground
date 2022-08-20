# String, String Pool, StringBuffer, StringBuilder
## String
- String is Immutable in java. 
- It can’t be changed. 
- It is Thread safe.
- That is String can be accessed from many threads at a time.
- Immutability offers a lot of benefit to the String class 
- e.g. his hashcode value can be cached which makes it a faster hashmap key and one of the reasons why String is a popular key in HashMap. 
- Because String is final it can be safely shared between multiple threads  without any extra synchronization.
- Strings are Read only and immutable.
- String is least faster than StringBuffer when we concatenate string operation
```
    String str = new String ("Stanford  ");
     str += "Lost!!";
```

## StringBuffer :
- StringBuffer is synchronized i.e. thread safe. 
- It means two threads can't call the methods of StringBuffer simultaneously.
- StringBuffer is less efficient than StringBuilder.
- StringBuffer is faster than string when we concatenate string operation
- Java StringBuffer class is used to created mutable (modifiable) string. 
- The StringBuffer class in java is same as String class except it is mutable i.e. it can be changed.
- StringBuffer(): creates an empty string buffer with the initial capacity of 16.
- StringBuffer(String str): creates a string buffer with the specified string.
- StringBuffer(int capacity): creates an empty string buffer with the specified capacity as length
```
    StringBuffer str = new StringBuffer ("Stanford ");
     str.append("Lost!!");
```
- This above statement is more Efficient  than the statement in String.
## StringBuilder
- StringBuilder is non-synchronized i.e. not thread safe. 
- It means two threads can call the methods of StringBuilder simultaneously.
- StringBuilder is more efficient than StringBuffer.

## Criteria to choose among String, StringBuffer and StringBuilder
- If the Object value is not going to change use String Class because a String object is immutable.
- If the Object value can change and will only be accessed from a single thread, use a StringBuilder because StringBuilder is not synchronized.
- In case the Object value can change, and will be modified by multiple threads, use a StringBuffer because StringBuffer is synchronized.

## DIFFERENCE BETWEEN STRING AND STRING BUFFER
- String class is immutable.
- StringBuffer class is mutable.

- String is slow and consumes more memory when you concat too many strings because every time it creates a new instance.
- StringBuffer is fast and consumes less memory when you concat strings.

- String class overrides the equals() method of Object class. So you can compare the contents of two strings by equals() method.
- StringBuffer class doesn't override the equals() method of Object class.

## DIFFERENCE BETWEEN String StringBuilder and StringBuffer
- There are many differences between StringBuffer and StringBuilder. A list of differences between StringBuffer and StringBuilder are given below:
- StringBuffer is synchronized i.e. thread safe. It means two threads can't call the methods of StringBuffer simultaneously.
- StringBuilder is non-synchronized i.e. not thread safe. It means two threads can call the methods of StringBuilder simultaneously.

- StringBuffer is less efficient than StringBuilder.
- StringBuilder is more efficient than StringBuffer.

## StringPool
- String Pool in java is a pool of Strings stored in Java Heap Memory. 
- We know that String is special class in java and we can create String object using new operator as well as providing values in double quotes.
- String Pool is possible only because String is immutable in Java and it’s implementation of String interning concept. 
- String pool is also example of Flyweight design pattern.
- String pool helps in saving a lot of space for Java Runtime, although it takes more time to create the String.
- When we use double quotes to create a String, it first looks for String with same value in the String pool, if found it just returns the reference else it creates a new String in the pool and then
returns the reference.
- However, using new operator, we force String class to create a new String object in heap space. We can use intern() method to put it into the pool or refer to other String object from string pool having same value.
```
    Example
    String s1 = "Cat";
            String s2 = "Cat";
            String s3 = new String("Cat");

            System.out.println("s1 == s2 :"+(s1==s2));
            System.out.println("s1 == s3 :"+(s1==s3));
    OUTPUT
    s1==s2 -> true
    s1==s3 -> false
    s1.equals(s2) -> true
    s1.equals(s3) -> true
```
## STRING
- string is a sequence of characters. But in java, string is an object that represents a sequence of characters. The java.lang.String class is used to create string object.
- **Q : How to create String object ?**
- There are two ways to create String object:
    - By string literal
    - By new keyword

- **BY STRING LITERAL**
```
String s1="Welcome";
    String s2="Welcome";//will not create new instance
    Both s1 and s2 will pointed to one Object that is Welcome
```
- **BY NEW KEYWORD**
```
    String s=new String("Welcome");//creates two objects and one reference variabl
```
- In such case, JVM will create a new string object in normal(non pool) heap memory and the literal "Welcome" will be placed in the string constant pool. The variable s will refer to the object in heap(non pool).
```
    String s1 = “Welcome”;
    String s2 = “Welcome”;
    String s3 = new String(“Welcome”);
    String s4 = new String( “Welcome”);

    S1 == s2   //  true because both the object point to same reference
    s1.equals(s2) // true , because both the contents are same i.e Welcome

    S1 == s3 // false, because when we create a new string by new keyword, it creates a new reference, so the address is not same
    s1.equals(s3) // true , because both content is same

    s3==s4 // false , because both have different reference address,

    s3.equals(s4) // true

    S1 = “ Welcome ”;
    S2 = “Welcome”

    s1.trim();
    s1.equals(s2); // false, because though string is immutable, the trim value is not stored in anywhere.

    S1 = s1.trim();
    s1.equals(s2) // true

    String s="Sachin";
     s.concat(" Tendulkar");//concat() method appends the string at the end
    System.out.println(s);//will print Sachin because strings are immutable objects
```

## String Comparison
- We can compare string in java on the basis of content and reference.
- It is used in authentication (by equals() method), sorting (by compareTo() method), reference matching (by == operator) etc.
- There are three ways to compare string in java:
- By equals() method
- By = = operator
- By compareTo() method
- CompareTo()
- The String compareTo() method compares values lexicographically and returns an integer value that describes if first string is less than, equal to or greater than second string.
Suppose s1 and s2 are two string variables. If:
```
    s1 == s2 :0
    s1 > s2   :positive value
    s1 < s2   :negative value
```
## String Interview Questions
1) How many objects will be created in the following code ?
- String s1 = "Siba";
- String s2 = "Siba";
- String s3 = new String("siba");
- From above only 2 objects will create. In the first 2 line, ths string will be stored in StringPool and  both the reference s1, s2 pointing to same reference. 
2) What is the difference between equals() method and == operator?
- Equals is used for content comparison but == is used for reference comparison.
3) Is String class final ?
- A String is a Final class & its immutable because it can't be changed but can be referred to another object.
4) How to reverse String in java?
- Multiple ways are there
- using for loop and using StringBuilder reverse method
5) How to check Palindrome String in java?
- Check reverse with the current
6) Write a java program to capitalize each word in string? (Siba Prasad -> SIBA PRASAD)
7) Write a java program to reverse each word in string? (siba  prasad -> abis dasarp)
8) Write a java program to tOGGLE each word in string? (siba prasad -> sIBA pRASAD)
9) Write a java program reverse tOGGLE each word in string?(siba prasad -> aBIS dASARP)
10) What is the difference between String and StringBuffer in java?
11) What is the difference between StringBuffer and StringBuilder in java?
12) What does intern() method in java?
13) How to convert String to int in java?
14) How to convert int to String in java?
15) How to convert String to Date in java?
16) How to Optimize Java String Creation ?
17) Java Program to check whether two Strings are anagram or not
18) Java program to find the percentage of uppercase, lowercase, digits and special characters in a String
19) How to convert String to Integer and Integer to String in Java
20) Java Program to find duplicate characters in a String
21) Java Program to prove that strings are immutable in java
22) Java Program to remove all white spaces from a String
23) Java Program to check whether one String is a rotation of another
24) Java Program to count the number of words in a String
25) Java Program to reverse a given String with preserving the position of space
26) How to swap two String variables without third variable
27) How to remove a particular character from a String
28) Why String is immutable ? 
- The string is Immutable in Java because String objects are cached in the String pool. 
- Since cached String literals are shared between multiple clients there is always a risk, where one client's action would affect all other clients.
29) Why HashMap key is recommended to  use as String ?
- Since the String class is immutable, you cannot modify the value of a String once it is created. 
- Therefore, it is recommended to use a String variable to hold keys in hash a map.
30) 



