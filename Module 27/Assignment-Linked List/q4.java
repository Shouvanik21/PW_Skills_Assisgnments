import java.util.*;

public class q4 {
    class Node {
    	int data;
    	Node next;
	    Node(int d)	{
		data = d;
		next = null;
	    }
    }
    static Node head;

    public void push(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }

    public static Node reverseLinkedList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseLinkedList(head.next);        
        Node front = head.next;        
        front.next = head;        
        head.next = null;        
        return newHead;
    }
    
    public static boolean isPalindrome(Node head) {
       
        if (head == null || head.next == null) {
            return true;
        }           
        Node slow = head;
        Node fast = head;          
        while (fast.next != null && fast.next.next != null) {            
            slow = slow.next;             
            fast = fast.next.next;
        }           
        Node newHead = reverseLinkedList(slow.next);          
        Node first = head;          
        Node second = newHead;
        while (second != null) {            
            if (first.data != second.data) {                              
                reverseLinkedList(newHead);                   
                return false;
            }               
            first = first.next;               
            second = second.next;
        }           
        reverseLinkedList(newHead);          
        return true;
    }

    public static void main(String[] args) {
        q4 list=new q4();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of nodes");
        int len=sc.nextInt(),n=0;

        System.out.println("enter the elements for the nodes: ");
        for(int i=0;i<len;i++){
            n=sc.nextInt();
            list.push(n);
        }

        if (isPalindrome(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }

        sc.close();
    }
}
