class Add{
    public int add1(int n1,int n2){
        int res1 = n1+n2;
        return res1;
    }


     public int add1(int n1,int n2, int n3){
        int res2 = n1+n2+n3;
        return res2;
    }
}
public class q1{
     public static void main(String []args){


         Add obj = new Add();
         System.out.println(obj.add1(3,4));
         System.out.println(obj.add1(3,4,5));
     }
}
