public class Lab005_literals {

    public static void main(String[] args)
    {
        char c='a';
        //char c='an'; wont work
        boolean b=true;

        char new_line='\n';
        char back_space='\b';
        char tab='\t';
        char carriage_return='\r';
        System.out.println("Hello"+new_line+"java");
        System.out.printf("Hello %b java\n",true);
        System.out.printf("Hello %s java\t",true);
        System.out.println("Hello \n java");
        System.out.println("Hello\b java");
        System.out.println("Hello " +carriage_return + "java");
    }
}
