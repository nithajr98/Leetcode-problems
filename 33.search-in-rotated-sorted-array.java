/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int peak=0;
        int n=nums.length;
        int l=0;
        int r = n-1;
        
        while(l<r){
            int middle = l+ (r-l)/2;

            if(nums[middle]>nums[r]){
                l=middle+1;
            }else{
                r=middle;
            }
            

        }
        int rot =l;
        l=0;
        r=n-1;
        while(l<=r){
            int mid = (l+r)/2;
            int middle = (rot+mid)%n;
            if(nums[middle]==target){
                return middle;
            }
            else if(nums[middle]>target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return -1;
    }
}
// @lc code=end

