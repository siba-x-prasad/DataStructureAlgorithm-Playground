# Collections Framework
## Need of Collection
- When we store 2 or 3 values , we declare variables
```
    I.e int x = 10, int y= 20;
```
- To store infinite / lots of values , we can’t store as above. For this we have to declare Array
- We can represent huge number of values in array
- Readability Problem occur if we declare number value to number of variables.
- We can represent a huge number of values using arrays.

## Limitations of Array
- Array is fixed in size, that is we can’t increase the size once we declare an array
- Array stores Only Homogeneous data , If we want to add other data type, it will show compile time error, Eg Student[] studentArray = new Student[12]; 	studentArray[0] = new Student(); studentArray[1] = new Customer(); , here it will show Compile time error
Solution to the above problem : we can use an array of objects , then we can typecast a specific object.
- No Underlying Data Structure for Arrays. For every operation we have to write our own methods.
- To Overcome these above problems we go with Collections
- If you know the size of the data structure , go for Array is highly recommended else collection

## How Arraylist Store its Value
- Arraylist uses Dynamic arrays to store or retrieve data.
- Once Arraylist reaches up to its maximum size, and we want to add another element to the array,
- A bigger arraylist will be created i.e 1.5 of its original size and copy all the elements from old arraylist and add the new element to the new arraylist.
## Difference Between Array and Collection
- If we know the size, then arrays are recommended , if size is not known and it can increase later, then Collection is recommended.
- Arrays are fixed in size but Collections are growable in nature i.e based upon our requirement we can increase or decrease the size of collections
- With respect to Memory , Arrays are Not recommended, but Collections are recommended to use
- Performance wise Arrays are Recommended  but Collections are not Recommended
- Arrays can Hold only Homogeneous data but Collection can hold Homogeneous and heterogeneous data
- There is no Underlying data structure for Arrays , i.e basic ready made methods support is not Available
- Every collections class is implemented based on some standard data structure. Hence ready made methods support is available for every requirement
- Array can hold Primitive and Object types but Collection can hold only objects but not primitives

## Collection Framework :
- It defines Several classes and interfaces which can be used to represent a group of individual objects as Single Entity , the required classes and interfaces are called as Collection Framework.
- OR
- It Defines Several classes and interfaces which can be used as a group of objects as single Entity.

## 9 key interfaces of Collection Framework
- Collection Interface defines the most common methods which are applicable for any collection object.
- In General collection interface is considered as root interface of collection framework.
- NOTE :  There is no concrete class which implements collection interface directly.

## 1.Collection Interface :
- If we want to represent a group of individual objects as a single entity then we should go for collection. Collection is nothing but a group of Individual objects.
- Collection Interface defines the most common methods which are applicable for any collection Object.
- In General collection interface is considered as root interface of collection Framework
- NOTE : There is no concrete class which  implements Collection interface directly.
```
   METHODS OF COLLECTION
   Boolean add(Object object);
   Boolean addAll(Collection c); // c can be arraylist, set, stack
   Boolean remove(Object o); // remove the particular object from the collection
   Boolean retainAll(Collection c); // To remove all objects except those present in c
   Void clear();  // to remove all the objects from the collection
   Boolean contains(Object c); // if collection contain the object or not
   Boolean containsAll(Collection c);
   Boolean isEmpty();  // if collection object is empty
   Int size();
   Object[] toArray(); // c.toArray() // it will convert to array
   Iterator iterator(); // to retrieve one by one object in the collection
```

## Difference Between Collection and Collections
- Collection is an Interface and Collections is a class.
- If we want to represent a group of individual object as a single Entity we need Collection
- Collections is a Utility class present in java.util package to define several utility methods( like sorting, searching..) for collection Objects

## 2.List Interface :
- Collection(I Parent) ←--- List(I) child
- List is child interface of Collection
- If we want to represent a group of individual Objects as a single Entity where duplicates are allowed and insertion order preserved then we should go for List (Interface)
- We can differentiate duplicates by using Index.
- We can Preserve insertion order by using index.Hence index play very important role in List Interface.
## The Implementation Classes are Below
- ArrayList(Class) implements List(I)
- LinkedList(Class) implements List(I)
- Vector(Class ) implements List(I) and Stack is a child class of Vector (Legacy classes, i.e came from Java version 1)

