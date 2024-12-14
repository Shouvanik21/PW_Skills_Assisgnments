class Concat{
    public String cnct(String s1,String s2){
        String res = s1 + s2;
        return res;
    }
}
public class q2{
    public static void main(String []args){
        Concat obj = new Concat();
        System.out.println(obj.cnct("Physics","Wallah"));
    }
}
