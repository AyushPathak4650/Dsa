// Find the maximum and minimum among three numbers.

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        System.out.print("Enter 3 Numbers: ");
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        in.close();

        System.out.println("MAXIMUM: " + Maximum_Number(a,b,c));
        System.out.println("MINIMUM: " + Minimum_Number(a,b,c));
        
    }

    static double Maximum_Number(double x, double y, double z){
        double maximum = x;
        if (maximum < y){
            maximum = y;
        }
        if (maximum < z){
            maximum = z;
        }
        return maximum;
    }
    static double Minimum_Number(double x, double y, double z){
        double minimum = x;
        if (minimum > y){
            minimum = y;
        }
        if (minimum > z){
            minimum = z;
        }
        return minimum;
    }
}
