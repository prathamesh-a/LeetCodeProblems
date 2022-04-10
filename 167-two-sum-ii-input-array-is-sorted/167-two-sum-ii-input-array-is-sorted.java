class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int low = 0, high = numbers.length - 1;
        
        while (low < high) {
            
            if ((numbers[low] + numbers[high]) == target) return new int[] {++low, ++high};
            
            if ((numbers[low] + numbers[high]) > target) high--;
            else low++;
        }
        
       return null;
    }
}