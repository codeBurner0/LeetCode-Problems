/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode res=head;
        ListNode temp=new ListNode(0);
        ListNode ans=temp;
        if(head==null){
            return ans.next;
        }
        while(res.next!=null){
            if(res.val!=res.next.val){
                temp.next=new ListNode(res.val);
                temp=temp.next;
            }
            res=res.next;
        }
        temp.next=new ListNode(res.val);
        return ans.next;
    }
}