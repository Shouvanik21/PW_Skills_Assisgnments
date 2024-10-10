import java.util.*;

public class q2 {
    public static int func(int n,int i){
        if(i == n + 1)return 0;
        if(i%2 == 0)return func(n , i + 1) - i;
        else return func(n , i + 1) + i;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        System.out.println("the sum is: "+func(num,1));
        sc.close();
    }
}
