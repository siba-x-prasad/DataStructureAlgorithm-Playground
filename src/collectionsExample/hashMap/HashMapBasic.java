package collectionsExample.hashMap;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapBasic {
    public static void main(String[] args) {
        // Initialize hashmap
        HashMap<Integer, String> hashmapBasic = new HashMap<>(); // will create hashmap with initial size 16 and 0.75 as load factor
        System.out.println("Default Size of HashMap "+hashmapBasic.size());
        HashMap<Integer, Object> hashmapWithSize = new HashMap<>(30);
        System.out.println("Default Size of HashMap "+hashmapWithSize.size());
        HashMap<String, Integer> map3 = new HashMap<String, Integer>(30, 0.5f);
        //4. Creating HashMap by copying another HashMap
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        HashMap<String, Integer> map4 = new HashMap<String, Integer>(map1);

        hashmapBasic.put(1,"SIba");
        String insertedValue = hashmapBasic.put(1,"SIba12"); // It will replace Siba12 at 1 key
        System.out.println("Value returned when replace a key with another value "+insertedValue);
        hashmapBasic.putIfAbsent(2, "Siba 2");
        hashmapBasic.putIfAbsent(3, "Siba 3");
        hashmapBasic.putIfAbsent(4, "Siba 4");
        // Iterate KEY of hashmap
        System.out.print("ITERATE KEY");
        Set<Integer> keySet = hashmapBasic.keySet();
        for(Integer i : keySet){
            System.out.print(""+i);
        }

        System.out.print("ITERATE VALUES");
        Collection<String> valueSet = hashmapBasic.values();
        for(String i : valueSet){
            System.out.print(""+i);
        }
        System.out.print("ITERATE KEY AND VALUES");
        for(Map.Entry<Integer, String> entrySet : hashmapBasic.entrySet()){
            System.out.print(" KEY "+entrySet.getKey() +" Value "+entrySet.getValue());
        }
        System.out.println("Size of hashmap is "+hashmapBasic.size());
        System.out.println("Clear hashmap using function  => hashmapBasic.clear()");
//        hashmapBasic.clear();
        System.out.println("Get a value "+hashmapBasic.get(1)); // it will return SIba12
        System.out.println("containsValue() "+hashmapBasic.containsValue("SIba12")); // it will return SIba12
        System.out.println("containsKey() "+hashmapBasic.containsKey(2)); // it will return SIba12
        System.out.println("Remove Keys and values");
        hashmapBasic.remove(1);
        hashmapBasic.remove(1, "siba444"); // it will remove only if 1 is mapped to siba44
        System.out.println("Replace Elements");
        hashmapBasic.replace(1,"prasad");

        System.out.println("Create Synchronised Hashmap");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        //Getting synchronized Map
        Map<String, Integer> syncMap = Collections.synchronizedMap(map);
        // ConcurrentHashMap
        System.out.println("ConcurrentHashMap for Threadsafe Or synchronization");
        ConcurrentHashMap<String,String> concurrentHashMap = new ConcurrentHashMap();
    }
}
