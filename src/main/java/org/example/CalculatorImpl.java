package org.example;

import java.util.Comparator;

public class CalculatorImpl implements Comparator {

    public static void main(String[] args) {

//       Calculator c= () ->  System.out.println("Switch on");
//       c.swithOn();

        Calculator c= (i1,i2) ->  {
            if(i2>i1){
                throw new RuntimeException("message");
            }
            else return i2-i1;
        };
        System.out.println(c.suma(2,1)) ;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
