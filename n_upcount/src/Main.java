public class Main{
    public static int nUpCount(int[]a,int n){
        int count=0;
        int prefixSum=0;
        boolean open=false;
        for (int i=0;i<a.length;i++){
            if (prefixSum<=n){
                open=true;
            }
            prefixSum+=a[i];
            if(open && prefixSum>n){
                count+=1;
                open=false;
            }

        }
      return count;
    }
    public static void main(String[] args){
         int[] numbers = {2,3,1,-6,8,-3,-1,2};
        System.out.println(nUpCount(numbers,5));
    }
}