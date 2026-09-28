class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        int[][] projects = new int[n][2];
        for(int i = 0; i < n; i++){
            projects[i][0] = capital[i];
            projects[i][1] = profits[i];
        }
        Arrays.sort(projects, (a,b) -> a[0] - b[0]);
        PriorityQueue<Integer> maxheap = new PriorityQueue(Collections.reverseOrder());
        int i = 0;
        for(int count = 0; count < k; count++){
            while(i < n && projects[i][0] <= w){
                maxheap.offer(projects[i][1]);
                i++;
            }
            if(maxheap.isEmpty()){
                break;
            }
            w += maxheap.poll();
        }
        return w;
    }
}