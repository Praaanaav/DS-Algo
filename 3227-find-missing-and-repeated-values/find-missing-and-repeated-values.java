class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;

        int miss = 0;
        int rep = 0;
        for(int num = 1; num<=size ; num++){
            int c = 0;
            for(int i = 0; i< n;i++){
                for(int j =0; j< n; j++){
                    if(grid[i][j]== num){
                        c++;
                    }
                }
            }
            if(c == 0 ){
                miss = num;
            }else if(c == 2){
                rep = num;
            }
        }
        return new int[]{rep,miss};
    }
}