package org.example.customer;

import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {
    public static void main(String[] args) {
        List<Customer> customers = EkartDB.getAll();


        List<String> emails = customers.stream().filter(customer -> customer.getEmail().startsWith("v")).map(customer -> customer.getEmail()).collect(Collectors.toList());
        List<String> phones = customers.stream().flatMap(customer -> customer.getPhoneNumber().stream()).collect(Collectors.toList());
        System.out.println(emails);

        // = customers.stream().flatMap(customer -> customer.getPhoneNumber().stream()).collect(Collectors.toList());

        System.out.println(phones);
    }


}
