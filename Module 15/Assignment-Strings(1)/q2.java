import java.util.*;


public class q2{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the string to be checked");
        String s1 = obj.nextLine();
        String rev = "";
        for(int i=s1.length()-1;i>=0;i--){
            rev = rev + s1.charAt(i);
        }
        if(s1.equals(rev)){
            System.out.println("the string "+s1+" is a palindrome string");
        }
        else{
            System.out.println("the string "+s1+" is not a palindrome string");
        }
        obj.close();
       
    }
}
