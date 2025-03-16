// Palindrome Number Check
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        in.close();
        
        long n = num;
        long rev = 0;
        while(n > 0){
            rev *= 10;
            rev += (n % 10);
            n /= 10;
        }
        if (rev == num){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not Palindrome");
        }
    }
}
