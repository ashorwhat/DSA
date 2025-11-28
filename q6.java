public class q6 {
    public static void main(String[] args) {
        int []ar = {1,4,6,0,8,0,7,5,0};
        int j=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]==0){
                j=i;
                break;
            }
        }
        for(int i =j+1;i<ar.length;i++){
            if(ar[i]!=0){
                ar[j]=ar[i];
                j++;
            }
        }
        while(j<ar.length){
            ar[j]=0;
            j++;
        }
        for(int x : ar){
            System.out.print(x + " ");
        }
    }
    
}
