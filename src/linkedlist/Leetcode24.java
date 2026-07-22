package linkedlist;

import common.ListNode;

public class Leetcode24 {
    public static void main(String[] args) {
        ListNode listNode = ListNode.createListNode(new int[]{1, 2, 3, 4, 5,6});
        ListNode listNode1 = Leetcode24.swapPairs(listNode);
        while(listNode1!=null){
            System.out.println(listNode1.val);
            listNode1=listNode1.next;
        }

    }

    public static ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode p0=dummy;



        while(p0.next!=null && p0.next.next!=null){
            ListNode node1=p0.next;
            ListNode node2 =p0.next.next;
            p0.next=node2;
            node1.next=node2.next;
            node2.next=node1;
            p0=node1;
        }
        return dummy.next;


    }
}
