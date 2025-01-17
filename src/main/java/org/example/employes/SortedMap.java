package org.example.employes;

import java.util.*;

public class SortedMap {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("eight",1);
        map.put("one",8);
        map.put("two",3);
        map.put("four",4);
        map.put("three",9);

        List<Map.Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());

        //tradional way
        Collections.sort(entries, (o1,o2)->o2.getValue()-o1.getValue());
//
//        for(Map.Entry<String,Integer> entry : entries){
//            System.out.println(entry.getKey() + " value is " +entry.getValue());
//        }


       // map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        System.out.println("********************");
        //map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        Map<Employe,Integer> employesMap = new TreeMap<>(( o1,  o2) ->
                (int)(o2.getSalary()-o1.getSalary()));
//
//        employesMap.put(new Employe(1,"varun","IT",67877),90);
//        employesMap.put(new Employe(2,"Lenin","CSE",7877),78);
//        employesMap.put(new Employe(3,"Manish","Mangement",877),86);
//        employesMap.put(new Employe(4,"Veer","Lead",167877),78);
//        employesMap.put(new Employe(5,"Saud","Product",567877),45);

        //System.out.println(employesMap);

        employesMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employe::getDepartmant)))
                .forEach(t-> System.out.println(t));

    }

}
