class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int freq[] = new int[(n * n) + 1];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                freq[grid[i][j]]++;
            }
        }
        int rep = -1, mis = -1;
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == 2)
                rep = i;
            if (freq[i] == 0)
                mis = i;
        }
        return new int[] { rep, mis };
    }
} 