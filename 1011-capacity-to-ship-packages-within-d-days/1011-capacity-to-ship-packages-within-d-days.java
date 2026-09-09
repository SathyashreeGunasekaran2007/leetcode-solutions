class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int minc = 0;
        for(int i = 0; i < weights.length; i++){
            if(minc < weights[i]){
                minc = weights[i];
            }
        }
        int maxc = 0;
        for(int i = 0; i < weights.length; i++){
            maxc += weights[i];
        }
        int left = minc;
        int right = maxc;
        while(left < right){
            int mid = left + (right - left) / 2;
            int currweight = 0;
            int requiredays = 1;
            for(int weight : weights){
                if(currweight + weight > mid){
                    requiredays++;
                    currweight = 0;
                }
                currweight += weight;
            }
            if(requiredays <= days){
                    right = mid;
            }else{
                    left = mid + 1;
            }
        }
        return left;
    }
}