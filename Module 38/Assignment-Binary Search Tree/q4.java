import java.util.*;

class TreeNode{
    int data;
    TreeNode left=null,right=null;

    TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class q4 {
    public static TreeNode insert(TreeNode root,int ele){
        if(root==null){
            return new TreeNode(ele);
        }
        if(ele<root.data){
            root.left=insert(root.left, ele);
        }
        if(ele>root.data){
            root.right=insert(root.right,ele);
        }
        return root;
    }

    public static TreeNode findMaximum(TreeNode root)
    {
        while (root.right != null) {
            root = root.right;
        }
 
        return root;
    }

    public static TreeNode findPredecessor(TreeNode root, TreeNode prec, int key)
    {
        // base case
        if (root == null) {
            return prec;
        }
 
        // if a node with the desired value is found, the predecessor is the maximum
        // value node in its left subtree (if any)
        if (root.data == key)
        {
            if (root.left != null) {
                return findMaximum(root.left);
            }
        }
 
        // if the given key is less than the root node, recur for the left subtree
        else if (key < root.data) {
            return findPredecessor(root.left, prec, key);
        }
 
        // if the given key is more than the root node, recur for the right subtree
        else {
            // update predecessor to the current node before recursing
            // in the right subtree
            prec = root;
            return findPredecessor(root.right, prec, key);
        }
        return prec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode root = null;

        System.out.println("enter the no of nodes");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("enter the node values:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            root=insert(root, arr[i]);
        }

        for (int key: arr)
        {
            TreeNode prec = findPredecessor(root, null, key);
 
            if (prec != null)
            {
                System.out.println("The predecessor of node " + key + " is "
                                    + prec.data);
            }
            else {
                System.out.println("The predecessor doesn't exist for node "
                                    + key);
            }
        }
    }
}
