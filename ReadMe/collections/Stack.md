# Stack
- https://www.geeksforgeeks.org/collectionsExample.stack-class-in-java/
- It is a child class of Vector
- It is specially Designed class for Last In First Out order(LIFO)
- Object push(Object obj);
- For inserting an object to the collectionsExample.stack
- 2) Object pop();
-      -	To removes and returns top of the collectionsExample.stack
- 3) Object peak()
-     -	To returns the top of the collectionsExample.stack without removal of Object
- 4) int search(Object o);
- If the Specified object is available it returns its offset from the top of the collectionsExample.stack
- If the object is not available then it returns -1;
- 5) Object pop();
- For inserting an Object to the collectionsExample.stack
- Stack Extends Vector, Vector Implements List, List Extends Collection, Collection extends Iterable
## Create Stack
- Stack<String> collectionsExample.stack = new Stack<String>();

## Add Item 
- collectionsExample.stack.push("Hello");

## Retrieve element
- peek() -> By  using  this  method, it will return the top element of the collectionsExample.stack without removing any element
- pop() -> To pop an element from the collectionsExample.stack, we can use the pop() method. The element is popped from the top of the collectionsExample.stack and is removed from the same.

## Methods Inherited from collectionsExample.vector
- add(Object obj)	Appends the specified element to the end of this Vector.
- add(int index, Object obj)	Inserts the specified element at the specified position in this Vector.
- addAll(Collection c) Appends all of the elements in the specified Collection to the end of this Vector, in the order that they are returned by the specified Collection’s Iterator.
- addAll(int index, Collection c)	Inserts all the elements in the specified Collection into this Vector at the specified position.
- addElement(Object o)	Adds the specified component to the end of this collectionsExample.vector, increasing its size by one.
- capacity()	Returns the current capacity of this collectionsExample.vector.
- clear()	Removes all the elements from this Vector.
- clone()	Returns a clone of this collectionsExample.vector.
- contains(Object o)	Returns true if this collectionsExample.vector contains the specified element.
- containsAll(Collection c)	Returns true if this Vector contains all the elements in the specified Collection.
- copyInto(Object []array)	Copies the components of this collectionsExample.vector into the specified array.
- elementAt(int index)	Returns the component at the specified index.
- elements()	Returns an enumeration of the components of this collectionsExample.vector.
- ensureCapacity(int minCapacity)
- Increases the capacity of this collectionsExample.vector, if necessary, to ensure that it can hold at least the number of components specified by the minimum capacity argument.
- equals()	Compares the specified Object with this Vector for equality.
- firstElement()	Returns the first component (the item at index 0) of this collectionsExample.vector.
- get(int index)	Returns the element at the specified position in this Vector.
- hashCode()	Returns the hash code value for this Vector.
- indexOf(Object o) Returns the index of the first occurrence of the specified element in this collectionsExample.vector, or -1 if this collectionsExample.vector does not contain the element.
- indexOf(Object o, int index)	Returns the index of the first occurrence of the specified element in this collectionsExample.vector, searching forwards from the index, or returns -1 if the element is not found.
- insertElementAt(Object o, int index)	Inserts the specified object as a component in this collectionsExample.vector at the specified index.
- isEmpty()	Tests if this collectionsExample.vector has no components.
- iterator()	Returns an iterator over the elements in this list in proper sequence.
- lastElement()	Returns the last component of the collectionsExample.vector.
- lastIndexOf(Object o) Returns the index of the last occurrence of the specified element in this collectionsExample.vector, or -1 If this collectionsExample.vector does not contain the element.
- lastIndexOf(Object o, int index) Returns the index of the last occurrence of the specified element in this collectionsExample.vector, searching backward from the index, or returns -1 if the element is not found.
- listIterator()	Returns a list iterator over the elements in this list (in proper sequence). 
- listIterator(int index) Returns a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list.
- Removing Element
- remove(int index)	Removes the element at the specified position in this Vector.
- remove(Object o)	Removes the first occurrence of the specified element in this Vector If the Vector does not contain the element, it is unchanged.
- removeAll(Collection c)	Removes from this Vector all of its elements that are contained in the specified Collection.
- removeAllElements()	Removes all components from this collectionsExample.vector and sets its size to zero.
- removeElement(Object o)	Removes the first (lowest-indexed) occurrence of the argument from this collectionsExample.vector.
- removeElementAt(int index)	Deletes the component at the specified index.
- removeRange(int fromIndex, int toIndex)	Removes from this list all the elements whose index is between fromIndex, inclusive, and toIndex, exclusive.
- retainAll(Collection c)	Retains only the elements in this Vector that are contained in the specified Collection.
- set(int index, Object o)	Replaces the element at the specified position in this Vector with the specified element.
- setElementAt(Object o, int index)	Sets the component at the specified index of this collectionsExample.vector to be the specified object.
- setSize(int newSize)	Sets the size of this collectionsExample.vector.
- size()	Returns the number of components in this collectionsExample.vector.
- subList(int fromIndex, int toIndex)	Returns a view of the portion of this List between fromIndex, inclusive, and toIndex, exclusive.
- toArray()	Returns an array containing all of the elements in this Vector in the correct order.
- toArray(Object []array)
- Returns an array containing all of the elements in this Vector in the correct order; the runtime type of the returned array is that of the specified array.
- toString()	Returns a string representation of this Vector, containing the String representation of each element.
- trimToSize()	Trims the capacity of this collectionsExample.vector to be the collectionsExample.vector’s current size.