## It is the child interface of Collection
- If we want to represent a group of individual objects as a single entity where duplicates are allowed and insertion order must be preserved then we should go for List
- We can differentiate duplicates by using index
- We can preserve insertion order by using index , hence index plays a very important role in list interface
- Null insertion is allowed
- It can support heterogeneous data type like below
```
    List<Object> listObject = new List();
```
- Now u can add or remove different data Type and also can differentiate while retrieving
## Methods of List Interface
```
   Void add(int index, Object o); // add object at specific index
   Boolean addAll(int index ,Collection c); // add all the collection elements in specific position
   Object get(int Index); // get object at specific position
   Object remove(int index); //to remove one item at specific position
   Object set(int index, Object newObject); // to replace the element present at specified index with provided Object and returns old object
   Int indexOf(Object obj);// returns index of first occurrence of obj
   Int lastIndexOf(Object o);//
   ListIterator listIterator = List.listIterator();
   Example
   ListIterator<String>  itr = al.listIterator();
   System.out.println("traversing elements in forward direction...");
   while(itr.hasNext()){
   System.out.println(itr.next());
   }
```
# Arraylist
- The underlying Data structure Resizable Array or Growable Array
- Duplicate are allowed
- Insertion Order is preserved
- Heterogeneous Objects are allowed [ Except TreeSet and TreeMap  everywhere heterogeneous Objects are allowed ].
- Null insertion is possible
- **Constructor**
```
   1.ArrayList al = new ArrayList();
   Creates an empty Arraylist object with default initial capacity 10.
   Once Arraylist reaches its max capacity a new Arraylist will be created with new Capacity = (currentCapacity * 3/2)+1
   2. ArrayList al = new Arraylist(int Capacity); // if we know the predefined size
   3. Arraylist al = new Arraylist(Collection c);
```
- **NOTE** :  Collection is used to hold data and to transfer across networks. In C++ , this is nothing but Container. Collection extends Serializable Interface or Collections Class implements Serializable Interface. When we transfer a collection class over network, and when we receive the collection object from Network, we can’t perform an operation on the object, there may be an error, then we will lose the data. So we just create an exact copy of the Object by using the Clone Method.
- The process of creating an exact copy of an Object is known as object Cloning .
- Every Collection class implements Serializable and Cloneable Interface
- **NOTE** : Arraylist and Vector implements RandomAccess Interface, it is a marker Interface
- Any random element , we can access at the same speed.
- Hence If our frequent operation is retrieval then Arraylist is the best Choice.
```
   Questions
   ArrayList al1 = new ArrayList();
   LinkedList al2 = new LinkedList();
   Al1 instanceof Serializable // true
   Al2 instanceof Cloneable // true
   Al1 instanceof randomAccess // true
   Al2 instanceof randomAccess // false
```
- **NOTE** : Every collection class implements Cloneable and Serializable Interface. Only vector and Arraylist implements RandomAccess Interface

## Do’s and Dont's in arraylist
- ArrayList is the best choice if out frequent operation is retrieval operation(Because Arraylist Implements RandomAccess interface)
- ArrayList is worst choice if our frequent operation is insertion or deletion in the middle(Because several shift operation are required)

- **Q : How to make Arraylist as Synchronized ?**
```
    Arraylist al = new Arraylist();
    List l = Collections.synchronizedList(al);
```
- **Q : How to make hashMap and HashSet as Synchronized ?**
```
    Public static Set synchronizedSet(Set set);
    Public static Set synchronizedSet(Map map);
```
- As we did above for Arraylist, we can do for above 2 also

## LINKED LIST
- Underlying data structure is Doubly Linked List
- Insertion Order preserved
- Duplicate element allowed
- Heterogeneous data can be stored
- Null Insertion is Possible
- It implements Serializable and Cloneable Interface but not RandomAccess Interface
- It is the best choice if our frequent operation is Insertion or Deletion in the middle
- It is worst Choice if our frequent operation is Retrieval Operation
- Extends AbstractList class and Implements a Doubly Linked List
- Maintain Insertion Order
- It is usually used for Stack(LIFO) and Queue(FIFO)

