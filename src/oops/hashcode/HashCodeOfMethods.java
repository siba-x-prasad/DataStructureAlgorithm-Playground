package oops.hashcode;

import java.lang.reflect.Method;

public class HashCodeOfMethods {
    // create a Method name getSampleMethod
    public void getSampleMethod() {}

    // create a Method name setSampleMethod
    public String setSampleMethod()
    {

        String str = "hello India";
        return str;
    }

    // create main method
    public static void main(String args[])
    {

        try {

            // create class object for class name GFG
            Class c = HashCodeOfMethods.class;

            // get list of Method objects
            // of class object of gfg class
            Method[] methods = c.getMethods();

            // loop through methods list
            // and get hashcode of every method
            // and print those hashcode along with Method Name
            for (Method m : methods) {

                // get hashcode of current method of loop
                int hashCode = m.hashCode();

                // Print hashCode along with method name
                System.out.println("hashCode of method "
                        + m.getName()
                        + " is " + hashCode);
            }
        }
        catch (Exception e) {
            // print Exception if any Exception occurs.
            e.printStackTrace();
        }
    }
}
