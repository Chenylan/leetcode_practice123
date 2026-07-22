package linkedlist;

import common.ListNode;

public class Leetcode92 {
    public static void main(String[] args) {
        ListNode listNode = ListNode.createListNode(new int[]{1, 2, 3, 4, 5, 6});
        ListNode reverseListNode = Leetcode92.reverseBetween(listNode, 2, 4);
        while (reverseListNode != null) {
            System.out.print(reverseListNode.val + " ");
            reverseListNode = reverseListNode.next;
        }


    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyHead=new ListNode();
        dummyHead.next=head;
        ListNode p0=dummyHead;
        for(int i=0;i<left-1;i++){p0=p0.next;}

        ListNode cur=p0.next;
        ListNode pre=null;
        for(int i=left;i<right+1;i++){
            ListNode nxt=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nxt;
        }
        p0.next.next=cur;
        p0.next=pre;
        return dummyHead.next;

    }
}
