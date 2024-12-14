import java.util.*;
public class q4{
     public static void main(String []args){
       
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the size of the array");
      int n1 = sc.nextInt();


      int arr[] = new int[n1];
     
      for(int i=0;i<n1;i++){
        System.out.println("enter the element");
        arr[i] = sc.nextInt();
      }


      System.out.println("enter the element whose index to be found");
      int n2 = sc.nextInt();


      for(int i=0;i<n1;i++){
        if(n2==arr[i]){
           System.out.println("the index of "+n2+" is "+i);
        }
      }
      sc.close();
    }
}
