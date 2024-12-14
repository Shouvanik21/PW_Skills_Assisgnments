import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the length of the array:");
        int len=sc.nextInt();

        int arr[]=new int[len];

        System.out.println("enter the elements of the array:");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }

        int sum=0;
        for(int i=0;i<len;i++){
            if(i%2==0){
                sum+=arr[i];
            }
        }

        System.out.println("the sum of the elements is: "+sum);
        sc.close();
    }
}
