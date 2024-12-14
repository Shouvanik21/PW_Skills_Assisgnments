import java.util.*;

public class q1 {
    public static int addDigits(int n){
        if(n==0){
            return 0;
        }
        return((n%10)+(addDigits(n/10)));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        System.out.println("the sum of the digits of the number "+num+" is "+addDigits(num));
        sc.close();
    }
}
