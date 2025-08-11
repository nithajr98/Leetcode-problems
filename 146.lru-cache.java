import java.util.HashMap;

/*
 * @lc app=leetcode id=146 lang=java
 *
 * [146] LRU Cache
 */

// @lc code=start
class LRUCache {
    HashMap<Integer,ArayList<Integer>> x; 
    public LRUCache(int capacity) {
        x=new HashMap<Integer,ArrayList<Integer>>(capacity);
    }
    public LRUCache() {
        x=new HashMap<>();
    }
    
    public int get(int key) {
        return x.containsKey(key)?x.get(key):-1;
    }
    
    public void put(int key, int value) {
        HashMap<Integer,Integer> val = new HashMap<>();
        val.put()
        x.put(key,value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
// @lc code=end

