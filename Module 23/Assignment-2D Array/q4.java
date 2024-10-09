import java.util.*;

public class q4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no of rows of the array:");
        int r=sc.nextInt();
        System.out.println("enter the no of columns of the array:");
        int c=sc.nextInt();

        int arr[][]=new int[r][c];

        System.out.println("enter the elements of the array:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                maxi=Math.max(maxi,arr[i][j]);
            }
        }
        System.out.println("the maximun element is: "+maxi);
        sc.close();
    }
}
