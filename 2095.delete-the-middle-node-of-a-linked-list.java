/*
 * @lc app=leetcode id=2095 lang=java
 *
 * [2095] Delete the Middle Node of a Linked List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;

        if (head.next == null) {
            return null;
        }
        if (fast.next.next == null) {
            head.next = null;
            return head;
        }
        while (fast.next != null && fast.next.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
            // System.out.println(" slow "+slow.val+" fast "+fast.val);
        }
        if (fast.next != null) {
            slow.next = slow.next.next;
        } else {
            prev.next = slow.next;
        }
        return head;

    }
}
// @lc code=end
