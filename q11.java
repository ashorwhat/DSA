//Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. If no such sub-array exists, return 0.
public class q11 {
    public int longestSubarray(int[] nums, int k) {
        int maxLength = 0;
        for (int start = 0; start < nums.length; start++) {
            int sum = 0;
            for (int end = start; end < nums.length; end++) {
                sum += nums[end];
                if (sum == k) {
                    maxLength = Math.max(maxLength, end - start + 1);
                }
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] ar = {1, -1, 5, -2, 3};
        int k = 3;
        q11 obj = new q11();
        int result = obj.longestSubarray(ar, k);
        System.out.println("The length of the longest sub-array is: " + result);
    }
}
