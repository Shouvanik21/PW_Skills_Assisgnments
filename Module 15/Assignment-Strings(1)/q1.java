import java.util.*;


public class q1{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the string to be reversed");
        String s1 = obj.nextLine();
        String rev = "";
        for(int i=s1.length()-1;i>=0;i--){
            rev = rev + s1.charAt(i);
        }
        System.out.println(rev);
        obj.close();
       
    }
}
