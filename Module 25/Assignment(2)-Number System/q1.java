import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (num == 0) {
            System.out.println("Binary representation of 0 is: 0");
        } else {
            StringBuilder binaryString = new StringBuilder();
            int n = num;
            while (n > 0) {
                binaryString.insert(0, n % 2);
                n /= 2;
            }
            System.out.println("Binary representation of " + num + " is: " + binaryString);
        }
        sc.close();
    }
}