## Methods
- Usually we can use LinkedList to implement Stacks and Queue to provide Support For this requirement LinkedList class defines following Specific methods
```
    Void addFirst();
    Void addLast();
    Object getFirst();
    Object getlast();
    Object removeFirst();
    Object removelast();

    Constructors
    LinkedList ll  = new LinkedList();
    LinkedList ll = new LinkedList(Collection c);
```

## Differences Between ArrayList and LinkedList
- ArrayList is best Choice if our frequent operation is Retrieval , LinkedList is Worst For same
- LinkedList is best choice if frequent Operation is Insertion or Deletion in Middle
- Arraylist is worst choice, if frequent operation is Insertion or Deletion in middle
- LinkedList is the worst Choice if frequent operation is retrieval
- ArrayList Underlying data structure is Resizable or Growable Array
- LinkedList Underlying data structure is Double Linked List
- ArrayList Implements RandomAccess Interface
- LinkedList does not Implement RandomAccess Interface

## VECTOR
- The underlying Data Structure for the Vector is resizable Array or Growable Array.
- Duplicate Objects are allowed
- Insertion Order Preserved
- Null insertion is possible
- Heterogeneous Objects are allowed
- Vector class implements Serializable,Cloneable, RandomAccess Interface
- Most of the methods present in vector are synchronized. Hence Vector Object is Thread-Safe
- Best Choice if the Frequent operation is Retrieval

## Methods
- **For adding**
- add(Object o)  -> method in collection , can be used in Vector
- add(int index, Object o)  -> method of collection, can be used in vector
- addElement(Object o);   -> Its a method only for Vector
- **For Remove**
- remove(Object o);
- removeElement(Object o);(Vector method)
- remove(int index);
- removeElementAt(int index) (Vector method)
- clear();
- removeAllElements();(Vector method)
- **For retrieving**
```
    Object get(int index); // from collection
    Object elementAt(int index);  // from vector
    Object firstElement(); // from vector
    Object lastElement(); // from vector
```
## Other methods
```
    Int size(); // total how many objects are there at current time
    Int capacity(); // total how many objects we can accommodate
    Enumeration elements();
```
## Constructor
- 1.Vector v = new Vector();
- Create an empty vector object with default initial capacity 10
- Once vector reaches its max capacity a new vector object will be created with new capacity = 2 * current Capacity
- newCapacity = currentCapacity * 2;
- 2.Vector v = new Vector(int size); // if we declare by specific size, then performance will be increase
- Create an empty vector Object with specified initial Capacity
- 3.Vector v = new Vector(int initialCapacity, int incrementalCapacity);
- 4.Vector v = new Vector(Collection c);
- Creates an equivalent Vector Object for the given collection
## Difference Between Arraylist and Vector
- Arraylist is non synchronized but vector is synchronized,
- ArrayList is not thread safety but Vector is thread Safety
- Performance is relatively high as compared to vector, performance wise vector is not up to the mark
- ArrayList came in 1.2 version, that's why its not legacy class, but vector is a legacy class

- **Q. How to get synchronized version of ArrayList Object**
- Ans : By default ArrayList object is non synchronized in nature but we can get synchronized version of arrayList by using collection class SynchronizedList() method
```
    Public static List synchronizedList(List l1)

    List ls = Collections.synchronizedList(list)

    Public static Set synchronizedSet(set s1)

    Public static Map synchronizedMap(Map mp)
```

## STACK
- It is a child class of Vector
- It is specially Designed class for Last In First Out order(LIFO)
```
    Stack stack = new Stack();
    Methods
    1) Object push(Object obj);
    For inserting an object to the stack
    2) Object pop();
         -	To removes and returns top of the stack
    3) Object peak()
        -	To returns the top of the stack without removal of Object
    4) int search(Object o);
        If the Specified object is available it returns its offset from the top of the stack
        If the object is not available then it returns -1;
    5) Object pop();
        For inserting an Object to the stack
```

