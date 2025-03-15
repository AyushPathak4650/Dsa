// To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Enter String: ");
        Scanner in = new Scanner(System.in);

        String text = in.next();
        int length = text.length();
        in.close();

        for(int i = 0; i < length; i++){
            if (text.charAt(i) == text.charAt(length - 1 - i)){
                continue;
            } else{
                System.err.println("NOT Palindrome");
                return;
            }
        }
        System.err.println("Palindrome");
        return;

    }
}
