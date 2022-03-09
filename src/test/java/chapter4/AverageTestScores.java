package chapter4;

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String[] args) {
//        we initialisie what we know

        int numberOfstudents=24;
        int numberOfTest=4;

//        process all students

        Scanner scanner=new Scanner(System.in);
        for(int i=0; i<numberOfstudents;i++){

            double total=0;
            for(int j=0; j<numberOfTest;j++){
            System.out.println("Enter the score for Test #" + (j+1));
            double score=scanner.nextDouble();
            total+=score;
            }
            double average=total/numberOfTest;
            System.out.println("Average for student # " + (i +1) + " is " + average);
        }

scanner.close();
    }

}
