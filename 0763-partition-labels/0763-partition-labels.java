class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> partitions = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            int startIndex = i;
            int endIndex = s.lastIndexOf(s.charAt(startIndex));
            for(int j = startIndex + 1; j <= endIndex; j++){
                int lastIndexNextChar = s.lastIndexOf(s.charAt(j));
                if(lastIndexNextChar > endIndex){
                    endIndex = lastIndexNextChar;
                }
            }
            partitions.add(endIndex - startIndex + 1);
            i = endIndex;
        }
        return partitions;
    }
}