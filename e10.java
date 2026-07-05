public class e10 {
    public static int consecutive_one(int[]ar){
        int i=0;
        int count =0;
        int max_c =0;
        for(int j=0;j<ar.length;j++){
            if(ar[j]==1) i=j;
            break;
        }
        for(int j=i;j< ar.length;j++){
            if(ar[j]==1) {
                count++;
                max_c = Math.max(max_c,count);
            }
            else count=0;
        }
        return max_c;
    }
    public static void main(String[] args) {
        int []n = {1,1,1,0,0,1,1};
        int res = consecutive_one(n);
        System.out.println(res);
    }
}
