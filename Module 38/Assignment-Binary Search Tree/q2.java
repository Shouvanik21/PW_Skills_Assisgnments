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

public class q2 {
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

    public static ArrayList<Integer> inOrderTraversal(TreeNode root,ArrayList<Integer> ans){
        if(root==null){
            return ans;
        }
        inOrderTraversal(root.left,ans);
        ans.add(root.data);
        inOrderTraversal(root.right,ans);
        return ans;
    }

    public static int kthLargest(TreeNode root, int k) {
        ArrayList<Integer> ls=inOrderTraversal(root,new ArrayList<>());
        return ls.get(ls.size()-k);
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

        System.out.println("enter the value of k:");
        int k=sc.nextInt();

        int result=kthLargest(root,k);
        System.out.println("the "+k+" th largest node is "+result);
    }
}
