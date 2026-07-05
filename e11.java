class e11 {
    public int singleNumber(int[] nums) {
          
        int res = 0;

        for (int n : nums) {
            res ^= n;
        }

        return res;        
    
    }
    public static void main(String[] args) {
        int []ar = {4,1,2,1,2};
        e11 obj = new e11();
        int result = obj.singleNumber(ar);
        System.out.println("The single number is: " + result);
    }
}