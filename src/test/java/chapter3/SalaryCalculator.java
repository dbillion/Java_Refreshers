package chapter3;

import java.util.Scanner;

/*
If  statement
ALl sales people get a payment of $1000 per week.
Sales people who exceeds 10 sales get an additional bonus of 250.
 */
public class SalaryCalculator {
    /*
    Always get the shape of the problem before you start coding

    work with the known befire attempting the unknown

    list the known

    list the unknown

    defined the relationship between the known and the unknown

    substitute and use the syntax to solve it rightly
     */

//    initialise the known values
public static void main(String[] args) {
    int salary=1000;
    int bonus=250;
    int quota=10;

//    initialise the unknown values
    System.out.println("How many sales did the employee make this wekend?");
    Scanner scanner = new Scanner(System.in);
    int sales=scanner.nextInt();

//    Quik detour for the bonus earners
    if(sales >quota){
        salary+=bonus;
    }

//    out put
    System.out.println("The employees pay is $" + salary);

}
}
