// Reverse a String

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.print("Enter String: ");
        Scanner in = new Scanner(System.in);
        String text = in.next();
        int length = text.length();
        in.close();
        String rev = "";
        for(int i = 0; i < length; i++){
            rev += text.charAt(length - 1 - i);
        
        }
        System.out.print("Reverse String: "); 
        System.out.print(rev);
    }
}
