/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result =new int[2];

        result[0]=searchFirst(nums,target);
        result[1]=searchLast(nums,target);
        return result;
    }

    int searchFirst(int[]nums,int target){
        int idx=-1;
        int l=0,r=nums.length-1;

        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]>=target){
                r=mid-1;
            }else if(nums[mid]<target){
                l=mid+1;
            }
            if(nums[mid]==target){
                idx=mid;
            }

        }
        return idx; 
    }
    int searchLast(int[]nums,int target){
        int idx=-1;
        int l=0,r=nums.length-1;

        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]>target){
                r=mid-1;
            }else if(nums[mid]<=target){
                l=mid+1;
            }
            if(nums[mid]==target){
                idx=mid;
            }

        }
        return idx; 
    }
}
// @lc code=end

