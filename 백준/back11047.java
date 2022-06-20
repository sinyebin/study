package 백준;
import java.util.*;
public class back11047 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int arr[]=new int[n];
        int answer=0;
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            if(k==0){
                break;
            }
            if(k/arr[i]>0){
                answer+=k/arr[i];
                k=k%arr[i];
            }

        }
        System.out.println(answer);
    }
}
