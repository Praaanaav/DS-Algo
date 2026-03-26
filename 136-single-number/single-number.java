class Solution {

    public int singleNumber(int[] nums) {
        int n = nums.length;
        
        int s = 0;

        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    c++;
                }else{
                    continue;
                }
            }
            if (c == 1) {
                s = nums[i];
            }
        }
        return s;
    }
}
