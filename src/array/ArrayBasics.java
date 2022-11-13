package array;

public class ArrayBasics {
    ArrayStudent[] studentArray = new ArrayStudent[12];
    public static void main(String[] args) {

    }
}

class ArrayStudent {
    String name;
    String email;
    String address;

    ArrayStudent(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }
}
