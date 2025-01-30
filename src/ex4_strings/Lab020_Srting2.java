package ex4_strings;

public class Lab020_Srting2 {
    public static void main(String args[]){
      String s1="hello";
      s1=s1.concat(" world");
      System.out.println("string value  :"+ s1);
      //even though s1 value changed the original value still remains in scp since strings are immutable.
    }
}
