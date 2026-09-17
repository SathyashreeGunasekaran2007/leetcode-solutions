class Solution {
    int max = 0;
    public int maximumGood(int[][] statements) {
        int n = statements.length;
        int[] people = new int[n];
        solve(statements,people,0);
        return max;
    }
    void solve(int[][] statements, int[] people, int index){
        if(index == people.length){
            if(valid(statements,people)){
                int count = 0;
                for(int x : people){
                    if(x == 1){
                        count++;
                    }
                }
                max = Math.max(max,count);
            }
            return;
        }
        people[index] = 0;
        solve(statements,people,index+1);
        people[index] = 1;
        solve(statements,people,index+1);
    }
    boolean valid(int[][] statements, int[] people){
        for(int i = 0; i < people.length; i++){
            if(people[i] == 1){
                for(int j = 0; j < people.length; j++){
                    if(statements[i][j] == 0 && people[j] == 1){
                        return false;
                    }
                    if(statements[i][j] == 1 && people[j] == 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }

}