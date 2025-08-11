/*
 * @lc app=leetcode id=203 lang=java
 *
 * [203] Remove Linked List Elements
 */

// @lc code=start
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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }
        
        
        while(head!=null&&head.val==val){
            head=head.next;
        }
        if(head==null){
            return head;
        }
        ListNode res=head;
        ListNode pre=head;
        head=head.next;
        while(head!=null){
            if(head.val==val){
                if(head.next!=null){
                    pre.next=head.next;
                    head=head.next;
                    continue;

                }else{
                    pre.next=null;
                }
                
            }
            head=head.next;
            pre=pre.next;
        }
        return res;
        
    }
}
// @lc code=end

