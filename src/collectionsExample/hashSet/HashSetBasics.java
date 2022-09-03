package collectionsExample.hashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetBasics {
    public static void main(String[] args) {
        System.out.println("Create  HashSet Object");
        HashSet<String> hs1 = new HashSet<>(); // default capacity 16, load factor 0.75
        HashSet<String> hs2 = new HashSet<>(20); // default capacity 20, load factor 0.75
        HashSet<String> hs3 = new HashSet<>(20, 0.8f); // default capacity 20, load factor 0.8
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        HashSet<Integer> hs4 = new HashSet<>(list); // by passing collection

        System.out.println("SIze of Hashset "+hs4.size());

        HashSet<String> hs = new HashSet<>();
        boolean b1 = hs.add("Siba"); // true
        boolean b2 = hs.add("Prasad"); // true
        // what happens if duplicate element inserted
        boolean b3 = hs.add("Siba"); // false
        // it returns false, if already duplicate element existed

        hs4.addAll(Arrays.asList(6,7,9,0));
        System.out.println("Iterate Hashset using iterator");
        Iterator itr  = hs4.iterator();
        while(itr.hasNext()){
            System.out.print("Hash Item  "+itr.next());
        }
        System.out.println("Iterate Hashset using Enhanced for loop");
        for(Integer s :  hs4){
            System.out.print("Hash Item  "+s);
        }
        System.out.println("Remove Hashset Item");
        hs4.remove(6);
        System.out.print("Convert HAshSet to Array");
        hs4.toArray();

    }
}
