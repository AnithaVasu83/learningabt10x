package task_interview;
// Given a String “amit is an automation developer“ count the occurrence of each character and replace the character by the no of times it occurred in the String
//- Output of above string should be  “4233 31 42 4133243332 131313131“

public class String_char_occurance {
    public static void main(String[] args){
     String str1="Anitha is an automation developer";
     String str=str1.toLowerCase();
     StringBuilder sb=new StringBuilder();
     int count;
     for(int i=0;i<str.length();i++)//iterate through the string
     {
         char ch=str.charAt(i);
         if(ch==' ')
         {
             sb.append(' ');
         }
         else
         {
             count=0;
             for(int j=0;j<str.length();j++)//for specific character 'a' occurance this will increase the count.
             {
             if(str.charAt(j)==ch)
                 count++;
             }
         sb.append(count);
         }
     }
     String newStr=sb.toString();
        System.out.println(newStr);
    }
}
