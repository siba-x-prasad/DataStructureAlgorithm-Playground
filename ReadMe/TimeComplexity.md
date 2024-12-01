# Time and Space Complexity
- https://www.geeksforgeeks.org/understanding-time-complexity-simple-examples/

## Time Complexity
- Imagine a classroom of 100 students in which you gave your pen to one person. 
- Now, you want that pen. Here are some ways to find the pen and what the O order is.

## O(n)
- Going and asking each student individually is O(N).
## O(n2)
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
## O(log n)
- Now I divide the class into two groups, then ask: 
- Is it on the left side, or the right side of the classroom ?
- Then I take that group and divide it into two and ask again, and so on. 
- Repeat the process till you are left with one student who has your pen. 
- This is what you mean by O(log n).
- I might need to do the O(n2) search if only one student knows on which student the pen is hidden. 
- I’d use the O(n) if one student had the pen, and only they knew it. 
- I’d use the O(log n) search if all the students knew, but would only tell me if I guessed the right side.
- **NOTE :** We are interested in rate of growth of time with respect to the inputs taken during the program execution .
- **NOTE:** In Binary Search, time complexity is O(log n)
- Binary Search Tree, searching an element is also O(log n)
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

- **O(1)** (in the worst case): Given the page that a business's name is on and the business name, find the phone number.
- **O(1)** (in the average case): Given the page that a person's name is on and their name, find the phone number.
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
- **O(log n):** Given a person's name, find the phone number by picking a random point about halfway through the part of the book you haven't searched yet, then checking to see whether the person's name is at that point. Then repeat the process about halfway through the part of the book where the person's name lies. (This is a binary search for a person's name.)
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
- Fix the ordering so that it's correct by looking at the first name on each page and then putting that page in the appropriate spot in a new, empty phone book.
- **O(n log n):** We want to personalize the phone book, so we're going to find each person or business's name in their designated copy, then circle their name in the book and write a short thank-you note for their patronage.
```
    for (int i = 1; i <= n; i++){
        for(int j = 1; j < n; j = j * 2) {
            System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
        }
    }
```
## O(n! - n Factorial

## Polynomial Time Algorithms – O(np)
- **O(n2):** A mistake occurred at the office, and every entry in each of the phone books has an extra "0" at the end of the phone number. 
- Take some white-out and remove each zero.
```
    for (int i = 1; i <= n; i++) {
        for(int j = 1; j <= n; j++) {
            System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
        }
    }
```
##  Factorial Time Algorithms – O(n!)
- **O(n · n!):** We're ready to load the phonebooks onto the shipping dock. 
- Unfortunately, the robot that was supposed to load the books has gone haywire: it's putting the books onto the truck in a random order! Even worse, it loads all the books onto the truck, then checks to see if they're in the right order, and if not, it unloads them and starts over. (This is the dreaded bogo sort.)
## Exponential Time Algorithms – O(kn)
- Worst time complexity among all
- We use Dynamic Programming to reduce this time complexity
- **O(nn):**
- You fix the robot so that it's loading things correctly.
- The next day, one of your co-workers plays a prank on you and wires the loading dock robot to the automated printing systems.
- Every time the robot goes to load an original book, the factory printer makes a duplicate run of all the phonebooks! Fortunately, the robot's bug-detection systems are sophisticated enough that the robot doesn't try printing even more copies when it encounters a duplicate book for loading, but it still has to load every original and duplicate book that's been printed.

## Graph
![Time Complexity Graph](https://github.com/siba-x-prasad/DSA_Collections/blob/master/ReadMe/Images/timeComplaxityGraph.png)