package objects;

import java.util.Objects;

public class HashCodeEmployee {
    private int regno;
    private String name;

    //constructor of Employee class  
    public HashCodeEmployee(int regno, String name) {
        this.name = name;
        this.regno = regno;
    }

    public int getRegno() {
        return regno;
    }

    public void setRegno(int Regno) {
        this.regno = regno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashCodeEmployee that = (HashCodeEmployee) o;
        return regno == that.regno && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return 9;
    }
}