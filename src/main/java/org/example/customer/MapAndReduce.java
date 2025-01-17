package org.example.customer;

import org.example.employes.Employe;
import org.example.employes.EmployeDao;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapAndReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,50,6,4);


        int sum = numbers.stream().mapToInt(i -> i).sum();

        System.out.println(sum);
        Optional<Integer> reduce = numbers.stream().reduce(Integer::sum);

        System.out.println(reduce.get());
        Integer reduce1 = numbers.stream().reduce(1, (a, b) -> a * b);

        System.out.println(reduce1);


        Integer maxReduce = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(maxReduce);

        Integer maxWithMethodRefernce = numbers.stream().reduce(Integer::max).get();
        System.out.println(maxWithMethodRefernce);


        List<String> words = Arrays.asList("coreJavahf","Spring","Hibernet");

        Optional<String> longestLength = Optional.of(words.stream().reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2).get());
        System.out.println(longestLength);

       Double sumOfSalary = EmployeDao.getEmployeDetails().stream()
                .filter(employe -> employe.getGrade().equalsIgnoreCase("A"))
                .map(Employe::getSalary)
                .mapToDouble(a->a)
                .sum();

        System.out.println(sumOfSalary);

        Long a1 = EmployeDao.getEmployeDetails().stream().filter(employe -> employe.getGrade().equals("A"))
                .map(employe -> employe.getSalary())
                .reduce(0L, Long::sum);


        System.out.println(a1);
    }


}
