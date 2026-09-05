#PYTHON 

class Solution:
    def containsDuplicate(self, nums):
        return len(nums) != len(set(nums))

# JAVA

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}