## CURSOR
- Enumeration
- Iterator
- ListIterator

## Enumeration(1.0)
- We use enumeration to retrieve objects one by one from Collection
- Enumeration e = v.elements()
- V is any vector
- Enumeration has 2 methods
```
    Public boolean hasElements()
    Public object nextElement()
    Vector v = new Vector()
    for(int i = 0;i<=10;i++=){
    v.addElement(i)
    }

    Enumeration e = v.elements();
    while(e.hasMoreElements()){
    Integer i = (Integer)e.nextElement();
    if(i%2==0){
        sop(i)
    }
    }
    // it will print ,  0 2 4 6 8 10
    sop(al) // output  0 1 2 3 4 5 6 7 8 9 10
```
## Limitation Of Enumeration
- Enumeration is application only for the legacy classes, Hence its not universal Cursor
- By using enumeration we can only perform read operation, not Write operation
- NOTE : To Overcome these problem, we can use iterator

## ITERATOR
- We can apply iterator concept to any collection object, hence its Universal
- By using iterator we can perform both read and remove operation
- Iterator itr = c.iterator(); c is any collection Object
- Methods Of Iterator
```
    Public boolean hasNext()
    Public Object next()
    Public void remove()
    Example
    ArrayList al = new ArrayList()
    for(int i = 0;i<=10;i++=){
    all.add(i)
    }

    Iterator itr = al.iterator();
    while(itr.hasNext()){
    Integer i = (Integer)e.next();
    if(i%2==0){
        sop(i)
    }
    Else{
        itr.remove()
    }
    }
    // it will print ,  0 2 4 6 8 10
    sop(al) // output  0 2 4 6 8 10
```
## Limitation of Iterator
- By using Enumeration and Iterator we can move forward direction, we can’t move backward direction, hence these are single direction cursors
- By using Iterator we can perform only read and remove operation, we can’t perform replace and add operation
- Note : To overcome above problem we can use ListIterator

## ListIterator
- It is Bidirectional cursor, It can move forward and backward direction
- By using ListIterator we can perform replacement and addition operation with read and remove operation
- Its child interface of Iterator
## Methods
```
    Public ListIterator listIterator()
    Public boolean hasNext()
    Public Object next()
    Public int nextIndex()
```
- These 3 methods used for forward direction
```
    Public boolean hasPrevious()
    Public Object hasPrevious()
    Public int previousIndex()
```
- These 3 methods used for Backward direction
```
    Public void remove()
    Public void set(object new)
    Public void add(object new)
```
- Example
```
    LinkedList ll = new LinkedList()
    ll.add(“Balakrishna”);
    ll.add(“Venki”);
    ll.add(“Chiru”);
    ll.add(“Naga”);

    ListIterator ltr = ll.listIterator()
    while(lit.hasNext()){
    String s = (String)ltr.next();
    if(s.equals(“Venki”)){
        ltr.remove();
    }
    Else if(s.equals(“Naga”)){
        ltr.add(“Chaitu”)
    }
    Else if(s.equals(“Chiru”)){
        ltr.set(“Charan”)
    }

    }

    print(ll) // output = Balakrishna,Charan,naga,chaitu
```
## Difference Between Enumeration Iterator ListIterator

**Property**	      **Enumeration**		    **Iterator**		 **ListIterator**

**Applicable For**      only LegacyClass    Any Collection Class          Only List class

**Movement**             only Forward            only Forward           Forward and BackWard
			          (Single Direction)      (Single Direction)       (Bidirectional)

**Accessibility**        Read Access             Read and Remove          Read, Remove & addition of new  										Object, replace

**How to get It**        elements() of         iterator() of Collection class  listIterator() of List(I)
                                                  Vector Class

**Methods**	            hasMoreElement()           hasNext()
		                nextElement()                  next()

**Is it Legacy**           Legacy                    not Legacy               Not legacy

