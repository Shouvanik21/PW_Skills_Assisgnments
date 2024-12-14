import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no of key-value pairs:");
        int n=sc.nextInt();

        HashMap<Integer,String> mp=new HashMap<>();

        System.out.println("enter the key-value pairs:");
        for(int i=0;i<n;i++){
            int key=sc.nextInt();
            String value=sc.next();
            mp.put(key,value);
        }

        System.out.println("the hashmap is: "+mp);
        sc.close();
    }
}
