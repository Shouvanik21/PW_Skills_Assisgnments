import java.util.*;

public class q1 {
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

        int cnt1=0,cnt2=0,cnt3=0,cnt4=0,cnt5=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]>0){
                    cnt1++;
                }
                if(arr[i][j]<0){
                    cnt2++;
                }
                if(arr[i][j]%2!=0){
                    cnt3++;
                }
                if(arr[i][j]%2==0){
                    cnt4++;
                }
                if(arr[i][j]==0){
                    cnt5++;
                }
            }
        }
        System.out.println("no of positive no: "+cnt1);
        System.out.println("no of negative no: "+cnt2);
        System.out.println("no of odd no: "+cnt3);
        System.out.println("no of even no: "+cnt4);
        System.out.println("no of zeroes: "+cnt5);

        sc.close();
    }
}
