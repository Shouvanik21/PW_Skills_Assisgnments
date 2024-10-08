import java.util.*;

public class q3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the integer:");
        int num=sc.nextInt();

        if((num&1)==1){
            System.out.println("the number is odd");
        }
        else{
            System.out.println("the number is even");
        }

        sc.close();
    }
}
