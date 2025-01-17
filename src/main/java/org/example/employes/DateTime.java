package org.example.employes;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.IsoFields;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DateTime {
    public static void main(String[] args) {
//        isLeapYear();
//        validateDate();
//        weekOfYear();
//        findNextFiveSundays();
//        groupByMontnhs();
        sortStrings();

    }

    public static void isLeapYear(){
        int year =2004;

        if (Year.isLeap(year)) {
            System.out.println("it is a leap year");
        }else {
            System.out.println("not a leap year");
        }
    }

    public static void validateDate(){
        String date = "09-02-1998";

        DateTimeFormatter validDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try{
            LocalDate date1 = LocalDate.parse(date,validDate);
            System.out.println("Valid Date " + date1);
        }catch (DateTimeException de){
            System.out.println("Invalid date Format " + de);
        }
    }


    public static void weekOfYear(){

        String givenDate = "2025-01-03";
        LocalDate date = LocalDate.of(2025, Month.JANUARY,20);
        System.out.println(date.get(IsoFields.WEEK_OF_WEEK_BASED_YEAR));
        int days = YearMonth.of(2024,Month.DECEMBER).lengthOfMonth();
        System.out.println(days);
    }


    public static void findNextFiveSundays(){

        LocalDate todaysDate = LocalDate.of(2025,02,01);

//        int days =0;
//
//        if(date.getDayOfWeek() == DayOfWeek.SUNDAY) {
//            for (int i = 0; i <= 5; i++) {
//                System.out.println(date.plusDays(7));
//            }
//        }
       Stream<LocalDate> nextFiveSundays = Stream.iterate(todaysDate, a ->a.plusDays(1)).filter(date -> date.getDayOfWeek() == DayOfWeek.SUNDAY).limit(5);
        nextFiveSundays.forEach(System.out::println);

    }


    public static void groupByMontnhs(){
        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(2023, 1, 5),
                LocalDate.of(2024, 1, 25),
                LocalDate.of(2024, 2, 15),
                LocalDate.of(2023, 3, 1),
                LocalDate.of(2025, 2, 19)
        );

       Map<Integer,List<LocalDate>>  months = dates.stream().collect(Collectors.groupingBy(date ->date.getYear()));
        System.out.println(months);
    }

    public static void sortStrings(){
        List<String> names =Arrays.asList("Bana","Apple","Sao","Rpjo");

        names.stream().sorted((a,b)->b.compareTo(a)).forEach(System.out::println);
    }
}
