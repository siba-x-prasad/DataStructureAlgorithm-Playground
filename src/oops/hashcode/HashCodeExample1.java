package oops.hashcode;

import java.lang.reflect.Method;

public class HashCodeExample1 {
    int id;
    String name;
    HashCodeExample1(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return 123;
    }

    // create a Method name getSampleMethod
    public void getSampleMethod() {}

    public static void main(String...args){
        HashCodeExample1 obj = new HashCodeExample1(1, "siba");
        System.out.println("Initial HashCode is "+obj.hashCode());
        obj.name = "Prasad";
        System.out.println("Afte change HashCode is "+obj.hashCode());

        HashCodeExample1 obj2 = new HashCodeExample1(1, "siba");
        System.out.println("HashCode Of new Object of HashCodeExample1 "+obj2.hashCode());

        boolean b = obj2 == obj;

        System.out.println("Check if obj and Obj 2 are =="+b);
        HashCodeExample1 obj3 = obj2;
        boolean comparison2 = obj2 == obj3;
        System.out.println("Check if obj and Obj 2 are =="+comparison2);

        System.out.println("Check if obj and Obj 2 are equals "+obj.equals(obj2));

        try {

            // create class object for class name HashCodeExample1
            Class c = HashCodeExample1.class;
            // get Method object of method name getSampleMethod
            Method method = c.getDeclaredMethod("getSampleMethod", null);
            // get hashcode of method object using hashCode() method
            int hashCode = method.hashCode();
            // Print hashCode with method name
            System.out.println("hashCode of method " + method.getName()
                    + " is " + hashCode);
        }
        catch (Exception e) {
            // print if any exception occurs
            e.printStackTrace();
        }

    }
}
