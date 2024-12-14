import java.util.*;

public class q3 {
    public static int maxValue(int arr[],int len,int idx){
        if(idx==len-1){
            return arr[len-1];
        }
        int maxOfLaterIndices = maxValue(arr,len,idx + 1);
        int maxVal = Math.max(arr[idx], maxOfLaterIndices);
        return maxVal;
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
        System.out.println("the maximum value is: "+maxValue(arr,len,0));
        sc.close();
    }
}
