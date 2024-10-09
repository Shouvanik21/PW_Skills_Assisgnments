import java.util.*;

public class q3 {
    class Node {
        int data;
        Node next;
    };

    static Node head;

    q3(){
        head = null;
    }

    void push_back(int newElement) {
        Node newNode = new Node();
        newNode.data = newElement;
        newNode.next = null; 
        if(head == null) {
          head = newNode;
        } else {
          Node temp = new Node();
          temp = head;
          while(temp.next != null)
            temp = temp.next;
          temp.next = newNode;
        }    
      }
    
      static void deleteDuplicates() {
        if(head == null || head.next == null)
            return ;
        Node curr = head;
        
        while( curr != null && curr.next != null){
           
            if(curr.data == curr.next.data){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next; 
            }
        }
        return;
    }
    
      //display the content of the list
      void PrintList() {
        Node temp = new Node();
        temp = this.head;
        if(temp != null) {
          while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
          }
          System.out.println();
        } else {
          System.out.println("The list is empty.");
        }
      }    
    
      public static void main(String[] args) {
        q3 list = new q3();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of nodes");
        int len=sc.nextInt(),n=0;

        System.out.println("enter the elements for the nodes: ");
        for(int i=0;i<len;i++){
            n=sc.nextInt();
            list.push_back(n);
        }

        System.out.print("The list initially contains: ");
        list.PrintList();
        deleteDuplicates();
        System.out.print("The list finally contains: ");
        list.PrintList();

        sc.close();
      }
}
