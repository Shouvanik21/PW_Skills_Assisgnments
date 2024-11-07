import java.util.*;

class TreeNode
{
    int data;
    TreeNode left = null, right = null;
 
    TreeNode(int data) {
        this.data = data;
        this.left=null;
        this.right=null;
    }
}

public class q1 {
    public static TreeNode insert(TreeNode root, int key)
    {
        // if the root is null, create a new node and return it
        if (root == null) {
            return new TreeNode(key);
        }
 
        // if the given key is less than the root node, create the left subtree
        if (key < root.data) {
            root.left = insert(root.left, key);
        }
 
        // if the given key is more than the root node, create the right subtree
        else {
            root.right = insert(root.right, key);
        }
 
        return root;
    }

    public static void searchIterative(TreeNode root, int target)
    {
        // start with the root node
        TreeNode curr = root;
 
        // pointer to store the parent of the current node
        TreeNode parent = null;
 
        // traverse the tree and search for the key
        while (curr != null && curr.data != target)
        {
            // update the parent to the current node
            parent = curr;
 
            // if the given key is less than the current node, go to the left subtree;
            // otherwise, go to the right subtree
            if (target < curr.data) {
                curr = curr.left;
            }
            else {
                curr = curr.right;
            }
        }
 
        // if the key is not present in the key
        if (curr == null)
        {
            System.out.println("Key not found");
            return;
        }
 
        if (parent == null) {
            System.out.println("The node with key " + target + " is root node");
        }
        else if (target < parent.data)
        {
            System.out.println("The given key is the left node of the node with key "
                            + parent.data);
        }
        else {
            System.out.println("The given key is the right node of the node with key "
                            + parent.data);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode root = null;

        System.out.println("enter the no of nodes");
        int n=sc.nextInt();

        System.out.println("enter the node values:");
        for(int i=0;i<n;i++){
            int ele=sc.nextInt();
            root=insert(root, ele);
        }

        //System.out.println(root.data);
        System.out.println("enter the element to be found:");
        int target=sc.nextInt();
 
        searchIterative(root,target);
    }
}
