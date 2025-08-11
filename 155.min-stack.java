import javax.swing.text.html.MinimalHTMLWriter;

/*
 * @lc app=leetcode id=155 lang=java
 *
 * [155] Min Stack
 */

// @lc code=start
class MinStack {
    private Node head;
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(head==null){
            head=new Node(val,val,null);

        }else{
            head=new Node(val,Math.min(head.min,val),head);
        }
    }
    
    public void pop() {
        head=head.nxt;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
    class Node{
        int val;
        int min;
        Node nxt;
        Node(int val,int min,Node nxt){
            this.val=val;
            this.min=min;
            this.nxt=nxt;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
// @lc code=end

