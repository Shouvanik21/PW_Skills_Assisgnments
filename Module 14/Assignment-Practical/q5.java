import java.util.*;

public class q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();


        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
            System.out.println("enter the element");
            arr[i] = sc.nextInt();
        }

        for(int a : arr ){
            System.out.print(a+",");
        }
        sc.close();
    }
}
