package chapter3;

import java.util.Scanner;

public class QoutaCalculator {
    public static void main(String[] args) {
//        initialise values we know
        int quota=10;
//        get unknown
        System.out.println("Enter the number of sales you made this week: ");
        Scanner scanner = new Scanner(System.in);
        int sales=scanner.nextInt();
        scanner.close();
//        make decisions
        if(sales>=quota){
        System.out.println("Congrats! you have met your qouta!");
        }else{
            //        print output

            int salesShort=quota-sales;
            System.out.println("You did not make your quota! you were " + salesShort+ "sales short");

        }
    }
}
