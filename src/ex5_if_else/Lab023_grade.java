package ex5_if_else;

import java.util.Scanner;

public class Lab023_grade {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the mark : ");
        int score=sc.nextInt();
        char grade='f';

        if (score >=90 && score <=100)
            grade='A';
        else if (score >=80 && score <= 89)
            grade='B';
        else if(score >=70 && score <=79)
            grade='c';
        else if(score >=60 && score<=69)
            grade='D';
        else if(score <0 || score >100)
            System.out.println("invalid input");
        else
        grade='F';

        System.out.println("your grade : "+ grade);
    }
}
