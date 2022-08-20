# Navigable Set
- It Extends SortedSet , SortedSet Extends Set
- Tree Set Implements TreeSet
- It behaves like a SortedSet with the exception that we have navigation methods available in addition to the sorting mechanisms of the SortedSet.
```
    NavigableSet<Integer> ns = new TreeSet<>();
    ns.add(0);
```
- NavigableSet<Integer> reverseNs = ns.descendingSet();
-
## Access Elements
- contains()
- first()
- last()
## Remove Elements
- remove()
- pollFirst()
- pollLast()

## Iterate 
- Using enhanced for loop
- 