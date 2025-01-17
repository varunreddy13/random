package org.example.employes;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedList {

    public static void main(String[] args) {
        List<Employe> employess = EmployeDao.getEmployeDetails();
        Collections.sort(employess, (o1, o2) ->(int)(o2.getSalary()- o1.getSalary()));
        System.out.println(employess);


//       // employess.stream().sorted((o1,o2)->(int)(o2.getSalary() -o1.getSalary()))
//                .forEach(a-> System.out.println(a));

        employess.stream().sorted(Comparator.comparing(Employe::getDepartmant))
                .forEach(a-> System.out.println(a));
    }





}
