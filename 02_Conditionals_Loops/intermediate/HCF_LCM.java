// HCF & LCM of Two Numbers

import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {
        System.out.print("Enter numbers: ");
        Scanner in  = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        in.close();

        int q;
        int d;
        if (num1 > num2){
            q = num1;
            d = num2;
        } else{
            q = num2;
            d = num1;
        }

        int remainder = 1;
        while(remainder != 0){
            remainder = q % d;
            q = d;
            d = remainder;
        }
        int hcf = q;

        int lcm = num1 * num2/hcf;

        System.out.printf("HCF and LCM: %d %d", hcf, lcm);

    }
}
