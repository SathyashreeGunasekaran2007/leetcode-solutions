import java.util.Arrays;
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int pos = 0;
        for(int j = 0; j < arr2.length; j++){
            for(int i = 0; i < arr1.length; i++){
                if(arr1[i] == arr2[j]){
                    int temp = arr1[pos];
                    arr1[pos] = arr1[i];
                    arr1[i] = temp;
                    pos++;
                }
            }
        }
        Arrays.sort(arr1,pos,arr1.length);
        return arr1;
    }
}