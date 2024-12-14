import java.util.*;

public class q5 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineMap = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }
        
        for (char c : ransomNote.toCharArray()) {
            if (!magazineMap.containsKey(c) || magazineMap.get(c) == 0) {
                return false;
            } else {
                magazineMap.put(c, magazineMap.get(c) - 1);
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the RansomNote String: ");          
        String s1=sc.nextLine();

        System.out.print("Enter the Magazine String: ");          
        String s2=sc.nextLine();

        boolean ans=canConstruct(s1,s2);
        System.out.println(ans);

        sc.close();    
    }
}
