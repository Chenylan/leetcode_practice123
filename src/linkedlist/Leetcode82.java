package linkedlist;

import common.ListNode;

public class Leetcode82 {
    public static void main(String[] args) {

    }



    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode cur=dummy;
        while(cur !=null && cur.next!=null && cur.next.next!=null){
            int curval =cur.next.val;
            if (cur.next.next.val==curval){
                while(cur.next!=null && cur.next.val==curval){
                    cur.next=cur.next.next;
                }
            }else{
                cur=cur.next;
            }
        }
        return dummy.next;

    }
}
