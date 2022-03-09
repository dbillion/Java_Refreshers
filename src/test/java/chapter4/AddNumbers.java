package chapter4;

import java.util.Scanner;

/*
Do while loop
allows user to enter two numbers
sums the two numbers
user should be able to repeat this action
until they are done
 */
public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean again;
        do{
            System.out.println("enter the first number: ");
            double num1=scanner.nextDouble();
            System.out.println("enter ther second number:");
            double num2=scanner.nextDouble();

            double sum=num1+num2;
            System.out.println("the sum is "+ sum);

            System.out.println("Would you like to start over? please enter true or false``");
            again=scanner.nextBoolean();

    }while(again);
    scanner.close();

    }
}
