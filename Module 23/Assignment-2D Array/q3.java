import java.util.*;

public class q3 {
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

        System.out.println("the elements that are present on both the diagonals are:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j){
                    System.out.print(arr[i][j]+" ");
                }
                else if(i+j==r-1){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        sc.close();
    }
}
