package objects;

public class HashcodeExample {
    public static void main(String[] args) {
        //creating two instances of the Employee class
        HashCodeEmployee emp1 = new HashCodeEmployee(918, "Maria");
        HashCodeEmployee emp2 = new HashCodeEmployee(918, "Maria");
        //invoking hashCode() method
        int a = emp1.hashCode();
        int b = emp2.hashCode();


        System.out.println("Memory Address of object emp1 "+ System.identityHashCode(emp1));
        System.out.println("Memory Address of object emp2 "+ System.identityHashCode(emp2));

        System.out.println("hashcode of emp1 = " + a);
        System.out.println("hashcode of emp2 = " + b);
        System.out.println("Comparing objects emp1 and emp2 = " + emp1.equals(emp2));
        boolean comparisonUsingDoubleEqual = emp1 == emp2;
        System.out.println("Comparing objects emp1 and emp2 == " + comparisonUsingDoubleEqual);
    }
}