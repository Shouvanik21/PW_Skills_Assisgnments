import java.util.*;

class Node
{
    int key;
    Node left = null, right = null;
 
    Node(int key) {
        this.key = key;
    }
}

public class q3 {
    public static void reverseLevelOrderTraversal(Node root){
        if (root == null) {
            return;
        }

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);

        // create a stack to reverse level order nodes
        Deque<Integer> stack = new ArrayDeque<>();

        // to store the current node
        Node curr;
 
        // loop till queue is empty
        while (!queue.isEmpty())
        {
            // process each node in the queue and enqueue their children
            curr = queue.poll();
 
            // push the current node into the stack
            stack.push(curr.key);
 
            // it is important to process the right node before the left node
            if (curr.right != null) {
                queue.add(curr.right);
            }
 
            if (curr.left != null) {
                queue.add(curr.left);
            }
        }
 
        // pop all nodes from the stack and print them
        while (!stack.isEmpty()) {
            System.out.print(stack.poll() + " ");
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left=new Node(7);
        root.right.left.right=new Node(8);
 
        reverseLevelOrderTraversal(root);
    }
}
