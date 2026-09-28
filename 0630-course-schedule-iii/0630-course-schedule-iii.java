class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a,b) -> a[1] - b[1]);
        int totalTime = 0;
        List<Integer> selected = new ArrayList<>();
        for(int[] course : courses){
            int duration = course[0];
            int endDay = course[1];
            totalTime += duration;
            selected.add(duration);
            if(totalTime > endDay){
                int maxIndex = 0;
                for(int i = 1; i < selected.size(); i++){
                    if(selected.get(i) > selected.get(maxIndex)){
                        maxIndex = i;
                    }
                }
                totalTime -= selected.get(maxIndex);
                selected.remove(maxIndex);
            }
        }
        return selected.size();
    }
}