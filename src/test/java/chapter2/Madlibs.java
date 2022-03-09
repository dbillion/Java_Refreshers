package chapter2;

import java.util.Scanner;

public class Madlibs {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("KIndly enter adjective: ");
        String adjective=scanner.next();


        System.out.println("KIndly enter numbersOfCoffee: ");
        int numbersOfCoffee=scanner.nextInt();

        System.out.println("KIndly enter seasonOfTheYear: ");
        String seasonOfTheYear=scanner.next();

        System.out.println( "On a " + adjective + ""+seasonOfTheYear+ "day, I drink a minimum of " + numbersOfCoffee+ " cups of coffee.");



    }
}
