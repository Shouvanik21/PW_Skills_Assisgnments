class Node{
    int key;
    Node left=null,right=null;

    Node(int data){
        this.key=data;
    }
}

public class q1 {
    public static boolean printLevelLeftToRight(Node root, int level){
        if (root == null) {
            return false;
        }
 
        if (level == 1)
        {
            System.out.print(root.key + " ");
            return true;
        }
 
        // process left child before the right child
        boolean left = printLevelLeftToRight(root.left, level - 1);
        boolean right = printLevelLeftToRight(root.right, level - 1);
 
        return left || right;
    }

    public static boolean printLevelRightToLeft(Node root, int level){
        if (root == null) {
            return false;
        }
 
        if (level == 1)
        {
            System.out.print(root.key + " ");
            return true;
        }
 
        // process right child before the left child
        boolean right = printLevelRightToLeft(root.right, level - 1);
        boolean left = printLevelRightToLeft(root.left, level - 1);
 
        return right || left;
    }

    public static void spiralOrderTraversal(Node root){
        if (root == null) {
            return;
        }
 
        // start from level 1 — till the height of the tree
        int level = 1;
 
        // run till either function returns false
        while (printLevelLeftToRight(root, level++) && printLevelRightToLeft(root, level++));        
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right=new Node(8);

        spiralOrderTraversal(root);
    }
}
