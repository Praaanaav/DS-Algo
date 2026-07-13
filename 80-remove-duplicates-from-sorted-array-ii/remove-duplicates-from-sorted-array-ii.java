class Solution {

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int a = 2;
        
        for (int i = 2; i < n; i++) {
            
            if(nums[a-2] != nums[i]){
                nums[a++] = nums[i];
            }

        }
        return a;
    }
}
