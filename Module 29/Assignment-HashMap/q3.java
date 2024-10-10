import java.util.*;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");          
        int len= sc.nextInt();

        int[] arr = new int[len];

        System.out.print("Enter the elements of array: ");  
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int i=0;i<len;i++){
            if(map.containsKey(arr[i])){
                System.out.println("yes");
                ans=1;
                break;
            }
            map.put(arr[i],1);
        }

        if(ans==0){
            System.out.println("No");
        }
        sc.close();
    }
}
