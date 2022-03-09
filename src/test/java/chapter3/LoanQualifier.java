package chapter3;

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args) {
//        initialise the knowns
        int requiredSalary=30000;
        int requiredYearsOfEmployment=2;

//        get what we dont
        System.out.println("Enter your salary");
        Scanner scanner=new Scanner(System.in);
        double salary=scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer");
        double years=scanner.nextDouble();
        scanner.close();

//        make decision
        if(salary>=requiredSalary){
            if(
                 years>=   requiredYearsOfEmployment
            ){
                System.out.println("Congrats! you qualify for the loan");
            }else{
                System.out.println("Sorry, you must have worked at your current job "+requiredYearsOfEmployment+" years" );
            }
        }else{
            System.out.println("Sorry, you must earn at least $" + requiredSalary+ " to qualify for the loan");
        }
    }
}
