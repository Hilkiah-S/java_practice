

public class Main{
    public static int totalSum(int[] b,int start,int end){
       int sum=0;
       for (int i=start;i<end+1;i++){
           sum+=b[i];
       }
       return sum;
    }
    public static int isMadhavArray(int[] a){
     int target=a[0];
     int left_pointer=1;
     int diff=1;
     int right_pointer=left_pointer+diff;
     while(right_pointer<a.length){
         if (!(target==totalSum(a,left_pointer,right_pointer))){
            return 0;
         }
         left_pointer=right_pointer+1;
         diff+=1;
         right_pointer=left_pointer+diff;

     }


     return 1;

    }
    public static void main(String[] args){
     int [] a = {18, 9, 10, 6, 6, 6} ;
     System.out.println(isMadhavArray(a));
    }
}