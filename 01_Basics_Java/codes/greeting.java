// Take name as input and print a greeting message for that particular name.
import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner in = new Scanner(System.in);
        System.out.println("Hello " + in.nextLine() + "!");
        in.close();
    }
}