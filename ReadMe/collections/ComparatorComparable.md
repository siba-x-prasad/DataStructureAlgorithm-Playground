# Comparable & Comparator

| Comparable                                                                          | Comparator                                                                                      |
|-------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------|
| Comparable provides a single sorting sequence.                                      | The Comparator provides multiple sorting sequences.                                             |
| Comparable affects the original class, i.e., the actual class is modified.          | Comparator doesn't affect the original class, i.e., the actual class is not modified.           |
| Comparable provides compareTo() method to sort elements.                            | Comparator provides compare() method to sort elements.                                          |
| Comparable is present in java.lang package.                                         | A Comparator is present in the java.util package.                                               |
| We can sort the list elements of Comparable type by Collections.sort(List) method.  | We can sort the list elements of Comparator type by Collections.sort(List, Comparator) method.  |
|                                                                                     |                                                                                                 |

## Comparable
- Java Comparable interface is used to order the objects of the user-defined class.
- This interface is found in java.lang package and contains only one method named compareTo(Object).
- It provides a single sorting sequence only, i.e., you can sort the elements on the basis of single data member only. 
- For example, it may be rollno, name, age or anything else.

## public int compareTo(Object obj): 
- It is used to compare the current object with the specified object. It returns
- positive integer, if the current object is greater than the specified object.
- negative integer, if the current object is less than the specified object.
- zero, if the current object is equal to the specified object.
- Example
```
class Student implements Comparable<Student>{    

     int rollno;    
     String name;    
     int age; 
        
     Student(int rollno,String name,int age){    
         this.rollno=rollno;    
         this.name=name;    
         this.age=age;    
    }    
     
     public int compareTo(Student st){    
         if(age==st.age)    
            return 0;    
         else if(age<st.age)    
            return 1;    
         else    
            return -1;    
         }    
 }    
```
- 
```
    ArrayList<Student> al=new ArrayList<Student>();    
    al.add(new Student(101,"Vijay",23));    
    al.add(new Student(106,"Ajay",27));    
    al.add(new Student(105,"Jai",21));    
    Collections.sort(al);    
```

 ## Comparator
- It is a custom shorting mechanism 
- You can short your object using custom shorting order
- In this below example, please find  the  below shorting orders.
```
// Class 1
// A class to represent a Student
class Student {

    // Attributes of a student
    int rollno;
    String name, address;
 
    // Constructor
    public Student(int rollno, String name, String address){
 
        // This keyword refers to current instance itself
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
 
    // Method of Student class
    // To print student details in main()
    public String toString()
    {
 
        // Returning attributes of Student
        return this.rollno + " " + this.name + " "
            + this.address;
    }
}
 
// Class 2
// Helper class implementing Comparator interface
class Sortbyroll implements Comparator<Student> {
 
    // Method
    // Sorting in ascending order of roll number
    public int compare(Student a, Student b)
    {
 
        return a.rollno - b.rollno;
    }
}
 
// Class 3
// Helper class implementing Comparator interface
class Sortbyname implements Comparator<Student> {
 
    // Method
    // Sorting in ascending order of name
    public int compare(Student a, Student b)
    {
 
        return a.name.compareTo(b.name);
    }
}
 
// Class 4
// Main class
class GFG {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating an empty ArrayList of Student type
        ArrayList<Student> ar = new ArrayList<Student>();
 
        // Adding entries in above List
        // using add() method
        ar.add(new Student(111, "Mayank", "london"));
        ar.add(new Student(131, "Anshul", "nyc"));
        ar.add(new Student(121, "Solanki", "jaipur"));
        ar.add(new Student(101, "Aggarwal", "Hongkong"));
 
        // Display message on console for better readability
        System.out.println("Unsorted");
 
        // Iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
 
        // Sorting student entries by roll number
        Collections.sort(ar, new Sortbyroll());
 
        // Display message on console for better readability
        System.out.println("\nSorted by rollno");
 
        // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
 
        // Sorting student entries by name
        Collections.sort(ar, new Sortbyname());
 
        // Display message on console for better readability
        System.out.println("\nSorted by name");
 
        // // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}
```

