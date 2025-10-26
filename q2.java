public class q2 {
    public static int secondLarger(int []ar){
        int l= ar[0];
        int sl= Integer.MIN_VALUE;
        for (int i =0;i<ar.length;i++){
            if(ar[i]>l){
                sl= l;
                l= ar[i];
            }
            else if(ar[i]<l && ar[i]>sl){
                sl= ar[i];
            }
        }
        return sl;
    }
    public static void main(String[] args) {
        int []arr = {3, 5, 7, 2, 8, -1};
        int result = secondLarger(arr);
        System.out.println("The second largest element in the array is: " + result);
    }
    
}
