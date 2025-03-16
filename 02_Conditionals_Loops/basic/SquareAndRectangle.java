// Area & Perimeter of Rectangle & Square

import java.util.Scanner;

public class SquareAndRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("For Square \nLength of Side: ");
        
        int side = in.nextInt();
        System.out.println("Area = " + side * side);
        System.out.println("Perimeter = " + 4 * side);

        System.out.print("For Rectangle \nLength and Bredth: ");
        int len = in.nextInt();
        int bre = in.nextInt();
        in.close();
        System.out.println("Area = " + len * bre);
        System.out.println("Perimeter = " + 2* (len + bre));
    }
}
