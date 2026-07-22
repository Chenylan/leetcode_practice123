package treenode;

import common.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Leetcode94 {
    public static void main(String[] args) {


        TreeNode treeNode = TreeNode.buildTree();
        List<Integer> integers = inorderTraversal(treeNode);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }


    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Deque<TreeNode> stk = new LinkedList<TreeNode>();
        while (root != null || !stk.isEmpty()) {
            while (root != null) {
                stk.push(root);
                root = root.left;
            }
            root = stk.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }


}
