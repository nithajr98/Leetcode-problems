/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> nums1 = Arrays.stream(nums).boxed().collect(Collectors.toList());
        getsubset(new ArrayList<>(), nums1, result);
        return result;
    }

    void getsubset(int[] nums, int index, List<Integer> curList, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(curList);
            return;
        }

        getsubset(nums, index + 1, curList, result);
        curList.add(nums[index]);
        getsubset(nums, index + 1, curList, result);
        curList.remove(curList.size() - 1);
    }
}
// @lc code=end
