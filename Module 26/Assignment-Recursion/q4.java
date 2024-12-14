import java.util.*;

public class q4 {
    public static int sumOfElements(int arr[],int idx){
        if(idx==0){
            return arr[idx];
        }
        return arr[idx]+ sumOfElements(arr, idx-1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int len=sc.nextInt();

        int arr[]=new int[len];

        System.out.println("enter the elements of the array:");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the sum of the elements is: "+sumOfElements(arr,len-1));
        sc.close();
    }
}
