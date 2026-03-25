class Solution {

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;

        long sum = 0;
        long sumsq = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += grid[i][j];
                sumsq += (long) grid[i][j] * grid[i][j]; // FIX
            }
        }

        long expsum = (long) size * (size + 1) / 2;
        long expsumsq = (long) size * (size + 1) * (2 * size + 1) / 6;

        long diff = expsum - sum;
        long diffsumsq = expsumsq - sumsq;

        long sumxy = diffsumsq / diff;

        long missing = (diff + sumxy) / 2;
        long repeated = missing - diff;

        return new int[] { (int) repeated, (int) missing };
    }
}
