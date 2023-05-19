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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res=new ListNode(0);
        ListNode ans=res;
        int v1=0,v2=0;
        while(l1!=null || l2!=null){
            if(l1!=null){
                v1=l1.val;
            }else{
                v1=101;
            }
            if(l2!=null){
                v2=l2.val;
            }
            else{
                v2=101;
            }
            if(v1<v2){
                res.next=new ListNode(v1);
                l1=l1.next;
            }else{
                res.next=new ListNode(v2);
                l2=l2.next;
            }
            res=res.next;
        }
        return ans.next;
    }
}