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

public class q3 {
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

    public static boolean findPair(TreeNode root, int target, Set<Integer> set)
    {
        // base case
        if (root == null) {
            return false;
        }
 
        // return true if pair is found in the left subtree; otherwise, continue
        // processing the node
        if (findPair(root.left, target, set)) {
            return true;
        }
 
        // if a pair is formed with the current node, print the pair and return true
        if (set.contains(target - root.data))
        {
            System.out.println("Pair found (" + (target - root.data) + ", "
                                    + root.data + ")");
            return true;
        }
 
        // insert the current node's value into the set
        else {
            set.add(root.data);
        }
 
        // search in the right subtree
        return findPair(root.right, target, set);
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

        System.out.println("enter the target:");
        int target=sc.nextInt();
        Set<Integer> set = new HashSet<>();
 
        if (!findPair(root, target, set)) {
            System.out.println("Pair does not exist");
        }
    }
}
