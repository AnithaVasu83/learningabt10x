package task_31;

public class task_15_3 {
    //input:this is india.  output:india is this
    public static void main(String[] args) {
        String str = "this is India";
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        String str1 = null;
        for(int i = words.length- 1; i >= 0; i--) {//length is used for arrays.length() is used for string.
            str1 = sb.append(words[i]).append(" ").toString();

        }
        System.out.println("New output: " + str1);
    }
}
