class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] prefix = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++){
            prefix[i+1] = prefix[i] ^ arr[i];
        }
        int[] result = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            int left = queries[i][0];
            int right = queries[i][1];
            result[i] = prefix[right+1] ^ prefix[left];
        }
        return result;
    }
}