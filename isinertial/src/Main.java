public class Main{
    public static int isInertial(int a[]){
        if(a.length<1)return 0;
       int max_value=Integer.MIN_VALUE;
       boolean oddExists=false;
       int min_odd=Integer.MAX_VALUE;
       for(int i=0;i<a.length;i++){
           if (a[i]>max_value){
               max_value=a[i];
           }
           if (a[i]%2!=0) {
               oddExists=true;
           if (a[i]<min_odd){
               min_odd=a[i];
           }
           }

       }
       if (max_value%2!=0 || !oddExists) return 0;
       for (int i=0;i<a.length;i++){
           if(a[i]%2==0 && a[i]!=max_value){
               if(a[i]>min_odd){
                   return 0;
               }
           }
       }

       return 1;
    }
    public static void main(String[] args){
        int a[]={1, 1, 1, 1, 1, 1, 2};
        System.out.println(isInertial(a));
    }
}