/*
 * @lc app=leetcode id=220 lang=java
 *
 * [220] Contains Duplicate III
 */

// @lc code=start
class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        boolean result = false;
        int window = indexDiff;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < i + window; j++) {
                if (nums[i] <= nums[j]) {
                    return true;
                }
            }

        }
        return result;
    }
}
// @lc code=end
