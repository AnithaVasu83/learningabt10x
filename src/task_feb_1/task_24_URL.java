package task_feb_1;

import java.util.Scanner;

public class task_24_URL {
    //Determine the Type of Website Based on Domain (.com, .org, .edu, etc.)
    //
    //           :- take the Site URL input from the user
    //
    //Example Scenarios
    //
    //Input: example.com
    //
    //Output: The website type is: Commercial website
    //
    //Input: example.org
    //
    //Output: The website type is: Non-profit organization
    //
    //Input: example.edu
    //
    //Output: The website type is: Educational institution
    //
    //Input: example.gov
    //
    //Output: The website type is: Government website
    //
    //Input: example.net
    //
    //Output: The website type is: Network-related website
    //
    //Input: example.info
    //
    //Output: The website type is: Informational website
    //
    //Input: example.xyz
    //
    //Output: The website type is: Unknown or other types of websites
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the URL: ");
        String str=sc.nextLine();
        if(str.contains(".com"))
            System.out.println("The website type is: commercial website");
        else if(str.contains(".org"))
            System.out.println("The website type is: Non profit organisation");
        else if(str.contains(".edu"))
            System.out.println("The website type is: educational institution");
        else if(str.contains(".gov"))
            System.out.println("The website type is: government website");
        else if(str.contains(".net"))
            System.out.println("The website type is: network-related website");
        else if(str.contains(".info"))
            System.out.println("The website type is: information website");
        else if(str.contains(".xyz"))
            System.out.println("The website type is: unknown website");
    }
}
