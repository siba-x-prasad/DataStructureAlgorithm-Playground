package companyProgramms.digital14;

import java.util.HashSet;
import java.util.Objects;

/**
 * Created by Sibaprasad Mohanty on 23/02/2022.
 * Spm Limited
 * sp.dobest@gmail.com
 */

public class HashCodeExample1 {
    public static void main(String[] args) {
        A a1 = new A("Siba");
        A a2 = new A("Siba");
        A a3 = new A("Siba");
        A a4 = new A("Siba");
        A a5 = new A("Siba");
        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));

        HashSet<A> hs = new HashSet();
        hs.add(a1);
        hs.add(a2);
        hs.add(a3);
        hs.add(a4);
        System.out.println(hs.size());

    }
}


class A {
    String name;

    A(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return Objects.equals(name, a.name);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}


