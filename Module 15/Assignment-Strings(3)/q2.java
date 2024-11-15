import java.util.*;


public class q2{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the string to be reversed");
       String s1 = sc.nextLine();
       String rev = "";
       for(int i=s1.length()-1;i>=0;i--){
        rev = rev + s1.charAt(i);
       }
       System.out.println("the reversed string is "+rev);
       sc.close();
    }
}
