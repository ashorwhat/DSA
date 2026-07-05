public class e12 {
    public static int longest_subarray(int[] ar, int k){
        int l=0;
        for (int i = 0; i < ar.length; i++) {
            int s=0;
            for(int j=i;j<ar.length;j++){
                s+=ar[j];
                if(s==k){
                    l = Math.max(l,j-i+1);
                }
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int []ar = {1,2,5,7,8,9,4,3};
        int res  = longest_subarray(ar, 3);
        System.out.println(res);
    }
}
