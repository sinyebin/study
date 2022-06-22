package 백준;
import java.util.*;
public class back1654 {
   public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int k=scanner.nextInt();
        int n=scanner.nextInt();
        int []arr= new int[k];
        long max=0;
        for(int i=0;i<k;i++){
            arr[i]=scanner.nextInt();
            if(max<arr[i]){
                max=arr[i];
            }
        }
        max++;
        long min=0;
        long mid=0;
        while(min<max){
            mid=(max+min)/2;
            long count=0;
            for(int i=0;i<arr.length;i++){
                count+=(arr[i]/mid);
            }
            if(count<n){
                max=mid;
            }else{
                min=mid+1;
            }
        }
        System.out.println(min-1);
   } 
}
