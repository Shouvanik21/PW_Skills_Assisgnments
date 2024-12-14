import java.util.*;

public class q2 {
    public static void selectionSort(int arr[]){
        int n = arr.length;

        for (int i = 0; i < n - 1; i++)
        {
            // Find the maximum element in unsorted part of the array
            int max_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[max_index])
                    max_index = j;
            }
            if (max_index != i) {
                int temp = arr[max_index];
                arr[max_index] = arr[i];
                arr[i] = temp;
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

        selectionSort(arr);

        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
