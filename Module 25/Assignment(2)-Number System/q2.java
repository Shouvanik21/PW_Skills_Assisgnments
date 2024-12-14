import java.util.*;

public class q2 {
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        // Check if n is a power of two
        if (isPowerOfTwo(n)) {
            System.out.println(n + " is a power of two.");
        } else {
            System.out.println(n + " is not a power of two.");
        }

        sc.close();
    }
}
