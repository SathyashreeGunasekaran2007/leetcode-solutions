class Solution {
    public void sortColors(int[] arr) {
        int left = 0;
        int mid = 0;
        int right = arr.length - 1;
        while (mid <= right) {
            if (arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[right];
                arr[right] = temp;
                right--;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[left];
                arr[left] = temp;
                left++;
                mid++;
            }

        }
    }
}