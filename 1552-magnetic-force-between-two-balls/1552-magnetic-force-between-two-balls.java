import java.util.*;
class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int left = 1;
        int right = position[position.length - 1] - position[0];
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(canplace(position, m, mid)){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return right;
    }
     private boolean canplace(int[] position, int m, int mid){
            int balls = 1;
            int last = position[0];
            for(int i = 1; i < position.length; i++){
                if(position[i] - last >= mid){
                    balls++;
                    last = position[i];
                    if(balls == m){
                        return true;
                    }
                }
            }
            return false;
    }
     
}