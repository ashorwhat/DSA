public class q4 {
    static int  removeduplicates(int []ar){
        int n = ar.length;
        if (n==0 || n==1){
            return n;
        }
        int i=0;
        for(int j=1;j<n-1;j++){
            if(ar[i]!=ar[j]){
                i++;
                ar[i]= ar[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int []arr = {1, 2, 2, 3, 4, 4, 5};
        int length = removeduplicates(arr);
        System.out.println("Array after removing duplicates:");
        for(int i=0;i<length;i++){
            System.out.print(arr[i] + " ");
    }
    
}
}
