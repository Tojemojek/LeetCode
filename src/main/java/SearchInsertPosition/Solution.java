package SearchInsertPosition;


//https://leetcode.com/problems/search-insert-position/description/
class Solution {
    public int searchInsert(int[] nums, int target) {

        int i;
        for (i = 0; i < nums.length; i++) {
            if (target < nums[i]) {
                return i;
            }  else if (target == nums[i]) {
                return i;
            }
        }
        return i;
    }
}