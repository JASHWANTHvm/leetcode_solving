class Solution {
    public int maximumCount(int[] nums) {
        int posC = 0, negC = 0;
        for (int num : nums) {
            if (num > 0) posC++;
            else if (num < 0) negC++;
        }
        return Math.max(posC, negC);
    }
}