package it.develhope.encapsulation;

import java.util.Arrays;
import java.util.Scanner;

public class Start {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        House house = new House();
        System.out.print("Enter the number of floors: ");
        house.setFloorsNumber(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Enter the address: ");
        house.setAddress(scanner.nextLine());
        System.out.print("Enter the names of residents separated by comma: ");
        String residents = scanner.nextLine();
        System.out.println("House details:");
        System.out.println("Floors number: " + house.getFloorsNumber());
        System.out.println("Address: " + house.getAddress());
        System.out.println("Residents: " + house.getResidentsNames());
    }
}
