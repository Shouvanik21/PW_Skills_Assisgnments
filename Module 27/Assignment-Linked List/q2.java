import java.util.*;

public class q2 {
    class Node {
        int data;
        Node next;
    };

    Node head;

    q2(){
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
    
      //Inserts a new element at the given position
      void push_at(int newElement, int position) {     
        Node newNode = new Node(); 
        newNode.data = newElement;
        newNode.next = null;
    
        if(position < 1) {
          System.out.print("\nposition should be >= 1.");
        } else if (position == 1) {
          newNode.next = head;
          head = newNode;
        } else {
          
          Node temp = new Node();
          temp = head;
          for(int i = 1; i < position-1; i++) {
            if(temp != null) {
              temp = temp.next;
            }
          }
       
          if(temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;  
          } else {
            System.out.print("\nThe previous node is null.");
          }       
        }
      } 
    
      //display the content of the list
      void PrintList() {
        Node temp = new Node();
        temp = this.head;
        if(temp != null) {
          System.out.print("The list contains: ");
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
        q2 list = new q2();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of nodes");
        int len=sc.nextInt(),n=0;

        System.out.println("enter the elements for the nodes: ");
        for(int i=0;i<len;i++){
            n=sc.nextInt();
            list.push_back(n);
        }
        list.PrintList();

        System.out.println("enter the new element you want to enter:");
        int ele=sc.nextInt();
        System.out.println("enter the position where you want to enter the new element:");
        int pos=sc.nextInt();
    
        list.push_at(ele, pos);   
        list.PrintList();

        sc.close();
      }
}
