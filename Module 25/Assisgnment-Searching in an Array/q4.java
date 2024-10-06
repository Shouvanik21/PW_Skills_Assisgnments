import java.util.*;

public class q4 {
    public static int lastOccurence(int arr[],int low,int high,int target){
        int flag=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                flag=mid;
                low=mid+1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return flag;
    }

    public static int firstOccurence(int arr[],int low,int high,int target){
        int flag=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                flag=mid;
                high=mid-1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return flag;
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

        System.out.print("enter the target element:");
        int target=sc.nextInt();

        int first=firstOccurence(arr,0,len-1,target);
        int last=lastOccurence(arr,0,len-1,target);

        System.out.println("the target element "+target+" occurs "+(last-first+1)+" times");
    }  
        
}
