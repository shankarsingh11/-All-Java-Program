import java.util.Scanner;
import java.util.Stack;

public class Anagram_Checker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a string name : ");
        String name1= in.nextLine();
        String name2 = in.nextLine();
      //  boolean[] visited = new boolean[name2.length()];

        boolean isAnagram = false;

        if (name1.length() == name2.length() ) {

            for (int i = 0; i <name1.length() ; i++) {
                char c = name1.charAt(i);
                isAnagram = false;
                for (int j = 0; j < name2.length() ; j++) {
                    if (name2.charAt(j) == c) {
                        isAnagram = true;
                        break;
                    }

                }
                if (!isAnagram) {
                    break;
                }

            }

        }
        if (isAnagram){
            System.out.println("Anagram");
        }else
            System.out.println("Not Anagram");

    }
}
