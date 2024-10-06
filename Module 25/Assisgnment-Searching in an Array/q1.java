import java.util.*;

public class q1{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the length of the array:");
        int len=sc.nextInt();

        int arr[]=new int[len];

        System.out.println("enter the elements of the array:");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("enter the target element:");
        int x=sc.nextInt();

        int flag=-1;
        for(int i=0;i<len;i++){
            if(arr[i]==x){
                flag=i;
                break;
            }
        }

        if(flag==-1){
            System.out.println("element not found in array");
        }
        else{
            System.out.println(flag);
        }

        sc.close();

    }
}