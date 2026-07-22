package linkedlist;

import common.ListNode;

public class Leetcode141 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        // 2. 连成普通链表: 1 -> 2 -> 3 -> 4
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // 3. 构造环：让 4 指向 2
        // 链表变为: 1 -> 2 -> 3 -> 4 -> 2 -> 3 -> 4 -> 2 ...
        node4.next = node2;

        boolean b = Leetcode141.hasCycle(node1);
        System.out.println(b);

    }


    public static boolean hasCycle(ListNode head) {
        ListNode fastcur=head;
        ListNode slowcur=head;
        while(fastcur!=null && fastcur.next!=null){
            fastcur=fastcur.next.next;
            slowcur=slowcur.next;
            if(fastcur==slowcur){
                return true;
            }
        }
        return false;

    }
}
