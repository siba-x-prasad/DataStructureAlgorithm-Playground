# Concurrent  HashMap
- The ConcurrentHashMap class is introduced in JDK 1.5 belongs to java.util.concurrent package, 
- which implements ConcurrentMap as well as to Serializable interface also. 
- ConcurrentHashMap is an enhancement of HashMap as we know that while dealing with Threads in our application HashMap is not a good choice because performance-wise HashMap is not up to the mark.


## Why Concurrent Hashmap is faster/efficient than HashTable
- ConcurrentHashMap is introduced in Java 1.5. ConcurrentHashMap uses multiple buckets to store data. 
- This avoids read locks and greatly improves performance over a HashTable. Both are thread safe, 
- but there are obvious performance wins with ConcurrentHashMap.
- When you read from a ConcurrentHashMap using get(), there are no locks, contrary to the HashTable for which all operations are simply synchronized.
- HashTable was released in old versions of Java whereas ConcurrentHashMap is a java 1.5 thing