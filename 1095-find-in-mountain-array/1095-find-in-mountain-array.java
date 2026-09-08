/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray nums) {
        int left = 0; 
        int right = nums.length() - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums.get(mid) > nums.get(mid+1)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        int peak = left;
        left = 0;
        right = peak;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums.get(mid) == target){
                return mid;
            }
            if(nums.get(mid) < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        left = peak + 1;
        right = nums.length() - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums.get(mid) == target){
                return mid;
            }
            if(nums.get(mid) > target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
}