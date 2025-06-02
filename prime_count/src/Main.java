public class Main{
    public static boolean isPrime(int n){
        if (n<=1) return  false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=3;i*i<=n;i+=2){
            if (n%i == 0) return false;
        }
        return true;
    }
    public static int primeCount(int start,int end ){
      int count=0;
      for (int i=start;i<end+1;i++){
          if (isPrime(i)){
              count+=1;
          }
      }
      return count;
    }
  public static void main(String[] args){
    System.out.println(primeCount(10,30));
  }
}
