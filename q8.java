public class q8 {

    public  int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        int new_sum = 0;
        for(int i =0;i<n;i++){
            new_sum += nums[i];
        }
        return sum - new_sum;

    }
    public static void main(String[] args) {
        int []ar = {0,1,2,3,4,6,7};
        q8 obj = new q8();
        int missing = obj.missingNumber(ar);
        System.out.println("The missing number is: " + missing);

    }
    
}
