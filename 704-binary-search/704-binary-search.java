class Solution {
    public int search(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target) return i;
            if(nums[nums.length-i-1]==target) return (nums.length-i-1);
        }
        return -1;
    }
}