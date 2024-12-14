import java.util.*;

public class q5 {
    public static boolean isPerfectSquare(int num){
        int flag=-1,low=0,high=num-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            long val=mid*mid;
            if(val==num){
                return true;
            }
            else if(val<num){
                flag=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("enter the element:");
        int num=sc.nextInt();

        System.out.print("The number is a perfect number: "+ isPerfectSquare(num));
    }
}
