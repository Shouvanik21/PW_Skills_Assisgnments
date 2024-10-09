import java.util.*;

public class q4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the length of the array:");
        int len=sc.nextInt();

        int arr[]=new int[len];

        System.out.println("enter the elements of the array:");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }

        int maxi=Integer.MIN_VALUE,second_maxi=Integer.MIN_VALUE;
        if(len<2){
            System.out.println("there is no second largest element");
        }
        for(int i=0;i<len;i++){
            if(arr[i]>maxi){
                second_maxi=maxi;
                maxi=arr[i];
            }
            else if(arr[i]>second_maxi && arr[i]!=maxi){
                second_maxi=arr[i];
            }
        }
        System.out.println("the second largest element is: "+second_maxi);

        sc.close();
    }
}
