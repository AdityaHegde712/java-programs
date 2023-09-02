import java.util.*;

public class Armstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Finding the length of n
        int temp = n;
        int len = 0;
        while (temp > 0) {
            len++;
            temp /= 10;
        }

        // Finding the sum of the digits raised to the power of the length
        temp = n;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, len);
            temp /= 10;
        }

        if (sum == n) System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }
}
