package ex3_CLI;

public class Lab017_grade_calculator {
    public static void main(String[] args) {
        String string_num=args[0];
        int num=Integer.parseInt(string_num);
        //String grade=(num >= 90 && num<=100)?"A":((num >= 80)? "B": ((num >=70)? "c": ((num >=60)?"D": "F")));
        String grade=(num >= 90 && num<=100)?"A":(num >= 80 && num <=89)? "B": (num >=70 && num <=79)? "c": (num >=60 && num <=69)?"D": "F";
        System.out.println("Grade: "+grade);

    }
}
