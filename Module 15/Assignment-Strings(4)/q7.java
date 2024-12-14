public class q7{
    public static void main(String[] args) {
     String s1 = "Hello, have a good day";
     String conv1=" ";
     String conv2=" ";
     for(int i=0;i<s1.length();i++){
        if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u'){
             conv1 = conv1 + s1.charAt(i);
        }
        else{
            conv2 = conv2 + s1.charAt(i);
        }


     }
     System.out.println(conv1);
     
    }
}
