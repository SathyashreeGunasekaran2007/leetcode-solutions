class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int x : nums1){
            set1.add(x);
        }
        for(int x : nums2){
            set2.add(x);
        }
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        for(int x : set1){
            if(!set2.contains(x)){
                first.add(x);
            }
        }
        for(int x : set2){
            if(!set1.contains(x)){
                second.add(x);
            }
        }
        ans.add(first);
        ans.add(second);
        return ans;
    }
}