## HASHTABLE(C)
- A Hash Table is an array of list. Each list is known as a bucket.The position of bucket is identified by calling the hashcode() method. A Hash Table contains values based on the key. It implements the Map interface and extends Dictionary class.
- It contains only unique elements.
- It can’t have any null key or value.
- It is synchronized.

## How to iterate HashTable
```
   Hashtable<String,String> hashtable = new Hashtable();
   hashtable.put("A", "Apple");
   hashtable.put("B", "Orange");
   hashtable.put("C", "Mango");
   hashtable.put("D", "Banana");
   hashtable.put("E", "Grapes");

   Set<String> keys = hashtable.keySet();
   //Obtaining iterator over set entries
   Iterator<String> itr = keys.iterator();

   while (itr.hasNext()) {
   // Getting Key
   str = itr.next();
          /* public V get(Object key): Returns the value to which
           * the specified key is mapped, or null if this map
           * contains no mapping for the key.
           */
   `System.out.println("Key: "+str+" & Value: "+hashtable.get(str));
    }
```
## Set
- add setCollection.png

- Collection(I Parent) ←--- Set(I) child
- HashSet(Class) implements Set(I)
- LinkedHashSet(Class is the child class of HashSet)
- It is the child interface of Collection
- If we want to represent a group of Individual Objects as a single Entity where Duplicate are not Allowed and insertion order is not Preserved then we should go for Set
- Set Interface does not contain any new methods, so we have to implement the Collection Interface methods

## Difference Between Set(I) and List(I)
- List allows Duplicate elements but Set dont allows Duplicate Elements.
- In List, insertion order preserved but in set Insertion order not preserved.

## HashSet(C)
- Underlying data structure is Hashtable.
- Duplicates are not allowed , if we try to insert a duplicate, we won’t get any compile time or runtime error , add() method simply returns False.
- Insertion order is not preserved and all objects will be inserted based on the HashCode of objects.
- Heterogeneous Objects are allowed.
- Null insertion is possible.
- Implements Serializable and Cloneable interface but not randomAccess Interface.
- HashSet is the best choice if our frequent operation is search Operation.

- **Constructors**
```
    HashSet h = new HashSet(); // with default initial capacity 16 and default fill ratio 0.75
    Fill ratio : after filling 75 % of the original size of HashSet, a new Object with bigger size will create
    HashSet h = new HashSet(int initialCapacity); //default fill ratio 0.75
    HashSet h = new HashSet(int initialCapacity,float loadFactor);
    HashSet h = new HashSet(Collection c);
```
- **NOTE** : The above Constructor’s also same for  LinkedHashSet, HashMap , IdentityHashMap, WeakHashMap, HashTable

## LinkedHashSet
- It is child class of HashSet
- Introduced in 1.4 version
- Same as HashSet except below Difference
- If duplicate element now allowed and insertion order must be preserved then we use this.
## Difference Between HashSet and LinkedHashSet
- HashSet underlying Data Structure is HashTable, but LinkedHashSet’s underlying Data Structure is HashTable and linked List
- HashSet not preserved Insertion Order but LinkedHashset preserved Insertion Order
- HashSet introduced in 1.2 but LinkedHashSet introduced in 1.4
- Example
```
    HashSet hs = new HashSet()
    hs.add(“B”)
    hs.add(“C”)
    hs.add(“D”)
    hs.add(“null”)
    hs.add(“10”)
    print(hs.add(“Z”)) // it will return false
    print(hs) //null D B C 10 z, it will print randomly, because insertion order is not preserved

    LinkedHashSet lhs = new HashSet()
    lhs .add(“B”)
    lhs .add(“C”)
    lhs .add(“D”)
    lhs .add(“null”)
    lhs .add(“10”)
    print(lhs .add(“Z”)) // it will return false
    print(lhs ) // B C D null 10 Z  it will print in the order in which order we inserted
