import java.util.*;

public class q3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the length of the array:");
        int len=sc.nextInt();

        int arr[]=new int[len];

        System.out.println("enter the elements of the array:");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }

        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        System.out.println("the maximum element is: "+maxi);

        sc.close();
    }
}
