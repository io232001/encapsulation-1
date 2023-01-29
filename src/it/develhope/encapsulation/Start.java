package it.develhope.encapsulation;

import java.util.Arrays;
import java.util.Scanner;

public class Start {

    public static void main(String[] args)
    {
        House house1=new House();
        house1.setAddress("Via Rivalta 12");
        System.out.println(house1.getAddress());
        house1.setFloorNumbers(2);
        System.out.println(house1.getFloorNumbers());
    }

}
