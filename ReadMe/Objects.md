# Class and Objects
## Methods inside object ?
- There are 11 methods in object
- **protected Object clone()** - Used to create and return a copy of this object.
- **boolean equals(Object obj)** - Used to indicate whether some other object is "equal to" this one.
- **protected void finalize()** - garbage collector calls this method on an object when it determines that there are no more references to the object.
- **Class<?> getClass()** - Used to get the runtime class of this Object.
- **int hashCode()** - Used to get a hash code value for the object.
- **void notify()** - Used to wake up a single thread that is waiting on this object's monitor.
- **void notifyAll()** - Used to wake up all threads that are waiting on this object's monitor.
- **String toString()** - Used to get a string representation of the object.
- **void wait()** - marks the current thread to wait until another thread invokes the notify() method or the notifyAll() method for this object.
- **void wait(long timeout)** - marks the current thread to wait until either another thread invokes the notify() method or the notifyAll() method for this object, or a specified amount of time has elapsed.
- **void wait(long timeout, int nanos)** - marks the current thread to wait until another thread invokes the notify() method or the notifyAll() method for this object, or some other thread interrupts the current thread, or a certain amount of real time has elapsed.

## equal
- In java equals() method is used to compare equality of two Objects. The equality can be compared in two ways:
- **Shallow comparison:** The default implementation of equals method is defined in Java.lang.Object class which simply checks if two Object references (say x and y) refer to the same Object. i.e. It checks if x == y. Since Object class has no data members that define its state, it is also known as shallow comparison.
- **Deep Comparison:** Suppose a class provides its own implementation of equals() method in order to compare the Objects of that class w.r.t state of the Objects. That means data members (i.e. fields) of Objects are to be compared with one another. Such Comparison based on data members is known as deep comparison.

- **NOTE: When we override the equals() method, it is necessary to override the hashCode() method. Overriding follow the convention for the hashCode() method that states, the equal object must have equal hash code.**

## hashCode
- In Java, hash code is a 32-bit signed integer value.
- It is a unique id provided by JVM to Java object.
- Each Java object is associated with the hash code.
- The hash code is managed by a hash-based data structure, such as HashTable, HashSet, etc.

## General Information of Hashcode
- When it is invoked more than once during the execution of an application, the hashCode() method will consistently return the same hash code (integer value). Note that the object should not be modified.
- If the two objects are equal according to the equals() method, then invoking the hashCode() method on these two objects must produce the same integer value.
- It is not necessary that if the two objects are unequal according to equals() method, then invoking the hashCode() method on these two objects may produce distinct integer value. It means that it can produce the same hash code for both objects.

## Difference Between == Operator and equals() Method
- In Java, the == operator compares that two references are identical or not. Whereas the equals() method compares two objects.
- Objects are equal when they have the same state (usually comparing variables). Objects are identical when they share the class identity.
- For example, the expression obj1==obj2 tests the identity, not equality. While the expression obj1.equals(obj2) compares equality.


