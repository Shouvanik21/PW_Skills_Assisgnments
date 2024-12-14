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

public class q5 {
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

    public static boolean search(TreeNode root, TreeNode key)
    {
        // traverse the tree and search for the key
        while (root != null)
        {
            // if the given key is less than the current node, go to the left
            // subtree; otherwise, go to the right subtree
 
            if (key.data < root.data) {
                root = root.left;
            }
            else if (key.data > root.data) {
                root = root.right;
            }
            // if the key is found, return true
            else if (key.data == root.data) {
                return true;
            }
            else {
                return false;
            }
        }
 
        // we reach here if the key is not present in the BST
        return false;
    }

    public static TreeNode LCARecursive(TreeNode root, TreeNode x, TreeNode y)
    {
        // base case: empty tree
        if (root == null) {
            return null;
        }
 
        // if both `x` and `y` is smaller than the root, LCA exists in the
        // left subtree
        if (root.data > Integer.max(x.data, y.data)) {
            return LCARecursive(root.left, x, y);
        }
 
        // if both `x` and `y` are greater than the root, LCA exists in the
        // right subtree
        else if (root.data < Integer.min(x.data, y.data)) {
            return LCARecursive(root.right, x, y);
        }
 
        // if one key is greater (or equal) than the root and one key is
        // smaller (or equal) than the root, then the current node is LCA
        return root;
    }

     public static void LCA(TreeNode root, TreeNode x, TreeNode y)
    {
        // return if the tree is empty or `x` or `y` is not present
        // in the tree
        if (root == null || !search(root, x) || !search(root, y)) {
            return ;
        }
 
        // `lca` stores the lowest common ancestor of `x` and `y`
        TreeNode lca = LCARecursive(root, x, y);
 
        // if the lowest common ancestor exists, print it
        if (lca != null) {
            System.out.println("LCA is " + lca.data);
        }
        else {
            System.out.println("LCA does not exist");
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
        System.out.println("enter the value of x:");
        int x=sc.nextInt();
        System.out.println("enter the value of y:");
        int y=sc.nextInt();

        LCA(root, new TreeNode(x), new TreeNode(y));
    }
}
