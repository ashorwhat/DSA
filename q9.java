public class q9 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                maxCount = Math.max(maxCount, count);
            }else{
                count=0;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int []ar = {1,1,0,1,1,1};
        q9 obj = new q9();
        int result = obj.findMaxConsecutiveOnes(ar);
        System.out.println("The maximum number of consecutive 1s is: " + result);
    }
    
}
