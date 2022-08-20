package strings;

/**
 *  intern()
 *  This method will put the created  string in  String  pool
 *
 */

public class InternMethod {
    public static void main(String[] args) {
        String s1 = new String("Siba").intern();
        String s2 = "Siba";
        System.out.println(s1  == s2);

        String s3 = new String("Mohanty");
        String s4 = "Mohanty";
        System.out.println(s3  == s4);
    }
}
