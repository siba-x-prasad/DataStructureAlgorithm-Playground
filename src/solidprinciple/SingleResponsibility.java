package solidprinciple;

/**
 * SIngle Responsibility - This means one class should responsible for one task
 * For example you can below
 */

public class SingleResponsibility {

}

/**
 * Below class violates the Single Responsibility Rule in solid principle
 */

class StudentExample1 {
 public void printDetails() {
  //functionality of the method
 }

 public void calculatePercentage() {
  //functionality of the method
 }

 public void addStudent() {
  //functionality of the method
 }
}

/**
 * We can split the above class to implement the single responsibility rule
 */
class Student1 {
 public void addStudent() {
  //functionality of the method
 }
}

class PrintStudentDetails {
 public void printDetails() {
  //functionality of the method
 }
}

class Percentage {
 public void calculatePercentage() {
  //functionality of the method
 }
}




