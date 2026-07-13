class Solution {

    public void rotate(int[] nums, int k) {
        int n = nums.length;

        k %= n; /// 3 % 7 = 3 ///
                /// 10 % 7 = 3  " Rotating right by 10 is exactly the same as rotating right by 3. "///

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public void reverse(int nums[], int i, int j) {
        int temp;
        while(i < j) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }
}
