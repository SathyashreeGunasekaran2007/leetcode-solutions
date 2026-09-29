class Solution {
    public int[][] reconstructQueue(int[][] people) {
        //Sort the k value and place it based on the index value
        Arrays.sort(people,(a,b) -> a[0]!=b[0] ? Integer.compare(b[0],a[0]) : Integer.compare(a[1],b[1]));//If both are not same sort based on the index value else sort based on height
        //after sorting [[7,0],[7,1],[6,1],[5,0],[5,2],[4,4]]
        List<int []> result = new ArrayList<>();
        for(int[] p : people){
            result.add(p[1],p);//p = [7,0] ---> add(p[1],p) ===> p[1] = 0 --> add(0.[7,0])
        }
        return result.toArray(new int[people.length][]);
    }
}
//0th index represents the height of a person
//1st index represents the no of people in front and it must be >= height