package org.example;

import java.util.*;

public class ComporatorIml {



    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("varun");
        names.add("Lenin");
        names.add("Manish");
        names.add("Akhil");

        Comparator c = new Comparator<String>(){
            public int compare(String o1, String o2){
                if(o1.toUpperCase().startsWith("z")){
                    return 1;
                }
                else return -1;
            }
        };

        Collections.sort(names,c);
        System.out.println(names);
    }




}
