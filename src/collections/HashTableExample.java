package collections;

import java.util.*;

public class HashTableExample {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Siba","Prasad");
        hashMap.put("Siba1","Prasad1");
        hashMap.put("Siba2","Prasad2");
        System.out.println("Different ways to define Hashtable");
        Hashtable<String, String> hashtableEmptyConstructor  = new Hashtable<>(); // default capacity is 11 and loadfactor is 0.75
        Hashtable<String, String> hashtableWithCapacity  = new Hashtable<>(20);
        Hashtable<String, String> hashtableWithCapacityANdLoadFactor  = new Hashtable<>(20,0.60f);
        Hashtable<String, String> hashTableWIthMap = new Hashtable<>(hashMap);
        System.out.println("Size of Hashtable using size() "+hashTableWIthMap.size());

        hashTableWIthMap.putIfAbsent("Spm","asdasd");

        Set<String> keyCollection = hashTableWIthMap.keySet();
        Collection<String> valueCollection = hashTableWIthMap.values();
        System.out.println("get Keys of Hashtable hashTable.keySet()");
        for(String s : keyCollection){
            System.out.print(" "+s);
        }
        System.out.println("\n get Values of Hashtable hashTable.values()");
        for(String s : valueCollection){
            System.out.print(" "+s);
        }
        System.out.println("\n Iterate key and values of collectionsExample.hashtable ");


        for(Map.Entry<String, String> map : hashTableWIthMap.entrySet()){
            System.out.print(" KEY = "+map.getKey()+" Value = "+map.getValue());
        }
        System.out.println("\n Iterate key and values of collectionsExample.hashtable Using Iterator ");
        Iterator iterator = hashTableWIthMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> map = (Map.Entry<String, String>)iterator.next();
            System.out.print(" KEY = "+map.getKey()+" Value = "+map.getValue());
        }
    }
}
