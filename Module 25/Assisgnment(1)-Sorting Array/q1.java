import java.util.*;

public class q1 {
    public static void bubbleSort(int arr[]){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    flag = true;
                    // swap the values
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!flag) {
                return;
            }
        }
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

        bubbleSort(arr);

        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
