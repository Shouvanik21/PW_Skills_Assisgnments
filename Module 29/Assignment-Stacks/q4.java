import java.util.*;

public class q4 {
    public static int[] asteroidCollision(int[] a) {
        List<Integer> list = new ArrayList<>();
        list.add(a[0]);
        for(int i=1; i<a.length; i++){
            list.add(a[i]);
            int j=list.size()-1;            
            while(j>0 && (list.get(j)<0 && list.get(j-1)>=0)){
                int first = list.remove(list.size()-1);
                int second = list.remove(list.size()-1);
                int third;
                if(Math.abs(first)==Math.abs(second)){                    
                    j=j-2;
                    continue;
                }else if(Math.abs(first)>Math.abs(second)){                 
                    j--;
                    list.add(first);
                }else{                    
                    j--;
                    list.add(second);
                }
            }
        }
        int[] array = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            array[i] = list.get(i);
        }
        return array;        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");          
        int len= sc.nextInt();

        int[] arr = new int[len];

        System.out.print("Enter the elements of array: ");  
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The output is : ");
        
        int []nums = asteroidCollision(arr);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
