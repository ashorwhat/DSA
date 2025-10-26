public class Q3 {
    public static boolean isSorted(int []ar){
        for(int i=0;i<ar.length;i++){
            if(ar[i]>ar[i+1]){
                return false;
            }   
        }
        return true;

    }

    public static void main(String[] args) {
        int []arr = {1, 2, 3, 6, 5};
        boolean result = isSorted(arr);
        System.out.println("Is the array sorted? " + result);
    }

    }
    

