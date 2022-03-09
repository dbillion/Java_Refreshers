package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {
    /*
    while loop
    each store employee makes 15$ an hour.
    write a program that allows the employee to enter the
    numbers of hours worked for the week.
    Do not allow overtime.
     */
    public static void main(String[] args) {
//        initialise known variables
        int rate=15;
        int maxHours=40;
//        get input for unknown variabes
        System.out.println("How many hours did you work this week?");
        Scanner scanner=new Scanner(System.in);
        double hoursWorked=scanner.nextDouble();

//        validate input
        while(hoursWorked > maxHours || hoursWorked < 1) {
        System.out.println("Invalid entry, Your hours must be between 1 and 40, try again");
        hoursWorked=scanner.nextDouble();
        }
        scanner.close();

//        calculate gross
double gross=rate * hoursWorked;
System.out.println("Gross pay: $" + gross);

    }
}
