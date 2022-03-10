package companyProgramms.digital14;

/**
 * Created by Sibaprasad Mohanty on 23/02/2022.
 * Spm Limited
 * sp.dobest@gmail.com
 */

public class Inheritance1Program {
    public static void main(String[] args) {
        A1 a = new B();
        a.print();
    }
}

class A1 {
    void print() {
        System.out.print("A");
    }
}

class B extends A1 {
    @Override
    void print() {
        System.out.print("B");
    }
}