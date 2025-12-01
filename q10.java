public class q10 {
     public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            boolean isUnique = true;
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i]==nums[j]){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []ar = {4,1,2,1,2,4};
        q10 obj = new q10();
        int result = obj.singleNumber(ar);
        System.out.println("The single number is: " + result);
    }
}
