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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode start=null;
        ListNode curr=head;
        int ans=0;
        while(fast!=null){
            fast=fast.next.next; 
            curr=slow;
            slow=slow.next;
            curr.next=start;
            start=curr;
        }
        while(slow!=null){
            ans=Math.max(ans,start.val+slow.val);
            slow=slow.next;
            start=start.next;
        }
        return ans;
    }
}