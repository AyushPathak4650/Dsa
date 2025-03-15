// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;

public class calculator {
    public static void main( String args[]){
        System.out.print("Enter Equation: ");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        char oper = in.next().charAt(0);
        int num2 = in.nextInt();

        System.out.print("Answer: ");
        if(oper == '+'){
            System.out.println(num1 + num2);
        } else if(oper == '-'){
            System.out.println(num1 - num2);
        } else if(oper == '*'){
            System.out.println(num1 * num2);
        } else if(oper == '/'){
            if (num2 != 0){
                System.out.println(num1 / num2);
            }
            else{
                System.out.println("Division not possible");
            }
        } else{
            System.out.println("Invalid");
        }
        in.close();
    }
}
