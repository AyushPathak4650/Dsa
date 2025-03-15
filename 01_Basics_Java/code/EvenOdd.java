// Write a program to print whether a number is even or odd, also take input from the user.
import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args){
        System.out.print("Enter Number: ");
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        if (in.nextInt() % 2 == 0){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }
    }
}