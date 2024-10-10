import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no of key-value pairs:");
        int n=sc.nextInt();

        HashMap<String,Integer> mp=new HashMap<>();

        System.out.println("enter the key-value pairs:");
        for(int i=0;i<n;i++){
            String key=sc.next();
            int value=sc.nextInt();
            mp.put(key,value);
        }

        System.out.println("the hashmap is: "+mp);
        sc.close();
    }
}
