class Solution {
    public int maxProduct(int[] nums) {
        int currentMax = nums[0];
        int currentMin = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int temp = currentMax;

            currentMax = Math.max(nums[i],
                    Math.max(temp * nums[i], currentMin * nums[i]));

            currentMin = Math.min(nums[i],
                    Math.min(temp * nums[i], currentMin * nums[i]));

            result = Math.max(result, currentMax);
        }

        return result;
    }
}
