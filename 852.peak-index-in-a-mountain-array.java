/*
 * @lc app=leetcode id=852 lang=java
 *
 * [852] Peak Index in a Mountain Array
 */

// @lc code=start
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=0,r=arr.length-1;

        while(l<r){
            int mid=l+(r-l)/2;
            if(arr[mid+1]<arr[mid] &&arr[mid]>arr[mid-1]){
                
                return mid;
            }else if(arr[mid+1]<arr[mid] &&arr[mid]<arr[mid-1]){
                
                r=mid;
                
            }else if(arr[mid+1]>arr[mid] &&arr[mid]>arr[mid-1]){
                l=mid;
                
            }else{
                return -1;
            }
            
            
        }
        return -1;

    }
}
// @lc code=end

