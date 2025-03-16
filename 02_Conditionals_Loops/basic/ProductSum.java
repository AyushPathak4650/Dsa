// Subtract Product & Sum of Digits

public class ProductSum {
    public static void main(String[] args) {
        int n = 3546;
        int sum = 0;
        int product = 1;
        while (n > 0){
                sum += (n % 10);
                product *= (n % 10);
                n /= 10;  
            }
            System.out.println(product - sum); 
    }
}

// LeetCode : https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/post-solution/?submissionId=1574639957