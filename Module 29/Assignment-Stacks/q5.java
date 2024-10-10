import java.util.*;

public class q5 {
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int []nge = new int [n]; 
        for(int i=0;i<n;i++)nge[i] = 0;

        Stack<Integer>st = new Stack();
        
		
        for(int i = n-1; i>=0; --i){            
            while(!st.empty() && temperatures[st.peek()] <= temperatures[i]){
                st.pop();	
            }              	            
            if(!st.empty()){
                nge[i] = st.peek()-i;
            }                
            st.push(i);
        }
        return nge;
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
        
        int []nums = dailyTemperatures(arr);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
