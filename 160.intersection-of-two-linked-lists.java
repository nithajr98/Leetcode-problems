/*
 * @lc app=leetcode id=160 lang=java
 *
 * [160] Intersection of Two Linked Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;
        while(tempA!=tempB){
            tempA=tempA!=null?tempA.next:headB;
            tempB=tempB!=null?tempB.next:headA;
        }
        // while(tempA!=null){
        //     tempB=headB;
        //     while(tempB!=null){
        //         if(tempB==tempA){
        //             return tempA;
        //         }
        //         tempB=tempB.next;
        //     }
        //     tempA=tempA.next;
        // }
        return tempA;
    }
}
// @lc code=end

