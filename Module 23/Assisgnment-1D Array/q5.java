import java.util.*;

public class q5 {
    public static int peakElement(int arr[]){
        if(arr.length==0){
            return 0;
        }
        else if(arr[0]>arr[1]){
            return arr[0];
        }
        else{
            int peak=Integer.MIN_VALUE;
            for(int i=1;i<arr.length-1;i++){
                if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
                    if(arr[i]>peak){
                        peak=arr[i];
                    }
                }
            }
            return peak;
        }
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

        int ans=peakElement(arr);
        System.out.println("the peak element is: "+ans);

        sc.close();
    }
}
