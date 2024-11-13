import java.util.*;
public class q3{
     public static void main(String []args){
       
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the size of the array");
      int n = sc.nextInt();


      int arr[] = new int[n];
     
      for(int i=0;i<n;i++){
        System.out.println("enter the element");
        arr[i] = sc.nextInt();
      }


      int sum=0;


      for(int a : arr){
        sum = sum + a;
      }
      System.out.println(sum);

      sc.close();
    }
}
