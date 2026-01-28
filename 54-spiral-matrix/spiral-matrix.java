class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return result;

        int sr = 0, sc = 0;
        int er = matrix.length - 1, ec = matrix[0].length - 1;

        while (sr <= er && sc <= ec) {
            for (int i = sc; i <= ec; i++) {
                result.add(matrix[sr][i]);
            }
            sr++;

            for (int i = sr; i <= er; i++) {
                result.add(matrix[i][ec]);
            }
            ec--;

            if (sr <= er) {
                for (int i = ec; i >= sc; i--) {
                    result.add(matrix[er][i]);
                }
                er--;
            }

            if (sc <= ec) {
                for (int i = er; i >= sr; i--) {
                    result.add(matrix[i][sc]);
                }
                sc++;
            }
        }
        return result;
    }
}
