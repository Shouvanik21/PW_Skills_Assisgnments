import java.util.*;

public class q3 {
    public static int noOfOnes(int arr[],int low,int high){
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==0){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return (arr.length-low);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the length of the array:");
        int len=sc.nextInt();

        int arr[]=new int[len];

        System.out.print("enter the elements of the array in sorted order:");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("The number of one's in the given array is/are: "+ noOfOnes(arr,0,len-1));
    }
}
