package ex5_if_else;



import java.util.Scanner;

public class Lab024_if_sides {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side1: ");
        int side1=sc.nextInt();
        System.out.println("Enter the side2: ");
        int side2=sc.nextInt();
        System.out.println("Enter the side3: ");
        int side3=sc.nextInt();
        if(side1 <=0 || side2 <=0 || side3 <=0)
            System.out.println("Invalid input");
        else {
            if(side1==side2 && side2 == side3 && side1==side3)
                System.out.println("this triangle is equilateral");
            else if (side1 == side2 || side2 == side3 || side3==side1)
                System.out.println("this triangle is isosceles");
            else
                System.out.println("this triangle is scalene");
        }





    }
}