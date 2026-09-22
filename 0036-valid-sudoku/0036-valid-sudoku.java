class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char c = board[i][j];
                if(c != '.'){
                    String row = c + "row" + i;
                    String col = c + "col" + j;
                    String box = c + "box" + i/3 + j/3;
                    if(set.contains(row)){
                        return false;
                    }
                    if(set.contains(col)){
                        return false;
                    }
                    if(set.contains(box)){
                        return false;
                    }
                    set.add(row);
                    set.add(col);
                    set.add(box);
                }
            }
        }
        return true;
    }
}