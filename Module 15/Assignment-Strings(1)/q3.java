import java.util.*;


public class q3{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the string to be converted");
        String s1 = obj.nextLine();
        String conv = "";
        for(int i=0;i<s1.length();i++){
           if(Character.isUpperCase(s1.charAt(i))){
            conv = conv + Character.toLowerCase(s1.charAt(i));
           }
           else if(Character.isLowerCase(s1.charAt(i))){
            conv = conv + Character.toUpperCase(s1.charAt(i));
           }
           
        }
        System.out.println("the converted string is "+conv);
        obj.close();
       
    }
}
