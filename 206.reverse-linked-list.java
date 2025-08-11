/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
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
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;

        }else if(head.next.next==null){
            ListNode res=head.next;
            res.next=head;
            head.next=null;
            return res;
        }

        ListNode first=head;
        ListNode second = head.next;
        
        ListNode third = head.next.next;
        first.next=null;
        while(third!=null){
            
            second.next=first;

            first=second;
            second=third;
            third=third.next;
            

        }
        second.next=first;

        return second;

    }
}
// @lc code=end

