import java.util.*;

class Node
{
    int key;
    Node left = null, right = null;
 
    Node(int key) {
        this.key = key;
    }
}

public class q4 {
    public static void left_View(Node root, int level, Map<Integer, Integer> map){
        // base case
        if (root == null) {
            return;
        }

        map.putIfAbsent(level, root.key);
 
        left_View(root.left, level + 1, map);
        left_View(root.right, level + 1, map);
    }
    public static void leftView(Node root){
        // create an empty HashMap to store the first node for each level
        Map<Integer, Integer> map = new HashMap<>();
 
        // traverse the tree and fill the map
        left_View(root, 1, map);
 
        // iterate through the HashMap in sorted order of its keys
        // and print the left view
        for (int i = 1; i <= map.size(); i++) {
            System.out.print(map.get(i) + " ");
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
 
        leftView(root);
    }
}
