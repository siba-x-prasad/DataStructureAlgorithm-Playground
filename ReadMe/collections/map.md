# Map
- The map interface is present in java.util package represents a mapping between a key and a value. 
- The Map interface is not a subtype of the Collection interface. 
- Therefore, it behaves a bit differently from the rest of the collection types. A map contains unique keys.
- Shorted Map(interface) extends Map Interface
- TreeMap(Class) implements Shorted Map
- HashMap(Class) implements map interface
- LinkedHashMap(Class) implements map interface

## Common methods of map interface
- clear()
- containsKey(Object b)
- containsValue(Object b)
- put(key, value)
- get(object o)
- equals
- hashCode
- isEmpty
- put
- putIfAbsent
- putAll
- remove
- values
- size

## HashMap(Class)
- HashMap is a part of Java’s collection since Java 1.2. 
- It provides the basic implementation of the Map interface of Java. 
- It stores the data in (Key, Value) pairs. 
- To access a value one must know its key. 
- This class uses a technique called Hashing. 
- Hashing is a technique of converting a large String to a small String that represents the same String. 
- A shorter value helps in indexing and faster searches.
- Let us see how to create HashMap
```
    // Creating an empty HashMap
        Map<String, Integer> hm
            = new HashMap<String, Integer>();
  
        // Inserting pairs in above Map
        // using put() method
        hm.put("a", new Integer(100));
        hm.put("b", new Integer(200));
        hm.put("c", new Integer(300));
        hm.put("d", new Integer(400));
  
        // Traversing through Map using for-each loop
        for (Map.Entry<String, Integer> me :
             hm.entrySet()) {
  
            // Printing keys
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }

OUTPUT -> The output can be random
vaibhav 20
vishal 10
sachin 30        
```
## LinkedHashSet
- LinkedHashMap is just like HashMap with an additional feature of maintaining an order of elements inserted into it. 
- HashMap provided the advantage of quick insertion, search, and deletion.
- But it never maintained the track and order of insertion which the LinkedHashMap provides where the elements can be accessed in their insertion order.
```
// Creating an empty LinkedHashMap
        Map<String, Integer> map = new LinkedHashMap<>();
  
        // Inserting pair entries in above Map
        // using put() method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
  
        // Iterating over Map
        for (Map.Entry<String, Integer> e : map.entrySet())
  
            // Printing key-value pairs
            System.out.println(e.getKey() + " "
                               + e.getValue());
    }
    
OUTPUT (It will print the order in which the data inserted)
vishal 10
sachin 30
vaibhav 20    
```
##  TreeMap
- The TreeMap in Java is used to implement the Map interface and NavigableMap along with the Abstract Class. 
- The map is sorted according to the natural ordering of its keys, 
- or by a Comparator provided at map creation time, depending on which constructor is used. 
- This proves to be an efficient way of sorting and storing the key-value pairs. 
- The storing order maintained by the treemap must be consistent with equals just like any other sorted map, irrespective of the explicit comparators.
- Let us see how to create tree map
```
    Map<String, Integer> map = new TreeMap<>();
            // Inserting custom elements in the Map
            // using put() method
            map.put("vishal", 10);
            map.put("sachin", 30);
            map.put("vaibhav", 20);
      
            // Iterating over Map using for each loop
            for (Map.Entry<String, Integer> e : map.entrySet())
      
                // Printing key-value pairs
                System.out.println(e.getKey() + " "
                                   + e.getValue());
        }
        
    OUTPUT
    sachin 30
    vaibhav 20
    vishal 10    
```

## Navigable Map
- The NavigableMap interface is a member of the Java Collection Framework. 
- It belongs to java.util package
- It is an extension of SortedMap which provides convenient navigation methods like lowerKey, floorKey, ceilingKey and higherKey, and along with this popular navigation method. 
- It also provides ways to create a Sub Map from existing Map in Java e.g. headMap whose keys are less than the specified key, tailMap whose keys are greater than the specified key, and a subMap which strictly contains keys which fall between toKey and fromKey.
- An example class that implements NavigableMap is TreeMap.
```
// Instantiate an object
        // Since NavigableMap
        // is an interface so we
        // use TreeMap
        NavigableMap<String, Integer> nm
            = new TreeMap<String, Integer>();
 
        // Add elements using put() method
        nm.put("C", 888);
        nm.put("Y", 999);
        nm.put("A", 444);
        nm.put("T", 555);
        nm.put("B", 666);
        nm.put("A", 555);
 
        // Print the contents on the console
        System.out.println("Mappings of NavigableMap : "
                           + nm);
 
        System.out.printf("Descending Set  : %s%n",
                          nm.descendingKeySet());
        System.out.printf("Floor Entry  : %s%n",
                          nm.floorEntry("L"));
        System.out.printf("First Entry  : %s%n",
                          nm.firstEntry());
        System.out.printf("Last Key : %s%n", nm.lastKey());
        System.out.printf("First Key : %s%n",
                          nm.firstKey());
        System.out.printf("Original Map : %s%n", nm);
        System.out.printf("Reverse Map : %s%n",
                          nm.descendingMap());
    }
    
OUTPUT
Mappings of NavigableMap : {A=555, B=666, C=888, T=555, Y=999}
Descending Set  : [Y, T, C, B, A]
Floor Entry  : C=888
First Entry  : A=555
Last Key : Y
First Key : A
Original Map : {A=555, B=666, C=888, T=555, Y=999}
Reverse Map : {Y=999, T=555, C=888, B=666, A=555}    
```


