import java.util.*;

public class q4 {
    public static int countSetBits(int num){
        int cnt = 0;
        while (num > 0) {
            cnt += num & 1;
            num >>= 1;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the integer:");
        int num=sc.nextInt();

        int ans=countSetBits(num);
        System.out.println("the no of set bits int he given number is: "+ans);

        sc.close();
    }
}
