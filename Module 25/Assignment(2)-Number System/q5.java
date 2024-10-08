import java.util.*;

public class q5 {
    public static int findOccuringElement(int arr[]){
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the length of the array:");
        int len=sc.nextInt();

        int arr[]=new int[len];

        System.out.println("enter the elements of the array:");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }

        int ans=findOccuringElement(arr);
        System.out.println("the odd occuring element is: "+ans);
        sc.close();
    }
}
