/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
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
    ListNode left;
    public boolean isPalindrome(ListNode head) {
        left=head;
        return check(head);

    }
    public boolean check(ListNode node){
        if(node==null)return true;

        boolean ans=check(node.next);
        boolean ex=(left.val==node.val)?true:false;
        left=left.next;
        return ans&&ex;
    }
}
// @lc code=end

