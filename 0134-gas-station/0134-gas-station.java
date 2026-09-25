class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalcost = 0;
        int totalgas = 0;
        for(int i = 0; i < gas.length; i++){
            totalcost += cost[i];
            totalgas += gas[i];
        }
        if(totalgas < totalcost){
            return -1;
        }
        int ind = 0,  total = 0;
        for(int i = 0; i < gas.length; i++){
            total += gas[i] - cost[i];
            if(total < 0){
                total = 0;
                ind = i + 1;
            }
        }
        return ind;
    }
}