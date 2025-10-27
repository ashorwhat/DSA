public class q5 {
    public  void rotate(int []ar, int k){
        int n = ar.length;
        k = k % n; // In case k is greater than n
        reverse (ar,0,n-k-1);
        reverse (ar,n-k,n-1);
        reverse (ar,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(ar[i] + " ");
        }
    }

    public void reverse(int []ar, int start, int end){
        while(start<end){
            int temp = ar[start];
            ar[start]= ar[end];
            ar[end]= temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        q5 obj = new q5();
        obj.rotate(arr, k);
    }
    
}
