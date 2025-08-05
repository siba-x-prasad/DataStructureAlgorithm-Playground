# Coding Patterns
## [Coding Patterns](https://github.com/Chanda-Abdul/Several-Coding-Patterns-for-Solving-Data-Structures-and-Algorithms-Problems-during-Interviews)
## 1. Sliding Window
- Key Idea: Use two pointers to represent a window and slide it as conditions are met.
- **Common Problems**
  - Maximum sum of sub array of size K. 
  - Longest substring with distinct characters.
  - Minimum window substring.
### Programs ()
- https://medium.com/@kirti07arora/top-10-most-asked-sliding-window-interview-questions-cf8dfdb3fe48
- Longest Substring Without Repeating Characters
- Minimum Size Subarray Sum
- Minimum Window Substring
- Maximum Sum Subarray of Size K
- Longest Repeating Character Replacement
- Sliding Window Maximum
- Longest Subarray with Ones after Replacement
- Smallest Subarray with Sum Greater than S
- Fruits into Baskets
- Find All Anagrams in a String
## 2. Two Pointers
- https://medium.com/@YodgorbekKomilo/two-pointer-technique-in-java-58542f961ac8
- Key Idea: Use two pointers to traverse or compare values from different ends or the same start.
- Use two pointers to traverse or compare values from different ends or the same start.
- Used for sorted arrays, linked lists, or strings to optimize space or time complexity.
- **Common Problems:**
   - Finding Pairs with a Given Sum
   - Reversing a String
   - Removing duplicates in place.
   - Merging two sorted arrays.
   - Finding the Longest Substring Without Repeating Characters
   
## 3. Fast and Slow Pointers (Tortoise and Hare)
- https://dev.to/zzeroyzz/cracking-the-coding-interview-part-4-the-fast-and-slow-pointer-technique-47nb
- https://medium.com/@ksaquib/mastering-coding-interview-patterns-fast-and-slow-pointers-java-python-and-javascript-ad84b0233f45
- Key Idea:Move one pointer faster than the other and observe the intersection.
   - Used to detect cycles in linked lists or arrays.
   - **Common Problems:**
   - Detecting a cycle in a linked list.
   - Finding the Start of a Cycle in a Linked List
   - Finding the middle element of a linked list.
   - Finding the duplicate number in an array.
   - Happy Number
## 4. Merge Intervals
- Key Idea : Sort intervals by start time and merge them iteratively.
- Used for overlapping interval problems.
- Common Problems:
- Merge overlapping intervals. 
- Insert an interval. 
- Meeting rooms problem.
   
## 5. Cyclic Sort
- Key Idea: Place numbers at their correct indices using swaps.
- Used for array problems where numbers are in a specific range. 
- **Common Problems:**
   - Find the missing number.
   - Find all duplicates in an array.
   - First missing positive.
## 6. Two Heaps
- Key Idea: Use a max-heap for the smaller half and a min-heap for the larger half.
- Used for problems that require efficient min/max operations.
- **Common Problems:**
   - Find the median of a stream.
   - Sliding window median.
   
## 7. Binary Search
- Key Idea: Divide the search space into halves and converge.
- Used for searching in sorted arrays or decision problems.
- **Common Problems:**
   - Search in a rotated sorted array.
   - Find the peak element.
   - Allocate pages to minimize maximum pages.
## 8. Backtracking
- Key Idea: Build solutions incrementally and backtrack when a dead-end is reached.
- Used for problems involving permutations, combinations, and decision trees.
- **Common Problems:**
   - N-Queens problem.
   - Sudoku solver.
   - Subset sum problem.
## 9. Dynamic Programming (DP)
-  Key Idea: Break the problem into sub problems, solve them, and store results.
- Used for problems with overlapping sub problems and optimal substructure.
- **Common Problems:**
  - Longest common subsequence.
  - Knapsack problem.
  - Minimum path sum.
## 10. Greedy
- Key Idea: Choose the best option at each step without looking back.
- Used for optimization problems.
- **Common Problems:**
    - Activity selection problem.
    - Huffman encoding.
    - Fractional knapsack.
## 11. Graph Traversal (BFS/DFS)
- Tree Breadth-First Search
- Tree Depth First Search
- Key Idea: Traverse the graph using stacks (DFS) or queues (BFS).
- Used for graph or grid-related problems.
- **Common Problems:**
    - Shortest path in an unweighted graph (BFS).
    - Connected components in a graph (DFS).
    - Island counting in a grid.
## 12. Topological Sort
- Key Idea: Use DFS or BFS (Kahn’s algorithm) to order tasks.
- Used for problems involving dependencies.
- **Common Problems:**
    - Course schedule.
    - Task scheduling.
## 13. Union-Find (Disjoint Set)
- Key Idea: Use union and find operations with path compression.
- Used for problems involving connectivity in graphs.
- **Common Problems:**
    - Detect a cycle in an undirected graph.
    - Number of connected components.
    - Kruskal’s algorithm for MST.
## 14. Bit Manipulation
- Key Idea: Perform operations at the binary level for efficiency.
- Used for problems involving binary numbers or bitwise operations.
- **Common Problems:**
    - Single number (XOR).
    - Subsets generation using bits.
    - Reverse bits. 
## 15. Trie (Prefix Tree)
-  Key Idea: Use a tree structure to store strings by their prefixes.
- Used for problems involving prefix matching.
- **Common Problems:**
    - Word search.
    - Autocomplete system.
    - Longest word in dictionary.
## 16. Monotonic Stack/Queue
- Key Idea: Maintain a stack/queue with monotonically increasing or decreasing values.
- Used for range queries in arrays. 
- **Common Problems:**
    - Largest rectangle in a histogram.
    - Daily temperatures.
    - Sliding window maximum.
 
- 1. Sliding Window
- 2) Islands (Matrix Traversal)
- 3) Two Pointers
- 4) Fast & Slow Pointers
- 5) Merge Intervals
- 6) Cyclic Sort
- 7) In-place Reversal of a LinkedList
- 8) Tree Breadth-First Search
- 9) Tree Depth First Search
- 10) Two Heaps
- 11) Subsets
- 12) Modified Binary Search
- 13) Bitwise XOR
- 14) Top ‘K’ Elements
- 15) K-way Merge
- 16) Topological Sort
- 17) 0/1 Knapsack
- 18) Fibonacci Numbers
- 19) Palindromic Subsequence
- 20) Longest Common Substring