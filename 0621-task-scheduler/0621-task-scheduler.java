class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(char c : tasks){
            freq[c - 'A']++;
        }
        int maxfreq = 0;
        for(int f : freq){
            maxfreq = Math.max(maxfreq,f);
        }
        int maxFreqCount = 0;
        for(int f : freq){
            if(f == maxfreq) maxFreqCount++;
        }
        int optSol = (maxfreq - 1) * (n + 1) + maxFreqCount;
        return Math.max(tasks.length,optSol);
    }
}