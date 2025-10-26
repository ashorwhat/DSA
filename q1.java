public class Q1 {
    public static int larger(int []ar){
        int max = ar[0];
        for(int i=1; i<ar.length; i++){
            if(ar[i]>max){
                max = ar[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int []arr = {3, 5, 7, 2, 8, -1};
        int result = larger(arr);
        System.out.println("The largest element in the array is: " + result);
    }
}