class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        for (int num : nums) {
            min.add(num);
            if (min.size() > k) {
                min.poll();
            }
        }
        return min.peek();
    }
}