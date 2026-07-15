class Solution {

    public int hIndex(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            if (citations[n - 1 - i] < i + 1) {
                return i;
            }
        }
        return n;
    }
}
