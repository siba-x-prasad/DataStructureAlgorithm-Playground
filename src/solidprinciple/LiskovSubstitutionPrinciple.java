package solidprinciple;

/**
 * Liskov Substitution Principle
 * It applies to inheritance in such a way that the derived classes must be completely substitutable for their base classes.
 * <p>
 * In other words, if class A is a subtype of class B, then we should be able to replace B with A without interrupting the behavior of the program.
 * <p>
 * It Extends Open Close Principle
 */

public class LiskovSubstitutionPrinciple {
 public static void main(String... args) {
  StudentBMI sbi = new StudentBMI();
  sbi.setHeight(167.22);
  sbi.setWeight(60.22);
  sbi.calculateBmi();
 }
}

class Student {
 private double height;
 private double weight;

 public void setHeight(double h) {
  height = h;
 }

 public void setWeight(double w) {
  weight = w;
 }

 public void calculateBmi() {
  System.out.println("BMI is " + weight / height);
 }
}

class StudentBMI extends Student {
 public void setHeight(double h) {
  super.setHeight(h);
 }

 public void setWeight(double h) {
  super.setWeight(h);
 }
}



