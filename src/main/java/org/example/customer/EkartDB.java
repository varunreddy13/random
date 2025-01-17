package org.example.customer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDB {

    public static List<Customer> getAll() {
        return Stream.of(
                new Customer(1, "varun", "v@gmail.com", Arrays.asList("567890987", "75678996")),
                new Customer(1, "ban", "a@gmail.com", Arrays.asList("4568864567", "998766789")),
                new Customer(1, "fgt", "g@gmail.com", Arrays.asList("24567845", "987654345")),
                new Customer(1, "kijd", "h@gmail.com", Arrays.asList("098765678", "4567898765"))
                ).collect(Collectors.toList());
    }
}
