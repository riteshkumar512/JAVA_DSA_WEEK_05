package Lecture_08;
//Given an integer array nums, rotate the array to the right by
// k steps, where k is non-negative.
//        Example 1:
//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]
//Explanation:
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]

public class Rotate_array {
    public static void main(String[] args) {
    int [] arr= {1, 2, 3, 4, 5, 6, 7};
    int k=3;
    Rotate(arr,k);
    for (int i=0;i< arr.length;i++){
        System.out.print(arr[i]+" ");
        }
    }
    public static void Rotate(int [] arr,int k) {
        int n = arr.length;
        k = k % n;
        for (int j = 1; j <= k; j++) {
            int item = arr[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                arr[i + 1] = arr[i];
            }
            arr[0] = item;
        }
    }
}
