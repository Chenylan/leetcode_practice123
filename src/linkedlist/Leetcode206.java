package linkedlist;

import common.ListNode;

public class Leetcode206 {

    //time O(n)  space O(1)
    public static void main(String[] args) {
        Solution solution=new Solution();
        ListNode head = buildList(new int[]{1, 2, 3, 4, 5});
        ListNode listNode = solution.reverseList(head);
        while(listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }

    }


    public static ListNode buildList(int[] arr) {
        if (arr == null || arr.length == 0) return null;

        ListNode dummy = new ListNode(); // 虚拟头节点
        ListNode cur = dummy;

        for (int num : arr) {
            cur.next = new ListNode(num);
            cur = cur.next;
        }
        return dummy.next;
    }

}


class Solution{
    public ListNode reverseList(ListNode head) {
//        ListNode dummy=new ListNode();
//        dummy.next=head;

        ListNode pre=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode nxt=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nxt;
        }

        return pre;

    }
}


