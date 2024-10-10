import java.util.*;

public class q5 {
    public static boolean isArmstrong(int num) {
        return isArmstrong(num, num, 0, countDigits(num));
    }

    private static boolean isArmstrong(int num, int remaining, int sum, int digits) {
        if (remaining == 0) {
            return sum == num;
        }

        int digit = remaining % 10;
        sum += (int) Math.pow(digit, digits);
        return isArmstrong(num, remaining / 10, sum, digits);
    }

    private static int countDigits(int num) {
        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

        sc.close();
    }
}
