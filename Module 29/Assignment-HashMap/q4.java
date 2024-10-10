import java.util.*;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");          
        int len= sc.nextInt();

        int[] arr = new int[len];

        System.out.print("Enter the elements of array: ");  
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }

        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<len;i++){
            map.put(arr[i],1);
        }

        System.out.println("Majority Element of the map is: "+map.lastEntry().getKey());
    }
}
