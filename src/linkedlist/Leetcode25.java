package linkedlist;

import common.ListNode;

public class Leetcode25 {
    public static void main(String[] args) {
        ListNode listNode = ListNode.createListNode(new int[]{1, 2, 3, 4, 5,6});
        ListNode reverseListNode = Leetcode25.reverseKGroup(listNode, 2);
        while(reverseListNode!=null){
            System.out.println(reverseListNode.val);
            reverseListNode=reverseListNode.next;
        }

    }


    public static ListNode reverseKGroup(ListNode head, int k) {
        int len=0;
        ListNode cur=head;
        while(cur!=null){
            len++;
            cur=cur.next;
        }

        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode p0=dummy;

        while(len>=k){
            len=len-k;
            ListNode pre =null;
            ListNode cur1=p0.next;
            ListNode nxt1;
            for(int i =0;i<k;i++){
                ListNode nxt=cur1.next;
                cur1.next=pre;
                pre=cur1;
                cur1=nxt;
            }
            nxt1=p0.next;  //存下来
            p0.next.next=cur1;
            p0.next=pre;
            p0=nxt1;  //更新p0
            p0=p0.next.next;//这么写也可以

        }

        return dummy.next;


    }
}
