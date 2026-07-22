package common;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(){};
    public ListNode(int val){this.val=val;}
    public ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;
    }


    public static ListNode createListNode(int[] arr){
        if(arr==null || arr.length==0){ return null;}

        ListNode dummy=new ListNode();
        ListNode cur=dummy;
        for(int num:arr){
            cur.next=new ListNode(num);
            cur=cur.next;
        }
        return dummy.next;
    }
}
