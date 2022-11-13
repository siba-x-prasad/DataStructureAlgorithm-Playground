# Array
- An array is a collection of similar types of data.
- For example, if we want to store the names of 10 people then we can create an array of the string type that can store 100 names.
- String[] array = new String[10];
- Here, the above array cannot store more than 100 names. The number of values in a Java array is always fixed.

| Index | 0   | 1   | 2   | 3   | 4   | 5   | 6   | 7   | 8   | 9   |
|-------|-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|
| a     | b   | c   | d   | e   | f   | g   | h   | i   | j   | k   |

- Array store data in index based


## How to declare array
- datatype[] data = new datatype[size of array];
- double[] data = new double[10];
- Similarly, we can define array in other datatype as well

## Limitations of Array
- Arrays are Strongly Typed.
- Array does not have add() or remove() methods.
- We need to mention the size of the array. Fixed length.
- So there is a chance of memory wastage.
- To delete an element in an array we need to traverse through out the array so this will reduce performance.
- Array is fixed in size, that is we can’t increase the size once we declare an array.
- Array stores Only Homogeneous data , If we want to add other data type, it will show compile time error,
```
	Student[] studentArray = new Student[12]; 	
	studentArray[0] = new Student(); 
	studentArray[1] = new Customer();  
```
- here it will show Compile time error
- Solution to the above problem : we can use an array of objects , then we can typecast a specific object.
- No Underlying Data Structure for Arrays.
- For every operation we have to write our own methods.
- To Overcome these above problems we go with Collections
- If you know the size of the data structure , go for Array is highly recommended else collection

## Advantages
- It is the base of the data structure.


## Programs
1) How to find the missing number in integer array of 1 to 100 ? (Solved)
2) Combine two Arrays.(Solved)
3) How to find duplicate number on Integer array in Java ?(Solved)
4) How to check if array contains a number in Java ?(Solved)
5) How to find largest and smallest number in unsorted array ?(Solved)
6) How to find all pairs on integer array whose sum is equal to given number ?(Solved)
7) How to find repeated numbers in an array if it contains multiple duplicates ?(Solved)
8) Write a program to remove duplicates from array in Java ?(Solved)
9) Write a program to find intersection of two sorted arrays in Java? (Not Solved)
10) There is an array with every element repeated twice except one. Find that element? (Solved)
11) How to find kth the smallest element in unsorted array? (Solved)
12) How to find kth the largest element in unsorted array? (Solved)
13) How to find common elements in three sorted array? (Solved)
14) Find the missing number in an array ? (Solved)
15) How to find duplicate number on Integer array in Java? (Solved)
16) How to check if array contains a number in Java? (Solved)
17) How to find largest and smallest number in unsorted array? (Solved)
18) How to find all pairs on integer array whose sum is equal to given number ? (Solved)
19) How to find repeated numbers in an array if it contains multiple duplicates ? (Solved)
20) Print Two sum Combination in Array ?
21) Print Three Sum Combination Array ?
22) Write a program to cyclically rotate an array by one 
23) Find the missing integer 
24) Count Pairs with given sum 
25) Find duplicates in an array
26) Sort an Array using the Quicksort algorithm
27) Find the first non-repeating element in a given array of integers 
28) Sub arrays with equal 1s and 0s 
29) Rearrange the array in alternating positive and negative items  Find if there is any sub array with a sum equal to zero 
30) Find the Largest sum contiguous Sub array
31) Find the factorial of a large number
32) Find Maximum Product Sub array
33) Find the longest consecutive subsequence
34) Find the minimum element in a rotated and sorted array
35) Max sum in the configuration
36) Minimum Platforms
37) Minimize the maximum difference between the heights
38) Minimum number of jumps to reach the end 
39) Stock Span problem
40) Find a triplet that sums to a given value
41) Smallest positive missing number
42) Find the row with a maximum number of 1’s
43) Print the matrix in a Spiral manner
44) Find whether an array is a subset of another array
45) Implement two Stacks in an array
46) Majority Element
47) Wave Array
48) rapping Rainwater  Maximum Index
49) Max sum path in two arrays
50) Find Missing And Repeating
51) Stock buy and sell Problem
52) Pair with the given sum in a sorted array  Chocolate Distribution Problem
53) Partition Equal Subset Sum
54) Smallest Positive integer that can’t be represented as a sum
55) Coin Change Problem
56) Longest Alternating subsequence

## Solutions of above programs
- 


## Leet Code Problems
