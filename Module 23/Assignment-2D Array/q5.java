import java.util.*;

public class q5 {
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

        System.out.println("The elements  of the middle row and middle column are : ");        
         for(int i=0;i<r;i++)System.out.print(arr[i][r/2] + "  ");    
         for(int j=0;j<r;j++){
            if(j == r/2)continue;
            System.out.print(arr[r/2][j] + "  ");
        }

        sc.close();
    }
}