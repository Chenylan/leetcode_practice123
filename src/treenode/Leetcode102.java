package treenode;

import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode102 {
    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.buildTree();
//        List<List<Integer>> lists = levelOrder(treeNode);
//        System.out.println(lists);
        List<Integer> integers = levelOrder(treeNode);
        System.out.println(integers);
    }

//
//    public static List<List<Integer>> levelOrder(TreeNode root) {
//        if (root == null) {
//            return List.of();
//        }
//        List<List<Integer>> ans = new ArrayList<>();
//        List<TreeNode> cur = List.of(root);
//        while (!cur.isEmpty()) {
//            List<TreeNode> nxt = new ArrayList<>();
//            List<Integer> vals = new ArrayList<>(cur.size()); // 预分配空间
//            for (TreeNode node : cur) {
//                vals.add(node.val);
//                if (node.left != null)  nxt.add(node.left);
//                if (node.right != null) nxt.add(node.right);
//            }
//            cur = nxt;
//            ans.add(vals);
//        }
//        return ans;
//    }



    public static List<Integer> levelOrder(TreeNode root) {
        if (root == null) {
            return List.of();
        }
        List <Integer> ans = new ArrayList<>();
        List<TreeNode> cur = List.of(root);
        while (!cur.isEmpty()) {
            List<TreeNode> nxt = new ArrayList<>();
            // 预分配空间
            for (TreeNode node : cur) {
                ans.add(node.val);
                if (node.left != null)  nxt.add(node.left);
                if (node.right != null) nxt.add(node.right);
            }
            cur = nxt;
        }
        return ans;
    }





//    public static void levelOrder(TreeNode root) {
//        if (root == null) return;
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while (!queue.isEmpty()) {
//            TreeNode node = queue.poll();
//            System.out.print(node.val + " ");
//
//            if (node.left != null) queue.offer(node.left);
//            if (node.right != null) queue.offer(node.right);
//        }
//    }
}