```
- **NOTE:** LinkedHashSet is the best choice to develop Cache based application where duplicates are not allowed and insertion order must be preserved.

## 4.SORTED SET
- It is the child interface of set
- If we want to represent a group of individual According to some sorting order and duplicate are not allowed then we go for sortedset
- If we want to represent a group of individual object as a single Entity where duplicates are not are not allowed but all objects should be inserted according to some sorting order then we should go for sortedSet(I)

## SortedSet Specific Methods
```
    sortedSet = [100,101,103,104,107,110,115]
    Object first()  // 100
    Object last(); // 115
    SortedSet headset(Object obj); // less than the obj //headset(104) =  100,101,103
    SortedSet tailSet(Object obj); // Greater than and Equal to  the obj //tailSet(104) = 104,107,110,115
    SortedSet subSet(Object ob1,Object obj2j); subset(103,110)// 103,104,107
    comparator() -> it return comparator object that returns underlying sorting techniques
```
- **NOTE** : Default natural sorting order for numbers is Ascending order and for String is Alphabetical order
- We can implement these methods only on Sorted Set implemented classes, that is on TreeSet Object

## TreeSet
- The underlying data structure for treeSet is Balanced Tree
- Duplicate Objects are not allowed
- Insertion order not preserved but all objects will be inserted according to some sorting order
- Heterogeneous objects are not allowed, if we try to insert , it will create runtime exception saying classCastException(TreeMap is also not allowed Heterogeneous object)
- Null insertion is allowed but only once
- Constructors
```
    1.TreeSet t = new TreeSet();
    Creates an empty TreeSet object where elements will be inserted according to default insertion order
    2. TreeSet t = new TreeSet(Comparator c);
    Creates an empty TreeSet Object where elements will be inserted according to customized sorting order
    3. TreeSet t =  new TreeSet(SortedSet s);
    4. TreeSet t = new TreeSet(Collection c); // we can pass any collection object, it will convert that collection to TreeSet
```
- **NOTE** : If we want to add null to a non empty treeset, it will throw  NullPointerException. If we add a null to empty TreeSet , it will not throw any exception, because it is not require any comparison to insert Null.
- **NOTE** : if we try to add StringBuffer in treeset, it will create RuntimeException because, it does not have default sorting order
- **NOTE** : If we are depending on default natural sorting order then object should be Homogeneous and comparable otherwise we will get classCastException at run time. If the class implements Comparable interface, then that class is Comparable Object.
- **NOTE:** String class implements serializable and Comparable, but StringBuffer implements Serializable and CharSequence interface. So we can not add StringBuffer to TreeSet, it will show classCastException
- Example
```
    TreeSet t = new TreeSet();
    t.add(“a”)
    t.add(“A”)
    t.add(“Z”)
    t.add(“N”)
    t.add(“L”)
    t.add(new Integer(“12”))  // classCastException will be throw
    print(t) // output is [A L N Z a]  , ascii value of a = 97 and A = 65
```
- Null Acceptance
- If a treeSet contains some element , then we try to add null to the TreeSet, it will throw null pointer exception because it can’t compare null with some other element present in the TreeSet.
- We can add null to a empty TreeSet.After adding null to Empty TreeSet ,if we add one more element to the treeset it will throw NullPointerException
- Example
```
    TreeSet t = new TreeSet();
    t.add(new StringBuffer(“a”))
    t.add(new StringBuffer(“A”))
    t.add(new StringBuffer(“Z”))
    t.add(new StringBuffer(“N”))
    t.add(new StringBuffer(“L”))
```
- **Note** :  if we are depending on Default sorting order then  all the elements should be homogeneous and must implement comparable Interface. In the above example, though all elements are homogeneous but  it will throw classCastException because StringBuffer is not implements comparable Interface.

## COMPARABLE INTERFACE
- It present in java.lang package
- Comparable is meant for Default Natural sorting Order
- It present in java.lang package . it contains only one method compareTo();
- Public int compareTo(Object obj);
Eg
- obj1.compareTo(obj2)
- Returns -ve if obj1 has come before obj2
- Returns +ve if obj1 has come after obj2
- Returns 0 if obj1 and obj2 are equal
```
    sop(A.compareTo(null));  // it will show null pointer exception
    sop(“A”.compareTo(“Z”))  // it returns -ve , -25
    sop(“Z”.compareTo(“A”))  // it returns +ve, +25
    sop(“A”.compareTo(“A”))  // it returns 0
    sop(“A”.compareTo(null))  // it returns null Pointer Exception at runTime
