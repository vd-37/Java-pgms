package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

class Pair {
    int num;
    TreeNode node;

    public Pair(TreeNode node) {
        this.node = node;
        this.num = 1;
    }
}

public class Node{
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List < Integer > pre = new ArrayList<>();
        List < Integer > in = new ArrayList <> ();
        List< Integer > post = new ArrayList <> ();
        allTraversal(root, pre, in, post);
        System.out.println(pre.equals(in));
        System.out.println(pre);
        System.out.println(in);
        System.out.println(post);
    }

    public static void allTraversal(TreeNode root, List<Integer> pre, List<Integer> in, List<Integer> post){
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root));
        if (root == null)
            return;
        while(!stack.isEmpty()){
            Pair it = stack.pop();
            if(it.num == 1){
                pre.add(it.node.val);
                it.num++;
                stack.push(it);
                if(it.node.left != null)
                    stack.push(new Pair(it.node.left));
            }
            else if(it.num == 2){
                in.add(it.node.val);
                it.num++;
                stack.push(it);
                if(it.node.right != null)
                    stack.push(new Pair(it.node.right));
            }
            else if(it.num == 3){
                post.add(it.node.val);
            }
        }
    }
}
