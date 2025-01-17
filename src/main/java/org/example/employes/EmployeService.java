package org.example.employes;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeService {

    public static List<Employe> employesEligbleForTax(String input){

            return (input.equalsIgnoreCase("tax"))? EmployeDao.getEmployeDetails().stream().filter(emp->emp.getSalary()>=167877).collect(Collectors.toList()):
                    EmployeDao.getEmployeDetails().stream().filter(emp->emp.getSalary()<=167877).collect(Collectors.toList());

    }

    public static void main(String[] args) {
        System.out.println(employesEligbleForTax("tax"));
    }
}
