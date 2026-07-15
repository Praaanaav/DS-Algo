class Solution {

    public int hIndex(int[] citations) {
        int c = 0;
        int n = citations.length;
        Arrays.sort(citations);
        for (int i = 1; i <= n; i++) {
            if(citations[n-i] >= i){
                c++;
            }else{
                break;
            }
        }
        return c;
    }
}
