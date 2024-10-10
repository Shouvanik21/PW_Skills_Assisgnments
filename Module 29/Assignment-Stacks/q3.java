import java.util.*;

public class q3 {
    public static int totalScore(String[] str) {
        int sum = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i < str.length; i++)
        {
            if(str[i].equals("+"))
            {
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                int temp_sum = temp1 + temp2;
                sum += temp_sum;
                stack.push(temp2);
                stack.push(temp1);
                stack.push(temp_sum);
            }
            else if(str[i].equals("D"))
            {
                int temp = stack.pop();
                int temp_d = 2 * temp;
                sum += temp_d;
                stack.push(temp);
                stack.push(temp_d);
            }
            else if(str[i].equals("C"))
            {
                int cancel = stack.pop();
                sum -= cancel;
            }
            else
            {
                int temp = Integer.parseInt(str[i]);
                sum += temp;
                stack.push(temp);   
            }
            }
            return sum;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");          
        int len= sc.nextInt();

        String[] arr = new String[len];

        System.out.print("Enter the elements of array: ");  
        for(int i=0;i<len;i++){
            arr[i] = sc.next();
        }

        System.out.println("the score is: "+totalScore(arr));
        
        sc.close();
    }
}
