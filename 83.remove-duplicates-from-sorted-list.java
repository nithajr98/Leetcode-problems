/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode h =head;
        ListNode res=head;
        while(head!=null){
            ListNode same=head;
            if(same.next!=null){
                while(same.next!=null&&same.next.val==same.val){
                
                    same=same.next;
                    
                    
                }
            }
            
            head.next=same.next;
            head=head.next;
        }

       
        return res;
    }
}
// @lc code=end

