import java.util.Stack;

/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Stack<ListNode> stack= new Stack<ListNode>();
        ListNode res=head;
        

        while(head!=null){
            stack.add(head);
            head=head.next;
        }
        if(stack.size()==1&&n==1){
            res=null;
            return res;
        }
        n=n-1;
        if(n==0){
            stack.pop();
            ListNode rem=stack.pop();
            rem.val=rem.next.val;
            rem.next=rem.next.next;
        return res;
        }
        while(n!=0){
            stack.pop();
            n--;
        }

        ListNode rem=stack.pop();
        rem.val=rem.next.val;
        rem.next=rem.next.next;
        return res;

    }
}
// @lc code=end

