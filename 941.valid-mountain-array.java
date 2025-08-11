/*
 * @lc app=leetcode id=941 lang=java
 *
 * [941] Valid Mountain Array
 */

// @lc code=start
// class Solution {
//     public boolean validMountainArray(int[] nums) {
//         int order=1;
//         if(nums.length<3){
//             return false;
//         }
//         for(int i=0;i<nums.length-1;i++){
//             if(nums[i+1]>nums[i]){
//                 order*=1;
//             }else if(nums[i+1]<nums[i]){
//                 order=-1;
//             }

//             if(nums[i]==nums[i+1]){
//                 return false;
//             }else if(nums[i]<nums[i+1] && order ==-1){
//                 return false;
//             }else if(i==nums.length-2 && order ==1 && nums[i+1]>nums[i]){
//                 return false;
//             }else if(i==0 && nums[i+1]<nums[i] ){
//                 return false;
//             }

            
//         }
//         return true;
//     }

// }
class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;
        int l = 0;
        int r = arr.length - 1;
        while(l + 1 < arr.length - 1 && arr[l] < arr[l + 1]) l++;
        while(r - 1 > 0 && arr[r] < arr[r - 1]) r--;
        return l == r;
    }
}

// @lc code=end

