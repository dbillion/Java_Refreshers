package chapter5;

import java.util.Scanner;

/*
* variable scope
* write an instant credit cheque that approves anyone who makes more than 25,000 and has creidt score
* of 700 or better, Reject all others
* */
public class InstantCreditCheck {

    //        Initialise what we know
 static   int requiredSalary=25000;
 static    int requiredCreditScore=700;
 static         Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {


//        Get what we dont know
        double salary=getSalary();
        int creditScore=getCreditScore();
        scanner.close();
//        check if the user is qualified
      boolean qualified=  isUserQualified(creditScore,salary);

//        Notify the user
        notifyUser(qualified);
    }

    public static int getCreditScore(){
        System.out.println("Enter your credit score: ");
        int creditScore=scanner.nextInt();
        return creditScore;
    }
    public static double getSalary(){
        System.out.println(" enter your salary: ");
        double salary=scanner.nextDouble();
        return salary;
    }
    public static boolean isUserQualified( int creditScore, double salary){
        if(creditScore>=requiredCreditScore && salary>=requiredSalary) {
            return true;
        }
      else{
            return  false;
        }

    }
    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congratulations! yOU HAVE BEEN APPROVED!");
        }   else{
            System.out.println("Congratulations! yOU HAVE BEEN Declined!");

        }
    }
}
