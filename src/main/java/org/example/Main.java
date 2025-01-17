package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main m = new Main();

        String name = "VVaarruunniissss";
        String word = new String("VVaarruunniissss");

        System.out.println(name == word);
        System.out.println("varun main");
        System.out.println("main branch changes");
        System.out.println("main branch changes1");

        reverseString(name);
        int num = 5;
        System.out.println("Factorial of " + num + " is: " + m.factorial(num));
        int[] nums = {1, 2, 2, 3, 4, 4, 5};
        removeDuplicates(nums);
//        LocalDate localDate = LocalDate.of(2029, Month.JULY,1);
//        System.out.println(localDate);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-YYYY-dd");
//        String formateDate = localDate.format(formatter);
//        System.out.println(formateDate);
//        String localDt = "03-01-2025";
//        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        LocalDate parsedDt = LocalDate.parse(localDt,formatter1);
//        System.out.println(parsedDt);
//        sundayInJuly();
    }


    public static void reverseString(String name){

        String reverse = "";

        for(int i=name.length()-1;i>=0;i--){
            reverse += name.charAt(i);

        }

        System.out.println("Reversed string: " + reverse);

    }

    public int  factorial(int n){
        if(n==0){
            return 1;
        }

        return n*factorial(n-1);
    }

    public static void removeDuplicates(int[] arr){

        Set<Integer> unique = new HashSet<>();

        for(int n : arr){
            unique.add(n);
        }
        System.out.println(unique);
    }

    public static void repeatedNumbers(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        int j = 0;

        for(int n : arr){
            if(n == arr[j]){
                map.put(n,j+1);
            }
            j++;
        }

        //System.out.println("the number " + map.k );
    }

    public static void sundayInJuly(){
        int year =2029;
        Month month = Month.JULY;

        int sundayCount =0;

        LocalDate date = LocalDate.of(year,month,1);

        while (date.getMonth() == month){

            if(date.getDayOfWeek() == DayOfWeek.SUNDAY){
                sundayCount++;
            }

            date =date.plusDays(1);
        }
        System.out.println("Number of sundays in July " + sundayCount);

    }
}