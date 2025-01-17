package org.example;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class PreDefinedFI {
    public static void main(String[] args) {
//        List<Integer> nums= Arrays.asList(3,4,5,3,2,5);
//
//
//        Collections.sort(nums);
//        System.out.println(nums.stream().filter(num->num%2==1).findAny().orElseGet(()->10));
//
//
//        List<String> chars= Arrays.asList();
//        System.out.println(chars.stream().findFirst().orElseGet(()->"varun"));


//        List<String> names = Arrays.asList("varun","Lenin","Manish");
//        names.stream().forEach(t -> System.out.println(t));

        Map<Integer,String> map = new HashMap<>();

        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(5,"e");
        map.put(5,"e");
        map.put(4,"d");

       // map.forEach((key,value)-> System.out.println(key + " " +value));

        map.entrySet().stream().filter(a->a.getKey()%2==0).forEach(obj-> System.out.println(obj));

    }

}