```
## COMPARABLE INTERFACE IN TREESET
- If we depending on default natural sorting order internally JVM will call compareTo() method will inserting objects to the TreeSet . Hence the objects should be comparable
```
    TreeSet t = new TreeSet();
    t.add(“B”); // the first element will insert without any comparison
    t.add(“Z”);  // now “Z”.compareTo(“B”) ;  +ve
    t.add(“A”); // now “A”.compareTo(“B”) ;  -ve
    sop(t); // it will print [A,B,Z]
```
## COMPARATOR
- We can use comparator to define our own sorting(customized sorting)
- Comparator present inside java.util package
- It define 2 methods compare and equal
```
    Public int compare(Object obj1,Object obj2)
    obj1.compare(Object obj1,Object obj2)
```
- Returns -ve if obj1 has come before obj2
- Returns +ve if obj1 has come after obj2
- Returns 0 if obj1 and obj2 are equal
- +ve = After
- -ve = Before
- Public boolean equal()

- Q. Integer objects to TreeSet with Descending order
```
Class MyComparator extends Comparator{

Public int compare(Object obj1,Object obj2){

// one way
Integer i1 =  (Integer)obj1
Integer i2 =  (Integer)obj2

if(i1<i2){
Return +1;
}
Else if(i1>i2){
Return -1;
}
Else{
Return 0;
}

}

//Anotherway

Return -1( i1.comareTo(i2)
or
Return  i2.comareTo(i1)

}
```
- Q. write a program to sort names in descending alphabetical order
- Q. how to sort below treeSet
```
    TreeSet t = new TreeSet();
    t.add(new StringBuffer(“a”))
    t.add(new StringBuffer(“A”))
    t.add(new StringBuffer(“Z”))
    t.add(new StringBuffer(“N”))
    t.add(new StringBuffer(“L”))
```
- Hint : we can’t apply default sorting order to StringBuffer, so we have to provide our own customized comparator, because StringBuffer does not implements Comparable interface.

- Q. the sorting order is string length , if both have same length then alphabetical sorting order.
```
    TreeSet t = new TreeSet();
    t.add(“A”)
    t.add(new StringBuffer(“ABC”))
    t.add(new StringBuffer(“AA”))
    t.add(“XX”)
    t.add(“DEF”)

    OUTPUT = [A,AA,XX,ABC,DEF,ABCD]
```

```
    Class MyComparator extends Comparator{

    Public int compare(Object obj1,Object obj2){

    // one way
    String s1 = obj1.tostring(0
    String s2 =  (String)obj2 // we can do like  this also

    Int l1  = s1.length()
    Int l2  = s2.length()

    if(l1 < l2){
    Return -1;
    }
    Else if(l1>l2){
    Return +1;
    }
    Else{
    Return s1.compareTo(s2);
    }
    }
```
- NOTE : If we are depending on default natural sorting order then all object should be homogeneous and comparable otherwise we will get runtime exception saying ClassCastException
- But if we are defining our own sorting order using comparator then objects need not be homogeneous and comparable. We can insert heterogeneous and non comparable objects.

## Comparable Vs Comparator
Predefined comparable classes like String default sorting order already available. If we are not satisfied by that, then we can define our own sorting order By comparator object.
FOr predefined non comparable classes like StringBuffer, Default sorting order is not already available. We can define required sorting by implementing comparator interface.
For our own classes like Employee,Student,Customer the person who is writing our own class, he is responsible to define default natural sorting order by implementing comparable interface.
The person who is using our class is not satisfied by the default sorting order, then he can writing his own customized sorting by using comparator.

## Comparison Between Comparable and Comparator
- Comparable meant for default Sorting order and Comparator meant for Customized sorting order
- Comparable present is java.lang package and Comparator present in java.util package
- Comparable have one method compareTo(Object obj) and comparator have 2 methods compare(Object obj1 , Object 2 ) and equal()
- All wrapper classes and string class implements Comparable. Collator and RuleBasedCollator implements COmparator








