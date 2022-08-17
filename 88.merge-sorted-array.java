/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    int tail1=m-1,tail2=n-1,pos=m+n-1;
    while(tail1>=0 && tail2>=0){
        nums1[pos--]=nums1[tail1]>nums2[tail2]?nums1[tail1--]:nums2[tail2--];
        
    }
    while(tail2>=0){
        nums1[pos--]=nums2[tail2--];
    }
}
}
// @lc code=end

