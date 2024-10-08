import java.util.*;

public class q3 {
    public static void insertionSort(int arr[]){
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] > arr[j - 1]) {
                // Swap the values
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
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

        insertionSort(arr);

        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
