import java.util.*;

public class q1 {
    class Node {
    	int data;
    	Node next;
	    Node(int d)	{
		data = d;
		next = null;
	    }
    }
    Node head;

    public void push(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }

    public boolean search(Node head,int target){
        Node temp=head;
        while(temp!=null){
            if(temp.data==target){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        q1 list=new q1();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of nodes");
        int len=sc.nextInt(),n=0;

        System.out.println("enter the elements for the nodes: ");
        for(int i=0;i<len;i++){
            n=sc.nextInt();
            list.push(n);
        }

        System.out.println("enter the element to be searched for:");
        int target=sc.nextInt();

        if(list.search(list.head,target)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

        sc.close();
    }
}
