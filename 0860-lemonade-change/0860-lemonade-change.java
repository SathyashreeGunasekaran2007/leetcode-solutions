class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;
        for(int i : bills){
            if(i == 5){
                fives++;
            }else if(i == 10){
                if(fives == 0){
                    return false;
                }
                fives--;
                tens++;
            }else{
                if(tens > 0 && fives > 0){
                    tens--;
                    fives--;
                }else if(fives >= 3){
                    fives -= 3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}