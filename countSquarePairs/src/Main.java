import java.util.Arrays;
import java.lang.Math;
public class Main{
    public static int isPerfectSquare(int n) {
        int result = (int) Math.sqrt(n);
        if (result*result==n) return 1;
        return 0;
    }
    public static int countSquareParis(int[] a){
      Arrays.sort(a);
      int pairCount=0;
      for(int i=0;i<a.length;i++){
          if (a[i]==0||a[i]<0) continue;
          for(int j=i+1;j<a.length;j++){
              if (a[j]==0||a[j]<0) continue;
              if(isPerfectSquare(a[i]+a[j])==1){
                  pairCount+=1;
              }
          }
      }
      return pairCount;
    }
    public static void main(String[] args){
        int[] a= {9, 0, 2, -5, 7};
       System.out.println(countSquareParis(a));
    }
}