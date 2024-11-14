import java.util.*;


public class q4{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the string");
        String s1 = obj.nextLine();
        System.out.println("enter the character to be removed");
        String s2 = obj.nextLine();
        System.out.println(s1.replace(s2,""));
           
       
        obj.close();
       
    }
}
