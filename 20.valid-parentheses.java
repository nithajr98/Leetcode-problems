import java.util.Stack;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stack.add(s.charAt(i));
                continue;
            }
            if(stack.isEmpty()){
                return false;
            }
            if(!stack.isEmpty()){
                Character x= stack.peek();
                
            switch(s.charAt(i)){
                case ')':
                    if(x=='('){
                        stack.pop();
                    }else{
                        return false;
                    }
                    break;
                case '}':
                    if(x=='{'){
                        stack.pop();
                    }else{
                        return false;
                    }
                    break;
                case ']':
                    if(x=='['){
                        stack.pop();
                    }else{
                        return false;
                    }
            }
            }
            
            
                


        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
        
    }
}
// @lc code=end

