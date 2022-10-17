package 백준;
import java.util.*;
public class back2309 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[]=new int[9];
        int sum=0;
        int k=0;
        int l=0;
        for(int i=0;i<9;i++){
            arr[i]=scanner.nextInt();
            sum+=arr[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(sum-arr[i]-arr[j]==100){
                    k=i;
                    l=j;
                    break;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(i==k||i==l){
                
            }else{
                System.out.println(arr[i]);
            }           
        }
    }
}
