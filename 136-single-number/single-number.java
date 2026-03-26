class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int op = 0;
        for(int i = 0 ; i< n ; i ++ ){
            op ^= nums[i];
        }
        return op;
    }
}

