class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        if(hour <= dist.length - 1){
            return -1;
        }
        int left = 1;
        int right = 10_000_000;
        while(left <= right){
            int mid = left + (right - left) / 2;
            double time = 0;
            for(int i = 0; i < dist.length - 1; i++){
                time += Math.ceil((double) dist[i]/mid);
            }
            time += (double) dist[dist.length - 1]/mid;
            if(time <= hour){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}