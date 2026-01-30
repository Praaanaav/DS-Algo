class Solution {

    public boolean isPalindrome(int x) {
        int a = x;
        if (x < 0) {
            return false;
        }
        int rev = 0;
        while (a > 0) {
            int rem = a % 10;
            rev = rev * 10 + rem;
            a = a / 10;
        }

        return rev == x;
    }
}
