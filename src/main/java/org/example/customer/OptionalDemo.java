package org.example.customer;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static Customer findCustomerByEmail(String email){
        List<Customer> emails = EkartDB.getAll();
        return emails.stream().filter(customer -> customer.getEmail().equals(email)).findFirst().get();}

    public static void main(String[] args) {
        Customer customer = new Customer(2,"v",null, Arrays.asList("5435","65433"));

        findCustomerByEmail("a@gmail.com");



//        Optional<Object> empty = Optional.empty();
//        System.out.println(empty);
//       // Optional<String> email = Optional.of(customer.getEmail());
//       // System.out.println(email);
//        Optional<String> email1 = Optional.ofNullable(customer.getEmail());
//
//      //  System.out.println(email1.orElseThrow(()->new IllegalArgumentException("no email present")));
//
//        System.out.println(email1.map(String::toUpperCase).ifPresentOrElse(a-> System.out.println(a)));

//        if(email1.isPresent())
//        System.out.println(email1.get());
//        else
//            System.out.println();
    }
}
