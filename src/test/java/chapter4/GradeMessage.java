package chapter4;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter your grade: ");
        Scanner scanner = new Scanner(System.in);
        String grade=scanner.next();

        String message;

        switch(grade){
            case "A":
                message=" Excellent job";
                break;
            case "B":
                message=" GREAT job";
                break;
            case "C":
                message=" Good job";
                break;
            case "D":
                message=" You need to work hard";
                break;
            case "E":
                message=" You need to give it your best";
                break;
            case "F":
                message=" Dont stop here, You have everything to win";
                break;
            default :
                message=" Invallid grade";
                break;

        }

        System.out.println(message);


    }
}
