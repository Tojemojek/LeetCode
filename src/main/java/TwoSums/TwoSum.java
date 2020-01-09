package TwoSums;


class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                for (int j = i; j < nums.length; j++) {
                    if (target - nums[i] == nums[j]) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return null;
    }
}