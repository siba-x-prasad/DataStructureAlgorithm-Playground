# Time and Space Complexity

- https://www.geeksforgeeks.org/understanding-time-complexity-simple-examples/
- [Big O Cheatsheet](https://www.bigocheatsheet.com)
- [Link 1](https://medium.com/@pnandhiniofficial/time-and-space-complexity-a-beginners-guide-88d617d29d01)
- [Link 2](https://medium.com/@pnandhiniofficial/time-and-space-complexity-a-beginners-guide-88d617d29d01)

## Time Complexity

- It's not total required to execute a algorithm
- It's a behaviour. How the input impact the number of computations of the algorithm.
- Imagine a classroom of 100 students in which you gave your pen to one person.
- Now, you want that pen. Here are some ways to find the pen and what the O order is.

## O(1) constant time complexity

## O(log N) – logarithmic time complexity.

- O(log N) basically means time goes up linearly while the n goes up exponentially. So if it takes 1
  second to compute 10 elements, it will take 2 seconds to compute 100 elements, 3 seconds to
  compute 1000 elements, and so on.
- The time required to run the algorithm increases logarithmically with the size of the input.
- Now I divide the class into two groups, then ask:
- Is it on the left side, or the right side of the classroom ?
- Then I take that group and divide it into two and ask again, and so on.
- Repeat the process till you are left with one student who has your pen.
- This is what you mean by O(log n).
- I might need to do the O(n2) search if only one student knows on which student the pen is hidden.
- I’d use the O(n) if one student had the pen, and only they knew it.
- I’d use the O(log n) search if all the students knew, but would only tell me if I guessed the
  right side.
- **NOTE :** We are interested in rate of growth of time with respect to the inputs taken during the
  program execution .
- **NOTE:** In Binary Search, time complexity is O(log n)
- Binary Search Tree, searching an element is also O(log n)
- **EXAMPLES**
- **Binary search:** This is a search algorithm that works by repeatedly dividing a sorted array in
  half until the target element is found, or until it is clear that the target element is not in the
  array. The time complexity of binary search is O(log N).
- **Balanced binary search tree operations:** Insertion, deletion, and search operations in balanced
  binary search trees, such as AVL trees and Red-Black trees, all have a time complexity of O(log
  N).
- https://tutorials.eu/olog-n-algorithm-example/

## O(n) linear time complexity

- The time required to run the algorithm increases linearly with the size of the input.
- Going and asking each student individually is O(N).
- ```
  for (int i = 0; i < n, i++) {
       print(i)
  }
  ```

## O(N log N) – linearithmic time complexity.

- The time required to run the algorithm increases linearly with the size of the input, multiplied
  by the logarithm of the input size.

## O(N^2) – quadratic time complexity

- You go and ask the first person of the class, if he has the pen.
- Also, you ask this person about other 99 people in the classroom if they have that pen and so on.
- This is what we call O(n2).
- ```
  for (int i = 0; i < n, i++) {
      for (int i = 0; i < n, i++) {
           print(i+" "+j) 
      }
  }
  ```

## O(N^3) – cubic time complexity.

- The time required to run the algorithm increases cubically with the size of the input.

## O(2^N) – exponential time complexity.

- The time required to run the algorithm increases exponentially with the size of the input.

## O(N!) – factorial time complexity.

- The time required to run the algorithm increases factorially with the size of the input.

## Let us understand using Real time example

```
    class MyClass{
        public static void main(String...args){
            System.out.println("Hello WOrld");
        }
    }
```

- In above code “Hello World!!!” print only once on a screen.
- So, time complexity is constant: O(1) i.e.
- every time constant amount of time require to execute code,
- no matter which operating system or which machine configurations you are using.

```
    int i, n = 8;
    for (i = 1; i <= n; i++) {
        printf("Hello Word !!!\n");
    } 
```

- In above code “Hello World!!!” will print N times. So, time complexity of above code is O(N).

```
    int i, n = 10, sum = 0;
    for (i = 1; i <= n; i++) {
        sum = sum + i
    }
```

- In the above code, the complexity is O(N)

```
 for(int i = 0; i < rows; i++){
   sumRow = 0;
     for(int j = 0; j < cols; j++){
        sumRow = sumRow + a[i][j];
     }
   System.out.println("Sum of " + (i+1) +" row: " + sumRow);
 }
```

- Above block of code will print the sum of matrix, The complexity of this is O(N2)

- **O(1)** (in the worst case): Given the page that a business's name is on and the business name,
  find the phone number.
- **O(1)** (in the average case): Given the page that a person's name is on and their name, find the
  phone number.
- **O(1)** means that, no matter how much data, it will execute in constant time.
- Example of O(1) time complexity

```
    int n = 1000;
    System.out.println("Hey - your input is: " + n);
    System.out.println("Hmm.. I'm doing more stuff with: " + n);
    System.out.println("And more: " + n);
```

- The above example is also constant time.
- Even if it takes 3 times as long to run, it doesn't depend on the size of the input n.
- We denote constant time algorithms as follows: O(1).
- Note that O(2), O(3) or even O(1000) would mean the same thing.
- **O(log n):** Given a person's name, find the phone number by picking a random point about halfway
  through the part of the book you haven't searched yet, then checking to see whether the person's
  name is at that point. Then repeat the process about halfway through the part of the book where
  the person's name lies. (This is a binary search for a person's name.)
- Constant time algorithms are (asymptotically) the quickest. Logarithmic time is the next quickest.
- One common example of a logarithmic time algorithm is the binary search algorithm.
-

```
    for (int i = 1; i <= n; i = i * 2){
        System.out.println("Hey - I'm busy looking at: " + i);
    }
    OUTPUT
    Hey - I'm busy looking at: 1
    Hey - I'm busy looking at: 2
    Hey - I'm busy looking at: 4
```

- The above will run log(8) = 3 times.
- **O(n):** Find all people whose phone numbers contain the digit "5".
- **O(n):** Given a phone number, find the person or business with that number.

```
    for (int i = 0; i < n; i++) {
        System.out.println("Hey - I'm busy looking at: " + i);
    }
```

## N Log N Time Algorithms – O(n log n)

- **O(n log n):** There was a mix-up at the printer's office.
- and our phone book had all its pages inserted in a random order.
- Fix the ordering so that it's correct by looking at the first name on each page and then putting
  that page in the appropriate spot in a new, empty phone book.
- **O(n log n):** We want to personalize the phone book, so we're going to find each person or
  business's name in their designated copy, then circle their name in the book and write a short
  thank-you note for their patronage.

```
    for (int i = 1; i <= n; i++){
        for(int j = 1; j < n; j = j * 2) {
            System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
        }
    }
```

## O(n! - n Factorial

## Polynomial Time Algorithms – O(np)

- **O(n2):** A mistake occurred at the office, and every entry in each of the phone books has an
  extra "0" at the end of the phone number.
- Take some white-out and remove each zero.

```
    for (int i = 1; i <= n; i++) {
        for(int j = 1; j <= n; j++) {
            System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
        }
    }
```

## Factorial Time Algorithms – O(n!)

- **O(n · n!):** We're ready to load the phonebooks onto the shipping dock.
- Unfortunately, the robot that was supposed to load the books has gone haywire: it's putting the
  books onto the truck in a random order! Even worse, it loads all the books onto the truck, then
  checks to see if they're in the right order, and if not, it unloads them and starts over. (This is
  the dreaded bogo sort.)

## Exponential Time Algorithms – O(kn)

- Worst time complexity among all
- We use Dynamic Programming to reduce this time complexity
- **O(nn):**
- You fix the robot so that it's loading things correctly.
- The next day, one of your co-workers plays a prank on you and wires the loading dock robot to the
  automated printing systems.
- Every time the robot goes to load an original book, the factory printer makes a duplicate run of
  all the phonebooks! Fortunately, the robot's bug-detection systems are sophisticated enough that
  the robot doesn't try printing even more copies when it encounters a duplicate book for loading,
  but it still has to load every original and duplicate book that's been printed.

## Graph

![Time Complexity Graph](https://github.com/siba-x-prasad/DSA_Collections/blob/master/ReadMe/Images/timeComplaxityGraph.png)

## How to find the time complexity of a program

- FInd the constraint of the program
- In leet code you will find at the bottom of the program.
- The apply these
  ![Time Complexity Graph](https://github.com/siba-x-prasad/DSA_Collections/blob/master/ReadMe/Images/findTimeComplexity.png)

# Time Complexity from AI

## Part 1: The "Why" - What is Complexity Analysis?

- Imagine you have two different recipes for baking a cake.
- Recipe A takes 30 minutes, no matter if you're baking for 2 people or 20 people.
- Recipe B takes 15 minutes for 2 people, but an extra 5 minutes for every additional person.
- Which recipe is "faster"? It depends on the number of people (n). For a small group, Recipe B is
  faster. For a large party, Recipe A is much better.
- Complexity analysis is the "recipe analysis" for our code. It's not about measuring the exact
  runtime in seconds (which depends on the computer's speed), but about understanding how the number
  of operations (time) or amount of memory used (space) grows as the size of the input (n) grows.
- We use a special language for this called Big O Notation.

## Part 2: The Core Concepts - Big O, Big Omega, Big Theta

- While you'll mostly hear about Big O, it's good to know its siblings.

## Notation	Name	Meaning	Analogy: Driving to the store

| NOTATION      | NAME        | MEANING                                                                | Analogy: Driving to the store                                             |
|---------------|-------------|------------------------------------------------------------------------|---------------------------------------------------------------------------|
| O (Big O)     | Upper Bound | Your algorithm will perform at worst this well. It won't be slower.    | "The drive will take at most 30 minutes." (Worst-case traffic)            |
| Ω (Big Omega) | Lower Bound | Your algorithm will perform at least this well. It won't be faster.    | "The drive will take at least 10 minutes." (No traffic, all green lights) |
| Θ (Big Theta) | Tight Bound | Your algorithm's performance is tightly bound between upper and lower. | "The drive takes around 20 minutes." (Typical traffic)                    |

## Part 3: The "How" - A Step-by-Step Guide to Calculating Time Complexity

- This is the practical part. Follow these steps for any function or algorithm.

## Step 1: Identify the "Input Size" (n)

- What part of the input dictates the workload?
- For an array or list, n is the number of elements.
- For a string, n is the string's length.
- For a number, n might be the number itself or the number of bits it takes to represent it.
- For a recursive function, n is often the value passed into the function.

## Step 2: Count the Number of Basic Operations

- Go line by line through your code and count the operations. A "basic operation" is anything that
  takes a constant amount of time.

```
  Assignments (=)
  Arithmetic (+, -, *, /)
  Comparisons (==, >, <)
  Accessing an array element (myArray[i])
  A return statement
```

## Key Structures to Analyze:

- Sequence of statements: Just add their complexities.

```
int a = 1; // 1 operation
int b = 2; // 1 operation
int sum = a + b; // 1 operation
// Total = 1 + 1 + 1 = 3 operations. This is constant time.
```

- Loops (for, while): Multiply the number of operations inside the loop by the number of times the
  loop runs.

```
// n is the size of the array
public void printArray(int[] array) {
  for (int i = 0; i < array.length; i++) { // Loop runs n times
    System.out.println(array[i]); // 1 operation inside
  }
}
```

- // Total = n * 1 = n operations.

- Nested Loops: Multiply the complexities of the inner and outer loops.

```
// n is the number of rows/cols
public void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) { // Outer loop runs n times
      for (int j = 0; j < matrix[i].length; j++) { // Inner loop runs n times
          System.out.println(matrix[i][j]); // 1 operation inside
      }
  }
}
// Total = n * n * 1 = n^2 operations.
```

- If/Else statements: Calculate the complexity of the worst-case branch.

```
public void process(int[] array) {
      if (array.length > 1000) { // 1 operation
      // This block has n^2 operations
          for (int i=0; i < n; i++) { for (int j=0; j < n; j++) { ... } }
      } else {
      // This block has n operations
          for (int i=0; i < n; i++) { ... }
    }
}
// We take the worst-case, so the complexity is n^2.
```

## Step 3: Simplify with Big O Rules

- After counting, you might get a messy formula like 3n^2 + 2n + 5. Big O simplifies this.
- **Rule 1: Drop Non-Dominant Terms.**
- As n gets very large, some terms grow much faster than others. We only care about the term that
  grows the fastest (the dominant term).
- n^2 grows much faster than n.
- n grows much faster than log(n).
- 2^n grows much faster than n^2.
- So, 3n^2 + 2n + 5 becomes 3n^2.
- **Rule 2: Drop Constants.**
- Big O doesn't care if it's 3n^2 or 100n^2. The "shape" of the growth is quadratic. We are
  concerned with the general order of magnitude, not the precise coefficient.
- So, 3n^2 becomes n^2.
- Final Answer: The time complexity of 3n^2 + 2n + 5 is O(n²).

## Part 4: The "Zoo" of Complexities (Basic to Advanced)

- Here are the most common complexities, from fastest to slowest, with Java examples.

1. O(1) — Constant Time

- The number of operations is the same regardless of the input size n.
- Explanation: The code doesn't have any loops that depend on n. It performs a fixed number of
  operations.

- Example: Accessing an element in an array.

```
// Time Complexity: O(1)
// Explanation: It takes the same amount of time to get the first element
// as it does to get the 500th element. The input size 'n' (array.length)
// does not affect the time it takes to perform the operation.
public int getFirstElement(int[] array) {
  if (array.length == 0) {
    return -1; // or throw an exception
  }
    return array[0]; // One operation: array access
}
```

2. O(log n) — Logarithmic Time

- The number of operations increases by one each time the input size n is doubled.
- Explanation: This is typical of algorithms that "divide and conquer" by repeatedly halving the
  input.
- Example: Binary Search. You search a sorted array by repeatedly cutting the search space in half.

```
// Time Complexity: O(log n)
// Explanation: With each comparison, we eliminate half of the remaining
// elements. For n=8, it takes ~3 steps. For n=1,024, it takes ~10 steps.
// The number of operations grows very slowly as n increases.
public int binarySearch(int[] sortedArray, int target) {
int low = 0;
int high = sortedArray.length - 1;

    while (low <= high) { // This loop runs log(n) times
        int mid = low + (high - low) / 2;

        if (sortedArray[mid] == target) {
            return mid;
        } else if (sortedArray[mid] < target) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return -1; // Target not found
}
```

3. O(n) — Linear Time

- The number of operations grows proportionally with the input size n.
- Explanation: If you double the input size, the number of operations roughly doubles. This usually
  involves a single loop over the input.
- Example: Finding the maximum value in an unsorted array.

```
// Time Complexity: O(n)
// Explanation: We have to look at every single element in the array once.
// If the array has 'n' elements, we perform roughly 'n' comparisons.
public int findMax(int[] array) {
if (array.length == 0) return -1;

    int max = array[0]; // 1 operation
    for (int i = 1; i < array.length; i++) { // Loop runs n-1 times
        if (array[i] > max) { // 1 comparison
            max = array[i]; // 1 potential assignment
        }
    }
    return max;
}
```

4. O(n log n) — Linearithmic Time

- A very common and efficient complexity for sorting algorithms.
- Explanation: This often involves dividing the input (log n) and then doing linear work on those
  divisions (n).
- Example: Merge Sort. It recursively splits the array in half (log n levels of recursion) and then
  merges the sorted halves in linear time (n work at each level).

```
// Time Complexity: O(n log n)
// Explanation: The 'mergeSort' method splits the problem in half each time, leading
// to log(n) levels of recursion. At each level, the 'merge' method does O(n) work
// to combine the pieces. Total work = n * log(n).
public void mergeSort(int[] array, int n) {
if (n < 2) {
return; // Base case
}
int mid = n / 2;
int[] left = new int[mid];
int[] right = new int[n - mid];

    // Copying data to sub-arrays (part of the O(n) work)
    for (int i = 0; i < mid; i++) {
        left[i] = array[i];
    }
    for (int i = mid; i < n; i++) {
        right[i - mid] = array[i];
    }

    mergeSort(left, mid);       // Recursive call (log n levels)
    mergeSort(right, n - mid); // Recursive call (log n levels)

    merge(array, left, right, mid, n - mid); // O(n) work at each level
}

// Helper method for merging (this is O(n))
private void merge(int[] a, int[] l, int[] r, int left, int right) {
// ... merging logic that iterates through l and r once ...
}
```

5. O(n²) — Quadratic Time

- The number of operations grows with the square of the input size.
- Explanation: Typically involves nested loops where both loops iterate up to n. If n doubles, the
  work quadruples.

- Example: Bubble Sort or finding duplicate pairs in an array.

```
// Time Complexity: O(n^2)
// Explanation: For each element in the array (outer loop, n times), we compare it
// with every other element (inner loop, n times). This results in n * n comparisons.
public void findDuplicates(String[] array) {
for (int i = 0; i < array.length; i++) {         // Runs n times
for (int j = i + 1; j < array.length; j++) { // Runs roughly n times
if (array[i].equals(array[j])) {
System.out.println("Duplicate found: " + array[i]);
}
}
}
}
```

6. O(2ⁿ) — Exponential Time

- The number of operations doubles with every single addition to the input size n.
- Explanation: These algorithms are incredibly slow and become unusable for even

# SPACE COMPLEXITY

## Part 1: What is Space Complexity? The Bookshelf Analogy

- Imagine you have a large, unsorted pile of books on the floor (n books). This is your input. You
  want to sort them alphabetically.
- Method A (In-Place): You pick up books one by one and rearrange them directly on the floor. You
  might need to hold one or two books in your hands at any given time, but you don't need any extra
  furniture.
- Method B (Using a Cart): You bring in a large rolling cart. You take every book from the floor,
  place it onto the cart, and then you pull books from the cart one by one to place them in a new,
  sorted pile on the floor.
- Space Complexity is the measure of the extra "furniture" (memory) your algorithm needs to solve
  the problem.

- Method A has very low space complexity. The extra space (your hands) is constant and doesn't
  depend on the number of books.
- Method B has high space complexity. The size of the cart you need is directly proportional to the
  number of books.

## Part 2: The Two Types of Space (And What We Actually Measure)

- When we analyze space, we consider two things:

- Input Space: The space required to store the input itself (e.g., the array, the string). We are
  usually not concerned with this, as it's given to us.
- Auxiliary Space: This is the temporary, extra space that your algorithm creates to do its work.
  This is what we measure for space complexity.
- Golden Rule: Space Complexity = Auxiliary Space. We want to know how the extra space grows as the
  input size n grows.

## Part 3: The "How" - A Tour of Space Complexities (Basic to Advanced)

- We use the same Big O notation as we did for time complexity. Let's go through the common ones
  with Java examples.

1. O(1) — Constant Space

- The algorithm requires a fixed amount of extra memory, regardless of the input size n. This is the
  most space-efficient category.
- Explanation: The memory usage does not scale with n. You are only using a small, fixed number of
  variables.

Example: Summing an array.

```
// Space Complexity: O(1)
// We are given the input array, which takes O(n) space, but that's the *input space*.
// The *auxiliary space* we use is just two variables: 'sum' and the loop counter 'i'.
// Whether the array has 10 elements or 10 million elements, we still only
// need these two primitive variables. The extra space required is constant.
public int sumArray(int[] array) {
int sum = 0; // One variable
for (int i = 0; i < array.length; i++) { // One variable for the counter
sum += array[i];
}
return sum;
}
```

- Another O(1) Example (In-place swap):

```
// Space Complexity: O(1)
// Explanation: This function reverses an array by modifying it directly
// ("in-place"). It only needs one extra variable, 'temp', to perform the swap.
// The amount of auxiliary space does not change with the size of the array.
public void reverseArrayInPlace(int[] array) {
  int left = 0;
  int right = array.length - 1;
  while (left < right) {
    // The only extra space is this 'temp' variable
    int temp = array[left];
    array[left] = array[right];
    array[right] = temp;
    left++;
    right--;
  }
}
```

2. O(n) — Linear Space

- The extra space required grows linearly and in direct proportion to the input size n.
- Explanation: This typically happens when you need to create a copy of the input or a new data
  structure whose size depends on n.

```
// Space Complexity: O(n)

// Explanation:
// This function creates a new array called 'reversedCopy'. The size of this new array
// is exactly the same as the size of the input array. If the input array has 'n'
// elements, we allocate memory for 'n' new elements. Therefore, the auxiliary
// space scales linearly with 'n'.
public int[] createReversedCopy(int[] array) {
int n = array.length;
int[] reversedCopy = new int[n]; // <-- We allocate O(n) space here

    for (int i = 0; i < n; i++) {
        reversedCopy[i] = array[n - 1 - i];
    }
    return reversedCopy;
}
```

3. O(log n) — Logarithmic Space

- The extra space grows logarithmically as the input size n increases. This is very efficient but
  less common than O(1) or O(n) for space.
- Explanation: This is almost always associated with recursion, where the depth of the recursive
  calls is log n. Each call to a function adds a "frame" to the program's call stack. We must count
  this stack space!

```
// Space Complexity: O(log n)
//
// Explanation:
// This algorithm does NOT create any new data structures. So where is the space coming from?
// It comes from the **call stack**.
// In the worst case, we have to make recursive calls until the search space (high - low) is 1.
// Since we cut the search space in half each time, the maximum depth of the recursion
// will be log₂(n). Each recursive call takes up a small, constant amount of space on the stack.
// Therefore, the total auxiliary space is O(log n) due to the stack depth.
//
// NOTE: An *iterative* binary search would have O(1) space complexity!
public int binarySearchRecursive(int[] sortedArray, int target, int low, int high) {
if (low > high) {
return -1; // Base case
}
int mid = low + (high - low) / 2;

    if (sortedArray[mid] == target) {
        return mid;
    } else if (sortedArray[mid] < target) {
        // A new stack frame is created for this recursive call
        return binarySearchRecursive(sortedArray, target, mid + 1, high);
    } else {
        // A new stack frame is created for this recursive call
        return binarySearchRecursive(sortedArray, target, low, mid - 1);
    }
}
```

4. O(n²) — Quadratic Space

- The extra space required is proportional to the square of the input size.
- Explanation: This is common when you need to create a 2D grid or matrix of size n x n.

```
// Space Complexity: O(n^2)
//
// Explanation:
// The function takes a single integer 'n' as input. It then creates a 2D array (a matrix)
// of size n * n. The total number of elements stored in this matrix is n^2.
// The memory required to store this matrix is directly proportional to n^2.
public int[][] createMultiplicationTable(int n) {
// We allocate an n-by-n grid. This requires n*n space.
int[][] matrix = new int[n][n];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            matrix[i][j] = (i + 1) * (j + 1);
        }
    }
    return matrix;
}
```

- Part 4: Advanced Topic - Recursion's Impact on Space
- This is a critical and often-missed part of space complexity analysis. Every function call
  consumes memory on the call stack.
- Let's compare two ways to calculate a factorial.

Example 1: Recursive Factorial (O(n) Space)

```
// Space Complexity: O(n)
//
// Explanation:
// To calculate factorial(5), the call stack looks like this before returning:
//
// | factorial(1) | <-- Top of stack
// | factorial(2) |
// | factorial(3) |
// | factorial(4) |
// | factorial(5) | <-- Bottom of stack
//
// The depth of the recursion is 'n'. Each call creates a new stack frame, holding
// its own value of 'n'. Therefore, the space used by the call stack is O(n).
public long factorialRecursive(int n) {
if (n <= 1) {
return 1;
}
return n * factorialRecursive(n - 1);
}
```

- Example 2: Iterative Factorial (O(1) Space)

```
// Space Complexity: O(1)
//
// Explanation:
// This version uses a loop instead of recursion. We only need two variables:
// 'result' and the loop counter 'i'. The call stack never grows.
// This is far more space-efficient for problems that can be solved iteratively.
public long factorialIterative(int n) {
  long result = 1;
  for (int i = 2; i <= n; i++) {
    result *= i;
  }
  return result;
}
```

- O(1)    Constant: Fixed amount of extra space. Iterating and modifying an array in-place.
- O(log n)    Logarithmic: Space for stack grows with log n. Recursive algorithms that halve the
  input (e.g., recursive binary search).
- O(n)    Linear: Extra space scales with input size. Creating a copy of an array; recursion with n
  depth (e.g., factorial).
- O(n²)    Quadratic: Extra space scales with n * n. Creating an n x n matrix.

## Final Thoughts:

- Always identify the auxiliary space: Ignore the input space and focus on what new memory you are
  allocating.
- Don't forget the call stack: For recursive functions, the maximum depth of the recursion
  determines its space complexity.
- There is often a trade-off: Sometimes, an algorithm that is faster (lower time complexity)
  requires more memory (higher space complexity), and vice-versa. The classic example is using a
  HashMap (O(n) space) to find duplicates in an array in O(n) time, versus using nested loops (O(1)
  space) which takes O(n²) time. Choosing the right algorithm depends on the specific constraints of
  your problem.

## The Fundamental Difference: Time vs. Space

- Time Complexity measures how many operations are performed. A nested loop forces the inner block
  of code to run n * n times, leading to a quadratic number of operations.
- Space Complexity measures how much extra memory is allocated. It's about storage, not repetition.
- You must ask the question: "Does my loop create new memory, and does the total amount of that new
  memory grow as n grows?"
- Let's look at the different scenarios with Java examples.
- Case 1: The Most Common Scenario — O(1) Space Complexity
- In most practical cases, a nested loop uses a constant amount of extra memory. The variables used
  for the loop counters (i, j) and any variables inside the loop are simply overwritten or reused in
  each iteration.
- Explanation: The program only needs to store a few variables (i, j, count). This number is fixed.
  It doesn't matter if n is 10 or 10,000; the memory needed for these variables remains the same. No
  new memory is accumulated over the course of the loops.
- Example: Finding pairs in an array

```
// Time Complexity: O(n^2) - because the inner loop runs n times for each outer loop run.
// Space Complexity: O(1) - because we are not allocating new memory that scales with n.
public void findPairs(int[] array) {
int n = array.length;
int count = 0; // O(1) space for this variable

    // The 'i' and 'j' variables are O(1) space. They are reused in each iteration.
    for (int i = 0; i < n; i++) { // Loop variable 'i' takes constant space
        for (int j = i + 1; j < n; j++) { // Loop variable 'j' takes constant space
            if (array[i] == array[j]) {
                System.out.println("Found a pair: " + array[i]);
                count++; // We are just modifying a variable, not allocating new space.
            }
        }
    }
    // At no point did we create a new data structure whose size depends on n.
    // The auxiliary space is constant.
}
```

- Case 2: The Allocation Scenario — O(n²) Space Complexity
- A nested loop can have a higher space complexity if you are allocating memory inside the loop and
  the total size of that memory scales with the number of iterations.
- Explanation: This happens when you explicitly create a data structure, like a 2D array (matrix),
  where both dimensions are dependent on n.
- Example: Creating an n x n Matrix
- While this is often done outside the loop, you can conceptualize the total allocation as being
  related to a nested structure.

```
// Time Complexity: O(n^2) - to fill the matrix.
// Space Complexity: O(n^2) - because we allocate a grid of n * n elements.
public int[][] createMatrix(int n) {

    // THIS IS THE KEY LINE:
    // We are allocating a 2D array with n rows and n columns.
    // The total number of integer slots we just reserved in memory is n * n.
    int[][] matrix = new int[n][n]; // O(n^2) auxiliary space is allocated here.

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            matrix[i][j] = i + j;
        }
    }
    return matrix;
}
```

## Another O(n²) Example: Storing all pairs

- Imagine you don't just want to print the pairs but store all of them.

```
class Pair {
int x, y;
Pair(int x, int y) { this.x = x; this.y = y; }
}

// Time Complexity: O(n^2)
// Space Complexity: O(n^2)
public List<Pair> storeAllPairs(int[] array) {
int n = array.length;
// In the worst case (all elements are unique), the number of pairs is
// roughly (n * (n-1)) / 2, which is O(n^2).
// Therefore, this list will grow to hold O(n^2) Pair objects.
List<Pair> allPairs = new ArrayList<>(); // The space starts here.

    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            // A new 'Pair' object is allocated in memory in each relevant iteration.
            allPairs.add(new Pair(array[i], array[j]));
        }
    }
    return allPairs;
}
```

- Case 3: A Hybrid Scenario — O(n) Space Complexity
- You can even have a nested loop with O(n) space complexity. This happens if the memory allocation
  only depends on one of the loops (e.g., the outer loop) and not both.

- Example: Creating a list of row sums

```
// Time Complexity: O(n*m) where n is rows, m is cols. (O(n^2) if square)
// Space Complexity: O(n) where n is the number of rows.
public List<Integer> getRowSums(int[][] matrix) {
int numRows = matrix.length;
if (numRows == 0) {
return new ArrayList<>();
}
int numCols = matrix[0].length;

    // We allocate a list. The final size of this list will be equal
    // to the number of rows, 'n'. This is O(n) space.
    List<Integer> sums = new ArrayList<>();

    for (int i = 0; i < numRows; i++) { // This loop runs 'n' times.
        int currentRowSum = 0; // O(1) space, reused each time.
        for (int j = 0; j < numCols; j++) { // This loop runs 'm' times.
            currentRowSum += matrix[i][j];
        }
        // The list grows by one element for each outer loop iteration.
        sums.add(currentRowSum);
    }
    // The final size of 'sums' is 'n', so auxiliary space is O(n).
    return sums;
}
```

## The Golden Rule for Loops and Space Complexity

- To find the space complexity, ignore the loop structure for a moment and look for the new
  keyword (or other memory allocation functions). Then ask:
- Is new memory being allocated inside a loop?
- How many times will this allocation happen in total?
- How big is each individual allocation?
- What is the total size of all allocated memory combined?

# Interview Questions
1) "In your own words, what is the difference between Big O, Big Omega, and Big Theta notation? In a typical software engineering context, why do we focus so heavily on Big O?"
- Big O (O): Represents the upper bound or worst-case scenario. It gives a guarantee that the algorithm's performance will not be worse than a certain rate of growth. We say "the runtime is at most this."
- Big Omega (Ω): Represents the lower bound or best-case scenario. It guarantees that the algorithm's performance will not be better than this rate. We say "the runtime is at least this."
- Big Theta (Θ): Represents a tight bound. It means the algorithm's performance is bound from both above and below by the same growth rate. We say "the runtime is exactly this."
- In software engineering, we focus on Big O because we care about guarantees and predictability. 
- We need to know the worst-case behavior of our code to ensure that our applications can handle peak loads and large inputs without slowing to a crawl or crashing. It prepares us for the most demanding scenarios our software might face.

2) Find time and space Complexity
```
public int findMaxElement(int[] array) {
    if (array == null || array.length == 0) {
        throw new IllegalArgumentException("Input array cannot be empty.");
    }
    int max = array[0];
    for (int i = 1; i < array.length; i++) {
        if (array[i] > max) {
            max = array[i];
        }
    }
    return max;
}
```
- Time Complexity: O(n)
- Space Complexity: O(1)
3) Find Toime and space COmplexity
```
public boolean containsDuplicates(String[] array) {
    int n = array.length;
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (array[i].equals(array[j])) {
                return true;
            }
        }
    }
    return false;
}
```
- Time Complexity: O(n²)
- Space Complexity: O(1)
4) Find Time and Space Complexity
```
public int calculateFibonacci(int n) {
    if (n <= 1) {
        return n;
    }
    return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
}
```
- Time Complexity: O(2ⁿ)
- Space Complexity: O(n)
5) Find time and space complexity
```
public int binarySearch(int[] sortedArray, int target) {
    int low = 0;
    int high = sortedArray.length - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (sortedArray[mid] == target) {
            return mid;
        } else if (sortedArray[mid] < target) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return -1; // Target not found
}
```
- Time Complexity: O(log n)
- Space Complexity: O(1)