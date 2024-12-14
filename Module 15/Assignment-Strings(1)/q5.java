public class q5{
    public static void main(String[] args) {
        String strOrig = "pw skills";
          int intIndex = strOrig.indexOf("skills");
         
          if(intIndex == - 1) {
             System.out.println("Not found");
          } else {
             System.out.println("Found at index " + intIndex);
          }
    }
}
